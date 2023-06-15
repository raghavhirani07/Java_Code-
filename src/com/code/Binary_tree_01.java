package com.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Binary_tree_01 {


    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class binaryTree {
        static int index = -1;

        public static int getIndex() {
            return index;
        }

        public static void setIndex(int index) {
            binaryTree.index = index;
        }

        public static Node buildTree(int nodes[]) {
            setIndex (getIndex () + 1);
            if (nodes[getIndex ()] == -1) {
                return null;
            }
            Node newNode = new Node (nodes[getIndex ()]);
            newNode.left = buildTree (nodes);
            newNode.right = buildTree (nodes);
            return newNode;
        }

        public static void preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print (root.data + " ");
            preorder (root.left);
            preorder (root.right);
        }

        public static void inorder(Node root) {
            if (root == null) {
                return;
            }
            preorder (root.left);
            System.out.print (root.data + " ");
            preorder (root.right);
        }

        public static void postorder(Node root) {
            if (root == null) {
                return;
            }
            preorder (root.left);
            preorder (root.right);
            System.out.print (root.data + " ");
        }

        public static void levelorder(Node root) {
            if (root == null) {
                System.out.println (" No Node in Tree ");
                return;
            }
            Queue<Node> queue = new LinkedList<> ();
            queue.add (root);
            queue.add (null);
            while (!queue.isEmpty ()) {
                Node currNode = queue.remove ();
                if (currNode == null) {
                    System.out.println ();
                    if (queue.isEmpty ()) {
                        break;
                    } else {
                        queue.add (null);
                    }
                } else {
                    System.out.print (currNode.data + " ");
                    if (currNode.left != null) {
                        queue.add (currNode.left);
                    }
                    if (currNode.right != null) {
                        queue.add (currNode.right);
                    }
                }
            }
        }

        public static int totalnodes(Node root) {
            if (root == null) {
                return 0;
            }
            int left = totalnodes (root.left);
            int right = totalnodes (root.right);

            return (left + right + 1);
        }

        public static int sumofnodes(Node root) {
            if (root == null) {
                return 0;
            }
            int left_sum = sumofnodes (root.left);
            int right_sum = sumofnodes (root.right);
            return (left_sum + right_sum + root.data);
        }

        public static int height(Node root) {
            if (root == null) {
                return 0;
            }
            int leftheight = height (root.left);
            int rightheight = height (root.right);
            return (Math.max (leftheight, rightheight) + 1);
        }

        public static int diameter(Node root) {
            if (root == null) {
                return 0;
            }
            int diameter_left = diameter (root.left);
            int diameter_right = diameter (root.right);
            int diameter_with_root = height (root.left) + height (root.right) + 1;
            return Math.max (diameter_with_root, Math.max (diameter_left, diameter_right));
        }

        public static TreeInfo diameter2(Node root) {
            if (root == null) {
                return new TreeInfo (0, 0);
            }
            TreeInfo left = diameter2 (root.left);
            TreeInfo right = diameter2 (root.right);

            int root_node_height = Math.max (left.height, right.height) + 1;

            int diameter_left = left.diameter;
            int diameter_right = right.diameter;
            int diameter_with_root = left.height + right.height + 1;

            int final_diameter = Math.max (Math.max (diameter_left, diameter_right), diameter_with_root);

            return new TreeInfo (root_node_height, final_diameter);
        }

        public static boolean isSubtree(Node root, Node subroot) {
            //* Here Find root2 into root1
            //* This is condition when Any Tree is null
            //* All sub-root null tree is part of root trees
            if (subroot == null) {
                return true;
            }
            if (root == null) {
                return false;
            }
            if (root.data == subroot.data) {
                if (isIdentical (root, subroot)) {
                    return true;
                }
            }
            return isSubtree (root.left, subroot) || isSubtree (root.right, subroot);
        }

        public static boolean isIdentical(Node root, Node subroot) {
            if (root == null && subroot == null) {
                return true;
            }
            if (root == null || subroot == null) {
                return false;
            }
            if (root.data == subroot.data) {
                return isSubtree (root.left, subroot.left) && isSubtree (root.right, subroot.right);
            }
            return false;
        }

        public static void TopView(Node root)
        {
            Queue<Info> q = new LinkedList<> ();
            HashMap<Integer, Node> map = new HashMap<> ();

            int min = 0;
            int max = 0;
            q.add (new Info (root, 0));
            q.add (null);
            while (!q.isEmpty ()) {
                Info curr = q.remove ();
                if (curr == null) {
                    if (q.isEmpty ()) {
                        break;
                    } else {
                        q.add (null);
                    }
                } else {
                    if (!map.containsKey (curr.horizontal)) {
                        map.put (curr.horizontal, curr.node);
                    }
                    if (curr.node.left != null) {
                        q.add (new Info (curr.node.left, curr.horizontal - 1));
                        min = Math.min (min, curr.horizontal - 1);
                    }
                    if (curr.node.right != null) {
                        q.add (new Info (curr.node.right, curr.horizontal + 1));
                        max = Math.max (max, curr.horizontal + 1);
                    }
                }
            }
            for (int i = min; i <= max; i++) {
                System.out.print (map.get (i).data + " ");
            }
            System.out.println ();
        }

        public static void Klevel(Node root, int level, int K) {
            if(root == null){
                return;
            }
            if (level == K) {
                System.out.print (root.data + " ");
                return;
            }
            Klevel (root.left,level+1,K);
            Klevel (root.right,level+1,K);
        }

        public static Node lowestAncestor(Node root, int u, int v) {
            ArrayList<Node> path1 = new ArrayList<> ();
            ArrayList<Node> path2 = new ArrayList<> ();
            getpath (root,u,path1);
            getpath (root, v, path2);
            int i = 0;
            for (; i < path1.size() && i< path2.size(); i++) {
                if(path1.get (i) != path2.get (i)){
                    break;
                }
            }
            Node lca = path1.get (i-1);
            return lca;
        }

        private static boolean getpath(Node root, int element, ArrayList<Node> path) {
            path.add(root);
            if(root == null){
                return false;
            }
            if(root.data == element){
                return true;
            }
            boolean foundLeft = getpath (root.left,element,path);
            boolean foundRight = getpath (root.right,element,path);
            if(foundLeft || foundRight){
                return true;
            }
            path.remove (path.size() -1);
            return false;
        }

        static class TreeInfo {
            int height;
            int diameter;

            TreeInfo(int height, int diameter) {
                this.height = height;
                this.diameter = diameter;
            }
        }

        static class Info {
            Node node;
            int horizontal;

            public Info(Node node, int horizontal) {
                this.node = node;
                this.horizontal = horizontal;
            }
        }
    }
    public static void main(String[] args) {
        //* Build a tree using given array -1 represent null value
        //* Pre order

        int[] array = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        int[] array2 = {2, 4, -1, -1, 5, -1, -1};
        Node root = binaryTree.buildTree (array);
        binaryTree.levelorder (root);
        //System.out.println (root.data);
        /* System.out.println (root.left.data); */
        /*
                binaryTree.preorder (root);
                System.out.println (" ");
                binaryTree.inorder (root);
                System.out.println (" ");
                binaryTree.postorder (root);
                System.out.println (" ");
         */
        /*
                System.out.println (binaryTree.totalnodes (root));
                System.out.println (binaryTree.sumofnodes (root));
                System.out.println (binaryTree.height (root));
                System.out.println (binaryTree.diameter (root));
                System.out.println (binaryTree.diameter2 (root).diameter);
        */
        /*
                binaryTree.levelorder (root);
                binaryTree.setIndex (-1);
                Node subtree_root = binaryTree.buildTree (array2);
                System.out.println (subtree_root.data);
                binaryTree.levelorder (subtree_root);
                System.out.println (binaryTree.isSubtree (root,subtree_root));
         */


        /* 
                //* Top View Of the Tree
                binaryTree.TopView (root);
         */
        /*
                //* Find the K-level all Element
                binaryTree.Klevel(root,1,2);

         */
        System.out.println (binaryTree.lowestAncestor(root,4, 6).data);

    }
}

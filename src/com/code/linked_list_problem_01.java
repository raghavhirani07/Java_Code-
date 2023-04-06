package com.code;


public class linked_list_problem_01 {


    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data   = data;
            this.next = null;
        }
    }

    public static Node Head;
    public static Node tail;
    public static int size;

//    add(),remove(),print(),search()
    public void addFirst(int data){
        Node newNode = new Node (data);
        size++;
        if (Head == null) {
            Head = tail = newNode;
            return;
        }
        newNode.next =Head;
        Head= newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(Head == null){
            Head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print(){
        Node temp = Head ;
        while(temp != null){
            System.out.print(temp.data+ " ==> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println ("");
    }

    public void add(int index , int data){
        if(index == 0){
            addFirst (data);
            return;
        }
        Node temp = Head;
        size++;
        Node newNode = new Node (data);
        int i =0;
        while(i < index -1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public int removeFirst(){
        if(size ==0){
            System.out.println ("Link List is Empty");
            return Integer.MIN_VALUE ;
        }
        else if(size == 1){
            int val = Head.data;
            Head = tail = null;
            size --;
            return  val;
        }
        int val = Head.data;
        Head = Head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size == 0){
            System.out.println ("Link list is empty");
            return Integer.MIN_VALUE;
        }
        else if (size == 1){
            int val = Head.data;
            Head = tail = null;
            size --;
            return val;
        }
        Node prev = Head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return  val;

    }

    public int linear_search(int key){
        Node temp = Head;
        int index = 0;
        while (temp != null){
            if(temp.data == key){
                return  index;
            }
            temp = temp.next;
            index ++;
        }

        return -1 ;
    }
    public  int recursion_Search ( int key){
        return  helper(Head,key);
    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper (head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;

    }

    public void reverse(){
        Node prev = null;
        Node curr = tail =Head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next =prev;
            prev = curr;
            curr=next;
        }
        Head = prev;
    }

    public void deleteNthfromEnd(int n){
        // calculated size
        int sz = 0;
        Node temp =Head;
        while(temp != null){
            temp = temp.next;
            sz++;

        }
        if(n== sz){
            Head =Head.next;
            return;
        }

        int i =1;
        int iToEnd =sz-n;
        Node prev =Head;
        while ( i < iToEnd){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;

    }
    public Node FindMid(Node Head){
        Node slow =Head;
        Node fast = Head;
        while(fast != null && fast.next != null){
             fast = fast.next.next;
             slow = slow.next;
        }
//        System.out.println (slow);
        return slow;
    }
    public boolean checkPalindrome(){
        //Basic Condition

        if(Head == null || Head.next == null  ){
            return  true;
        }


        //step 1 find the mid
        Node mid = FindMid (Head);

        //step 2 reverse 2nd Mid
        Node prev = null;
        Node curr = mid;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next =prev;
            prev = curr;
            curr = next;
        }

        Node right =prev;
        Node left =Head;


        //step 3 check both part with compare
        while (right != null){
            if(left.data != right.data){
            return  false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String[] args) {
    linked_list_problem_01 l1 = new linked_list_problem_01 ();
        l1.addFirst (15);
        l1.addFirst (16);
        l1.addLast (18);
        l1.addLast (14);
        l1.addLast (2);
        l1.addLast (5);

        l1.add(2,9);
        l1.print ();
        System.out.println (l1.removeFirst ());
        l1.print ();
        System.out.println (l1.removeLast ());
        l1.print ();
        System.out.println (l1.linear_search (9));
        System.out.println (l1.linear_search (10));
        System.out.println (l1.recursion_Search (10));
        System.out.println (size);
        l1.reverse ();
        l1.print ();
        l1.deleteNthfromEnd (3);
        l1.print ();
        l1.addLast (9);
        l1.addLast (14);
        l1.addLast (2);
        System.out.println (l1.checkPalindrome ());
    }

}

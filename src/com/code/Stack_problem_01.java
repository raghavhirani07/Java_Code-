package com.code;

import java.util.ArrayList;
import java.util.Stack;

public class Stack_problem_01 {

    static class StackA {
        static ArrayList<Integer> list = new ArrayList<> ();

        public static boolean isEmpty(){
            return  list.size () == 0;
        }

        //Push

        public  static void push(int data){
            list.add (data);
        }

        //pop

        public  static  int pop(){
            if(isEmpty ()){
                return -1;
            }
            int  top = list.get(list.size () -1);
            list.remove (list.size () -1);
            return top;
        }

        //Peek

        public  static  int peek(){
            if(isEmpty ()){
                return -1;
            }
            int  top = list.get(list.size () -1);
            return top;
        }

    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static class StackB {

        static Node head = null;

        public  boolean isEmpty() {
            return head == null;
        }
        public  Node push(int data){
            Node temp = new Node (data);
            temp.next= head;
            head=temp;
            return head;
        }
        public  boolean pop(){
            if(isEmpty ()){
                System.out.println ("no Element has in stack ");
                return false;
            }
            Node head_that_remove = head;
            head = head.next;
            System.out.println (head_that_remove.data);
            return true;
        }
        public  int peek(){
         if(isEmpty ()){
             return  -1;

         }
         return head.data;
        }


    }

    public static void main(String[] args) {

        //* Stack Implementation Using Array , Arraylist ,LinkList

            //? Using ArrayList

                /*    StackA list = new StackA ();

                    list.push (5);
                    list.push (7);
                    list.push(45);

                    while (!list.isEmpty ()){
                    System.out.println (list.pop());
                    }
                 */

            //? Using LinkList

               /*
                    StackB linkstack = new StackB ();
                    linkstack.push (45);
                    linkstack.push (46);
                    linkstack.push (47);

                    while(!linkstack.isEmpty ()){
                        System.out.println (linkstack.pop ());
                    }
                */

            //? Using FramWork

                 /*   Stack<Integer> stacks = new Stack<Integer> ();
                    stacks.push (45);
                    System.out.println (stacks.pop());
                    System.out.println (stacks.size ());

                  */

    }
}

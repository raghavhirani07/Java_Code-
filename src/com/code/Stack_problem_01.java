package com.code;

import java.util.ArrayList;

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

    static class StackB {
        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        static Node head = null;

        public static boolean isEmpty() {

            return head == null;
        }


    }

    public static void main(String[] args) {

    // Stack Implementation Using Array , Arraylist ,LinkList
    StackA list = new StackA ();
    list.push (5);
    list.push (7);
    list.push(45);

    while (!list.isEmpty ()){
        System.out.println (list.pop());
    }


    }
}

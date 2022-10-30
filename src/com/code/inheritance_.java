package com.code;

public class inheritance_ {
    public static void  main(String[] args) {
        vechicle s1=new car();
        s1.print ();
        s1.hello ();
        //* This is default use of create a object of class
        car s2 = new car ();
        s2.print ();
        vechicle s3 =new vechicle ();
        s3.print ();
    }
   static   class  vechicle{
       void print(){
            System.out.println ("This is Vechicle class method");
        }
        void hello(){
            System.out.println ("Hello World ");
        }
    }
    static  class car extends vechicle{
        void print(){
            System.out.println ("This is Car class Method ");
        }
    }
}

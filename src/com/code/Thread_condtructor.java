package com.code;
class myther extends Thread{
    public myther(String name){
        super(name);
    }
       int i=0;
    @Override
    public void run() {
        while (i <40)
        {
            System.out.println ("I am a thred ");
            i++;
        }
    }

}
public class Thread_condtructor {
    public static void main(String[] args) {
        myther m1=new myther ("Raghav ");
        m1.start ();
        System.out.println ("the Id of the thread is "+m1.getId ());
        System.out.println ("the name of the thread is "+m1.getName ());
    }
}

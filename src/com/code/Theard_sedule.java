package com.code;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable{
    String name;
    Task(String name){
        this.name=name;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 5 ; i++) {
            System.out.println (name+ " -task number - "+ i);
            try {
                Thread.sleep (1000);
            } catch (Exception e) {
                e.printStackTrace ();
            }

        }
        System.out.println ("-----------------"+"Complete the Thread "+"----------------");
    }
}
public class Theard_sedule {
    public static void main(String[] args) {
        Task thread1=new Task ("1");
        Task thread2=new Task ("2");
        Task thread3=new Task ("3");
        Task thread4=new Task ("4");
        Task thread5=new Task ("5");
        ExecutorService pool = Executors.newFixedThreadPool (2);
        pool.execute (thread1);
        pool.execute (thread2);
        pool.execute (thread3);
        pool.execute (thread4);
        pool.execute (thread5 );
        pool.shutdown ();

    }
}

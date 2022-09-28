package com.code;

class mythred1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println ("i am a thread1");
        }

    }
}

class mythred2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println ("i am thred 2");
        }
    }
}
public class Thread_ {
    public static void main(String[] args) {
        mythred1 bullet1 = new mythred1 ();
        Thread gun1 = new Thread (bullet1);
      mythred2 bullet2=new mythred2 ();
      Thread gun2=new Thread (bullet2);

        gun1.start ();
        gun2.start ();

    }
}

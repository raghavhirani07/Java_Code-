package com.code;

class Threads_Example extends Thread {
    static int count = 0;
    String name;

    Threads_Example

            (String name) {
        this.name = name;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Threads_Example

                .count = count;
    }
    @Override
    public void run() {
        while (getCount () < 11) {

            setCount (++count);
            System.out.println ("thread = " + name + "number " + getCount ());
            try {
                sleep (2000);
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
        }
    }
}

public class Theard_practicle {
    public static void main(String[] args) {
        Threads_Example t1 = new Threads_Example ("first ");
        t1.start ();
        Threads_Example t2 = new Threads_Example ("Second ");
        t2.start ();
        Threads_Example t3 = new Threads_Example ("Third ");
        t3.start ();
    }
}

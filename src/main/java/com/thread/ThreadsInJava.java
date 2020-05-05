package com.thread;

public class ThreadsInJava {

    public static void main(String[] args) throws InterruptedException {
        Thread1 t1=new Thread1();
        t1.start();
        Thread.sleep(2000);
        Thread2 t2=new Thread2();
        t2.start();
    }
}

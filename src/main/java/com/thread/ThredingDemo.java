package com.thread;

public class ThredingDemo extends Thread {

    @Override
    public  synchronized void  run() {
         for(int i=0;i<=20;i++){
             System.out.println(i);

         }
    }

    public static void main(String[] args) throws InterruptedException {
        ThredingDemo t1=new ThredingDemo();
        t1.start();
      //  t1.join();
        ThredingDemo t2=new ThredingDemo();
        t2.start();
    }
}

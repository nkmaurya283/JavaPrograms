package com.thread;

public class ThreaDLocal {

    public static void main(String[] args) throws InterruptedException {
       // Runnable local= new A();
        Runnable local= new C();
        Thread t=new Thread(local);
        Thread t1=new Thread(local);
        t.start();
        t.join();
        t1.start();
        t1.join();

    }
}
class C implements Runnable{
    private ThreadLocal<B>  threadLocal=ThreadLocal.withInitial(B::new);
    /*private ThreadLocal  threadLocal1=new ThreadLocal<>();
    threadLocal1.*/



    @Override
     public void run() {

        for(int i=0;i<5;i++){
           threadLocal.get().increment();

        }
        System.out.println(threadLocal.get().getCounter());

    }
}

class A implements Runnable{

    B c=new B();
    @Override
    synchronized public void run() {

        for(int i=0;i<5;i++){
           c.increment();

        }
        System.out.println(c.getCounter());

    }
}

class B {
   private int counter=0;

    void increment(){
        counter=counter +1;

    }
    int getCounter(){
        return counter;
    }

}

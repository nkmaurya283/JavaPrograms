package com.thread;

public class Thread1 extends Thread {
    @Override
    public void run(){
        for(int i = 101; i <= 200; i++)
        {
            System.out.println(i);
        }
    }
}

package com.random;

public class D extends A{
     int x=10;
      D(){

        System.out.println("i static"+x);
        x++;
    }

    public static void main(String[] args) {
      D d0=new D();
      D d1=new D();
      D d2=new D();

     // d.z();
      //D.f();

    }

    @Override
    public void b() {

    }

}

package com.random;



public class ObjectDemo {

    public static int method(Object object){
        int sum=0;
        int[] arr=(int[])object;
      for(int i=0;i<arr.length;i++){
          sum=sum+arr[i];
      }
    return sum;

    }

    public static void main(String[] args) {
       int[] z={1,2,3};
      int y=method(z);
        System.out.println(y);

    }
}

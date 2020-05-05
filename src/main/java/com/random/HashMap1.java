package com.random;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMap1 {

   /* static void findDuplicatesUsingHashMap(int[] inputArray){
        for (int element:inputArray){
            HashMap<Integer,Integer>  hm=new HashMap<Integer, Integer>();
            if(hm.get(element)==null){
                hm.put(element,1);
            }else {
                hm.put(element,hm.get(element)+1);
            }
        }*/




    public static void main(String[] args) {
       // int x[]={1,2,3,2,1};
//findDuplicatesUsingHashMap(x);
        HashMap<Integer,Integer>  hm=new HashMap<Integer, Integer>();
       // hm.get(1);
        System.out.println(hm.get(1));
        if(hm.get(1)==null){
            hm.put(1,1);
        }
        System.out.println(hm.get(1));
        //ArrayList
    }
}

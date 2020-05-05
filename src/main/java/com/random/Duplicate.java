package com.random;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Duplicate {

    public static void duplicate(int[] x){

        HashMap<Integer,Integer> hm=new HashMap<>();

        for (int y:x){
            if(hm.containsKey(y)){
                hm.put(y,hm.get(y)+1);
            }else {
                hm.put(y,1);
            }
        }
        //Set<Integer> st=new HashSet<>() ;
        for(Map.Entry<Integer, Integer> ch:hm.entrySet()){
            if(ch.getValue()>1){
                System.out.println(ch.getKey());
            }
        }


        //System.out.println(hm.toString());
    }

    public static void main(String[] args) {
        int[] x= {1,2,3,5,3,2,1};
        duplicate(x);
    }
}

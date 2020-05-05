package com.random;

import java.util.HashMap;
import java.util.Map;

public class HAshmap {

    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>();
        for(Integer i=0;i<=10;i++) {

                hm.put(i, "null");

        }
        //System.out.println(hm);
        for (Map.Entry<Integer,String> y:hm.entrySet()){
            System.out.println(y.getKey()+"----------->"+y.getValue());
        }

    }
}

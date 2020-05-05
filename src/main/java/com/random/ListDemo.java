package com.random;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public static List<Integer> list(){

        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3) ;
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list=list();
        for (int x:list){
            System.out.println(x);
        }
    }
}

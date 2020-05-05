package com.random;

import java.util.HashSet;

public class AccessModifier {

    private static void abc(){
        //cant declare local private variable
        //cant declare static local variable
        //cant declare protected local variable

    }
    public static void main(String[] args) {
        String key="vishal";
        int hash=key.hashCode();
        System.out.println(hash);
        int hash1 = (int)key.charAt(0);
        System.out.println("hashCode for key: "
                + key + " = " + hash1);
    }
}

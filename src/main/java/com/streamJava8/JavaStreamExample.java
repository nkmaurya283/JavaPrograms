package com.streamJava8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamExample {

    public static void main(String[] args) {
        List<Filtering> productsList = new ArrayList<Filtering>();
        //Adding Products
        productsList.add(new Filtering(1,"HP Laptop",25000f));
        productsList.add(new Filtering(2,"Dell Laptop",30000f));
        productsList.add(new Filtering(3,"Lenevo Laptop",28000f));
        productsList.add(new Filtering(4,"Sony Laptop",28000f));
        productsList.add(new Filtering(5,"Apple Laptop",90000f));
        List<Float> productPriceList2 =productsList.stream().filter(p->p.price>30000).map(p->p.price).collect(Collectors.toList());
        System.out.println(productPriceList2);
    }

}

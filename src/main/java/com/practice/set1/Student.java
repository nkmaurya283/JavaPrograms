package com.practice.set1;

import java.util.*;

public class Student {
    int id;
    String name;
    public Student(int id,String name) {
        this.id = id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


}

class B{
    public static void main(String[] args) {
        Student student1=new Student(101,"Navneet");
        Student student2=new Student(101,"Abc");
        Set<Student> st=new HashSet<>();
        st.add(student1);
        st.add(student2);

        Iterator iterator=st.iterator();
        while (iterator.hasNext()){
            Student student=(Student)iterator.next();
            System.out.println(student.id+" "+student.name);
        }
    }
}
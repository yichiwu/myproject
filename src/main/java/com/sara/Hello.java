package com.sara;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello world");
        Person p = new Person();
        p.hello();

        p.weight = 66.5f;
        p.height = 1.7f;
        System.out.println(p.bmi());
    }
}




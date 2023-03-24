package com.java.demo.pack;

public class A {

    void m1(){
        m2();
        System.out.println("method m1");
    }

    void m2(){
        System.out.println("Method m2");

    }

    static void m3(){
        System.out.println("Method m3");
        A a = new A();
        a.m1();

    }

    public static void main(String[] args) {
        m3();
    }
}

package com.java.demo.pack;

public class B {

    void m4(){

        System.out.println("Method m4");
    }

    void m5(){

        System.out.println("Method m5");
    }

    static void m6(){
      A.m3();

    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.m1();
        b.m4();
    }


}

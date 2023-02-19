package com.java.demo.pack;

public class FirstProgram {

    void divideNumbers(int num) {
        if (num % 2 == 0)
            System.out.println(num + " is an even number");
        else if(num % 2 <0)
            System.out.println(num + " is negative number");
        else
            System.out.println(num + " is an odd number");
    }

    public static void main(String[] args) {
        FirstProgram fp = new FirstProgram();
        fp.divideNumbers(5);

    }
}

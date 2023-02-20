package com.java.demo.pack;

public class FirstProgram {

    void divideNumbers(int num) {
        if (num % 2 == 0)
            System.out.println(num + " is an even number");
        else if (num % 2 < 0)
            System.out.println(num + " is negative number");
        else
            System.out.println(num + " is an odd number");
    }

    void evenOddRange(int startIndex, int endIndex) {
        for (int index = startIndex; index <= endIndex; index++) {
            if (index % 2 == 0)
                System.out.println(index + " is an Even number");
            else if (index < 0)
                System.out.println(index + " is a negative number");
            else
                System.out.println(index + " is an Odd number");
        }

    }

    void printEvenNumbers(int firstNumber, int lastNumber) {
        for (int index = firstNumber; index <= lastNumber; index++) {
            if (index % 2 == 0) {
                System.out.println(index + " is an even number");

            }

        }
    }

    void divisibleBy3and7(int startIndex, int endIndex) {
        for (int index = startIndex; index <= endIndex; index++) {
            if (index % 3 == 0 && index % 5 == 0)
                System.out.println(index + " is divisible by 3 & 5 ");
            else if (index % 3 == 0)
                System.out.println(index + " is divisible by 3");
            else if (index % 5 == 0)
                System.out.println(index + " is divisible by 5");
            else
                System.out.println(index + " is not divisible by 3 & 5");

        }

    }


    void printHashAndColon(int startIndex, int endIndex, String name) {
        for (int index = startIndex; index <= endIndex; index++) {
            if (index % 2 == 0)
                System.out.println(name + "-" + index);
            else
                System.out.println(name + ":" + index);
        }

    }

    void reverseForLoop(String name) {
        for (int index = 10; index >= 0; index--) {
            System.out.println(name + "-" + index);

        }

    }

    public static void main(String[] args) {
        FirstProgram fp = new FirstProgram();
        fp.divideNumbers(5);
        fp.divisibleBy3and7(1,10);
        fp.evenOddRange(1,10);
        fp.printEvenNumbers(1,10);
        fp.reverseForLoop("Aniket");

    }
}

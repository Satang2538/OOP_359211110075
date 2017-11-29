package ooplab3;

public class TestCondition {
    public static void main(String[] args) {
        // if
        int x = 10, y = 20;
        if (x > y)
            System.out.println("x less than y");
        System.out.println("OOP");
//  if-else
        x = 30;
        if (x < y)
            System.out.println("x less than y");
        else
            System.out.println("x more than y");
//  if-else-if
        if (x < 30)
            System.out.println("x less than y");
        else if (x < 30)
            System.out.println("x more than 30");
        else
            System.out.println("x equal 30");

    }//main
}//class

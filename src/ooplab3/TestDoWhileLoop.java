package ooplab3;

import java.util.Scanner;

public class TestDoWhileLoop {
    public static void main (String[] args){
        //do while
        int n=1;
        do {

            //Statement
            System.out.print(n+" ");
        } while (++n <= 10);
        //correct password
        int pin = 1234;
        int count = 0;
        int input;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter your password :");
            input = scanner.nextInt();
            count++;
            if (count ==pin){
                System.out.println("Your password is correct.");
                break;
            }
            if (count ==3){
                System.out.println("System Error");
                break;
            }


        }while (input != pin);


    }//main
}//class

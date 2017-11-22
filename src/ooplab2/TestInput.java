package ooplab2;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestInput {
    public static void main (String[] args) throws IOException {
//          BufferedReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//          Input Data by using BufferedReader
        System.out.println("What is your name?: ");
        String name = reader.readLine();
        System.out.println("Your name is"+name);
        System.out.println("How old are you?: ");
        int age = Integer.parseInt(reader.readLine());
        System.out.println("You are "+age+"years old.");

//        Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Where are you from?: ");
        String address = scanner.nextLine();
        System.out.println("You came from "+address);
        System.out.print("What is your weinght?: ");
        double weight = scanner.nextDouble();
        System.out.println("Your weight: "+weight);
    }//main
}// class

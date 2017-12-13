package ooplab5;

import java.util.Scanner;

public class Array2D {

    public static void main (String[] args){
//          array 2D
        Scanner scanner = new Scanner(System.in);
        int number[][] = new  int[2][3];
        for (int i=0;i<number.length;i++){
            for (int j=0;j<number[i].length;j++){
                System.out.print("Enter an integer: ");
                number[i][j] = scanner.nextInt();
            }//for j
        }//for i
        showArray(number);

    }//main

    private static void showArray(int[][] number) {
        System.out.println("Data in Array: ");
        for (int i=0;i<number.length;i++){
            for (int j=0;j<number[i].length;j++){
                System.out.print(number[i][j]+" ");
            }//for j
            System.out.println();
        }//for i


    }//showArray

}//class

//condition
//        score 0-49 grad F
//        score 50-59 grad D
//        score 60-69 grad C
//        score 70-79 grad B
//        score 80-100 grad A
package ooplab3;

import java.util.Scanner;

public class CalGrade {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int score;
        System.out.print("Enter your score");
        score = scanner.nextInt();
//        test condition score
     if (score < 49) System.out.println("Your grad is F");
     else if(score < 59) System.out.println("Your grad is D");
     else if(score < 69) System.out.println("Your grad is C");
     else if(score < 79) System.out.println("Your grad is B");
     else System.out.println("Your grad is A");
    }//main
}//class

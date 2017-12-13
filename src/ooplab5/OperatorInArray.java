package ooplab5;

public class OperatorInArray {
    public static void main(String[] args){
        int number[] = {1, 2, 3, 4, 5};
        String msg[] = {"cat", "Dog", "Bird"};
        System.out.println(msg.length);
        int number2[] = {1, 2, 3};
        number2 = number;

        for (int i=0;i<number2.length;i++)
            System.out.print(number2[i]+" ");

        int number3[] = {1, 2, 3, 4, 5};
        if (number==number2)
            System.out.println("Yes");
        else System.out.println("No");
        number[4] = 500;
        System.out.println(number2[4]);







    }//main
}//class

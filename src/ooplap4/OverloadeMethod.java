package ooplap4;

public class OverloadeMethod {
    public static int number =100;
    public static void Summation (int x, int y) {
        System.out.println(x + y);
        int t = number + x + y;
    }

    public static void Summation () {
        System.out.println("Hello"+number);
    }
    public static void Summation (int x, int y,int z) {
        System.out.println(x+y+z+number);
    }

    public static void main(String[] args) {
        Summation ();
        Summation(10,10);
        Summation(5,5,5);


    }//main
}//class


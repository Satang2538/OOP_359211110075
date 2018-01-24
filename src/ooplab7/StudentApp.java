package ooplab7;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args){
        //create object as Student
        //default constructor
        Student s1 = new Student();
        s1.setId("001");
        s1.setName("Boy Saiyai");
        s1.setAddress("109 M.2 T.Thamyai A.Thungsong");
        s1.setGender("Male");

        System.out.println(s1.getName());
        System.out.println(s1.getGender());

        System.out.println(s1.toString());

        Student s2 = new Student("002","Girl Saiyai","11/11 T.Tawang A.Muang","Female");
        System.out.println(s2.toString());

        s2.setName("Girl Shongkla");
        System.out.println(s2.toString());
        //user assign data to object
        Student s3 = new Student();
        s3 = inputData(s3);
        System.out.println(s3.toString());
    }
    private static Student inputData(Student s) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a student info: ");
        System.out.print("Student ID: ");
        s.setId(scanner.nextLine());
        System.out.print("Name: ");
        s.setName(scanner.nextLine());
        System.out.print("Address: ");
        s.setAddress(scanner.nextLine());
        System.out.print("Gender: ");
        s.setGender(scanner.nextLine());
        return s;
    }//inputData
}//class

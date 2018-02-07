package ooplap9;

import jdk.nashorn.internal.scripts.JO;

public class myPersonApp {
    public static void main(String[] args) {
        Address address = new Address("126/3", "Nakhonsritammarad", "80120");
        Job job = new Job("Student",8000);
        Person person = new Person("001","Wichittrapon",address,job);
        System.out.println(person.toString());


    }//main
}//class

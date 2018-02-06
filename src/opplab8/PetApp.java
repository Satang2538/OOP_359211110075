package opplab8;

public class PetApp {
    public static void maim (String[] args){
        Dog dog = new Dog("Chayen",2);
        System.out.println(dog.toString());
        dog.makeNoise();
    }
}

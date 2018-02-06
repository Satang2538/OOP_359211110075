package opplab8;

public class Dog extends Pet  {
    public Dog(String name, int age) {
        super(name,age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Box Box !!!");
    }
}
package opplab8;

public class Employee extends Person {
    private String position;
    private int salary;

    public Employee(String name, String gender, String dateofBirth, int age,String position, int salary) {
        super(name, gender, dateofBirth, age);
        this.position = position;
        this.salary = salary;
    }
    //toString

    @Override
    public String toString() {
        return "Employee{" +
                "position='" + position + '\'' +
                ", salary=" + salary +
                "} " + super.toString();
    }

    //getter and setter method
    public String getPosition() {
        return position;
    }public void setPosition(String position) {
        this.position = position;
    }public int getSalary() {
        return salary;
    }public void setSalary(int salary) {
        this.salary = salary;
    }


}//class

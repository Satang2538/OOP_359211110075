package ooplap9;

public class Job {
    private String position;
    private double salary;

    public Job(String position, double salary) {
        this.position = position;
        this.salary = salary;
    }
    //getter and setter

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //tostring

    @Override
    public String toString() {
        return "Job{" +
                "position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}

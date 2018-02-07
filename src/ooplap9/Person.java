package ooplap9;

public class Person {
    private String personID;
    private String name;
    private Address address;
    private Job job;

    public Person(String personID, String name, Address address, Job job) {
        this.personID = personID;
        this.name = name;
        this.address = address;
        this.job = job;
    }

    //tostring

    @Override
    public String toString() {
        return "Person{" +
                "personID='" + personID + '\'' +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", job=" + job +
                '}';
    }

    //getter and setter
    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }
}//class

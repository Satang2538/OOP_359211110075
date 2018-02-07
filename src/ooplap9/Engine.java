package ooplap9;

public class Engine {
    private String size;
    private String type;

    public Engine(String size, String type) {
        this.size = size;
        this.type = type;
    }
    //toString()

    @Override
    public String toString() {
        return "Engine{" +
                "size='" + size + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    //getter and setter methods

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

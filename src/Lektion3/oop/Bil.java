package Lektion3.oop;

public class Bil {

    // Variables
    private String model;
    private int price;
    private String color;
    private int buildYear;
    private int speed;

    // Default Constructor
    public Bil() {
        this.speed = 0; // Initializes speed to zero
    }

    // Parameterized Constructor
    public Bil(String model, int price, String color, int buildYear) {
        this.model = model;
        this.price = price;
        this.color = color;
        this.buildYear = buildYear;
        this.speed = 0; // Initializes speed to zero
    }

    // Setter Methods
    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBuildYear(int buildYear) {
        this.buildYear = buildYear;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Getter Methods
    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public int getBuildYear() {
        return this.buildYear;
    }

    public int getSpeed() {
        return speed;
    }

    // Methods
    public void start() {
        System.out.println("Din " + getBuildYear() + " " + getColor() + " " + getModel() + " som kostar " + getPrice() + " har startat.");
    }

    public void stop() {
        boolean isStopped = isStopped();

        if (isStopped()) {
            System.out.println("Bilen står redan stilla.");
        } else {
            this.speed = 0;
            System.out.println("Bilen har stoppats.");
        }


    }

    public void accelerate(int increase) {
        setSpeed(getSpeed() + increase);
    }

    public void resetSpeed() {
        this.speed = 0;
    }

    private boolean isStopped() {
        return speed == 0;
    }
}
package Lektion4.Calculator;

public class Calculator {
    private double tal1;
    private double tal2;
    private double sum;

    public Calculator() {
    }

    // Constructs
    public Calculator(double tal1, double tal2) {
        this.tal1 = tal1;
        this.tal2 = tal2;
        this.sum = sum;
    }

    // Set-Methods

    public void setTal1(double tal1) {
        this.tal1 = tal1;
    }

    public void setTal2(double tal2) {
        this.tal2 = tal2;
    }
    // Get-Methods

    public double getSum() {
        return sum;
    }

    // Methods

    public void add(double tal1, double tal2) {
        this.sum = (int) tal1 + tal2;
    }

    public void subtract(double tal1, double tal2) {
        this.sum = (int) tal1 - tal2;
    }

    public void multiply(double tal1, double tal2) {
        this.sum = (int) tal1 * tal2;
    }

    public void divide(double tal1, double tal2) {
        this.sum = tal1 / tal2;
    }

}

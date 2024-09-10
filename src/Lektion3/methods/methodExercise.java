package Lektion3.methods;

public class methodExercise {
    public static void main(String[] args) {
        printGreeting();
        printPersonalGreeting("Linus");
        printSum(10,8);
        int mult = multiplyNumbers(10,10);
        System.out.println(mult);
        String fullName = createFullName("Linus","Holmer");
        System.out.println(fullName);

    }

    static void printGreeting () {
        System.out.println("Välkommen till Java!");
    }

    static void printPersonalGreeting (String name) {
        System.out.println("Hej," +" " +name);
    }

    static void printSum (int sum1, int sum2) {
        System.out.println(sum1+sum2);
    }

    static int multiplyNumbers (int mult1, int mult2) {
        return mult1 * mult2;
    }
    static String createFullName (String firstName, String lastName) {
        return firstName + " " + lastName;
    }

}

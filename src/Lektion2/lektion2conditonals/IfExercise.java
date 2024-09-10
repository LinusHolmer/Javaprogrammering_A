package Lektion2.lektion2conditonals;

public class IfExercise {
    public static void main(String[] args) {
        int age = 19;

        if (age > 18) {
            System.out.println("Du är myndig");
        }

        int score = 90;
        if (score >= 90){
            System.out.println("Du fick betyget A");
        } else if (score >= 80) {
            System.out.println("Du fick betyget B");
        } else if (score >= 70) {
            System.out.println("Du fick betyget C");
        } else {
            System.out.println("Du fick betyget F");
        }
    }
}

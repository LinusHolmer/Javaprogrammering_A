package Lektion4.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num1, num2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Kalkylator");
        System.out.println("Välj: 1. Addition, 2. Subtraktion, 3. Multiplikation, 4. Division");
        double metod = scan.nextDouble();
        Calculator myCalculator = new Calculator();

        switch ((int) metod) {
            case 1:
                System.out.println("Du valde Addition, första talet: ");
                num1 = scan.nextDouble();
                myCalculator.setTal1(num1);
                System.out.println("Andra talet:");
                num2 = scan.nextDouble();
                myCalculator.setTal2(num2);
                myCalculator.add(num1, num2);
                System.out.println(num1 +"+" + num2 +" = "+ (int) myCalculator.getSum());

                break;

            case 2:
                System.out.println("Du valde Subtrakion, första talet: ");
                num1 = scan.nextDouble();
                myCalculator.setTal1(num1);
                System.out.println("Andra talet:");
                num2 = scan.nextDouble();
                myCalculator.setTal2(num2);
                myCalculator.subtract(num1, num2);
                System.out.println(num1 +"-" + num2 +" = "+ (int) myCalculator.getSum());

                break;

            case 3:
                System.out.println("Du valde Multiplikation, första talet: ");
                num1 = scan.nextDouble();
                myCalculator.setTal1(num1);
                System.out.println("Andra talet:");
                num2 = scan.nextDouble();
                myCalculator.setTal2(num2);
                myCalculator.multiply(num1, num2);
                System.out.println(num1 +"*" + num2 +" = "+ (int) myCalculator.getSum());

                break;

            case 4:
                System.out.println("Du valde Division, första talet: ");
                num1 = scan.nextDouble();
                myCalculator.setTal1(num1);
                System.out.println("Andra talet:");
                num2 = scan.nextDouble();
                myCalculator.setTal2(num2);
                myCalculator.divide(num1, num2);
                System.out.println(num1 +"/" + num2 +" = "+ myCalculator.getSum());

                break;

            default:
                System.out.println("Ogiltigt");
                break;
        }
    }
}

package Lektion7.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {

            System.out.println("tal 1:");
            int tal1 = scan.nextInt();

            System.out.println("tal 2:");
            int tal2 = scan.nextInt();

            scan.nextLine();

            System.out.println("add, subtract, multiply or divide?");
            String metod = scan.nextLine();

            Calculator newCalculator = new Calculator();

            System.out.println(newCalculator.calculate(tal1, tal2, metod));


        } catch(ArithmeticException | IllegalArgumentException | InputMismatchException e) {
            System.out.println("Fel input");
    }

        }

    }

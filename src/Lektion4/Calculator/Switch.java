package Lektion4.Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Är klockan mellan 13:00 och 18:00?\n1 = ja, 2 = nej(avslutar programmet)");

            try {
                int input = scan.nextInt();
                if (input == 1) {

                    System.out.println("Är klockan 1, 2, 3, 4, 5 eller 6?");
                    int hour = scan.nextInt();
                    switch (hour) {
                        case 1:
                            System.out.println("13:00");
                            break;

                        case 2:
                            System.out.println("14:00");
                            break;

                        case 3:
                            System.out.println("15:00");
                            break;

                        case 4:
                            System.out.println("16:00");
                            break;

                        case 5:
                            System.out.println("17:00");
                            break;

                        case 6:
                            System.out.println("18:00");
                            break;

                        default:
                            System.out.println("Ogiltig timme");
                            break;
                    }

                } else if (input == 2) {
                    System.out.println("Avslutar...");
                    break;
                } else {
                    System.out.println("Ogiltigt val, försök igen.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ogiltig inmatning. Vänligen ange ett nummer.");
                scan.next();
            }
        }
        scan.close();
    }
}
package Lektion6.scannerUppgift;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        User newUser = new User("Johan","mammapappaknulla123");
        System.out.println("Användarnamn: ");
        String username1 = scan.nextLine();
        System.out.println("Lösenord: ");
        String password1 = scan.nextLine();

        if (Objects.equals(username1, newUser.getUsername()) || Objects.equals(password1, newUser.getPassword())) {
            System.out.println("Du är inloggad");
        } else {
            System.out.println("Fel användarnamn eller lösenord");
        }


        /*
        System.out.println("Hej, skriv in din namn: ");
        String name1 = scan.nextLine();

        System.out.println("Ålder: ");
        int age1 = scan.nextInt();

        scan.nextLine();

        System.out.println("Yrke: ");
        String job1 = scan.nextLine();

        Person newPerson = new Person(name1, age1, job1);
        newPerson.greeting();

        System.out.println("Har du bytt yrke? 1 = ja, 2 = nej");
        int answer = scan.nextInt();

        scan.nextLine();

        if (answer == 1) {
            System.out.println("Till vadå?");
            job1 = scan.nextLine();
            newPerson.setJob(job1);
            newPerson.greeting();
        } else {
            System.out.println("coolt");

        }
        */

    }
}

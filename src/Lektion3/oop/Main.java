package Lektion3.oop;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Person person = new Person("Linus", 19, "Haninge");
        person.introduce();

        person.setName("Johan");
        person.setAge(20);
        person.setCity("Solbulle City");

        System.out.println("Name: " +person.getName());
        System.out.println("Age: " +person.getAge());
        System.out.println("City: " +person.getCity());

        person.introduce();
        */
        /*
        Bil bil = new Bil();
        bil.setModel("Volvo");
        bil.setColor("Gray");
        bil.setBuildYear(1999);
        bil.setPrice(100000);
        bil.start();
        bil.accelerate(10);
        System.out.println("Du kör: "+bil.getSpeed()+" km/h");
        bil.accelerate(10);
        System.out.println("Du kör: "+bil.getSpeed()+" km/h");
        bil.stop();
        System.out.println("Du kör: "+bil.getSpeed()+" km/h");
        bil.stop();
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Längd av cube: ");
        int l = scan.nextInt();
        System.out.println("Bredd av cube: ");
        int b = scan.nextInt();
        System.out.println("Höjd av cube: ");
        int h = scan.nextInt();
        cube myCube = new cube();
        myCube.setLength(l);
        myCube.setWidth(b);
        myCube.setHeight(h);

        if(myCube.getVolume() > 0) {
            System.out.println("Din volym är: " + myCube.getVolume());
        } else {
            System.out.println();
        }
        scan.close();





    }
}

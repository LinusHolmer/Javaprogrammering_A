package Lektion6.scannerUppgift;

public class Person {
    private String name;
    private int age;
    private String job;

    public Person (String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Person(){}

    public void greeting() {
        System.out.println("Namn: " +name +"Ålder: "+age  +"Yrke: " +job);
    }

}

package Lektion3.oop;

public class Person {
    private String name;
    private int age;
    private String city;

    //Constructs
    public Person (String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    //Get and sets
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city = city;
    }

    // Method
    public void introduce() {
        System.out.println("Hej, jag heter " +name +", är "+age +" år gammal och bor i " +city);
    }
}

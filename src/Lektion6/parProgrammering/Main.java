package Lektion6.parProgrammering;

public class Main {
    public static void main(String[] args) {
        Product newProduct = new Product("oreo keps",250);
        Product newProduct2 = new Product("sti mugg",100);
        Product newProduct3 = new Product("sti vatten",10);
        Product[] products = {newProduct, newProduct2, newProduct3};

        Customer newCustomer = new Customer("Linus","linus.holmer@cool.se");

        Order newOrder = new Order(newCustomer, products);
        System.out.println(newOrder.calculateTotal());
        System.out.println(newOrder.billigast(products));
        System.out.println(newOrder.dyrast());
    }
}

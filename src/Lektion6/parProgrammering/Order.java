package Lektion6.parProgrammering;

public class Order {
    Customer customer;
    Product[] products;

    public Order (Customer customer, Product[] products) {
        this.customer = customer;
        this.products = products;
    }
    public double calculateTotal() {
        double total = 0;
        for(Product product: products) {
            total += product.getPrice();
        }
        return total;
    }

    public Product[] getProducts() {
        return products;
    }

    public Customer getCustomer() {
        return customer;
    }
    public double billigast(Product[] products){
        double lowestPrice = Integer.MAX_VALUE;
        for (Product product : products) {
            lowestPrice = Math.min(lowestPrice, product.getPrice());
        }
        return lowestPrice;
    }
    public double dyrast(){
        double highestPrice = 0;
        for (Product product : products) {
            highestPrice = Math.max(highestPrice, product.getPrice());
        }
        return highestPrice;
    }
}

package Lektion9.associationerAggregat;

public class Magazine {
    private Publisher publisher;
    private String name;
    private int price;

    public Magazine(Publisher publisher, String name, int price){
        this.publisher = publisher;
        this.name = name;
        this.price = price;
    }

    // Get-Methods
    public Publisher getPublisher(){
        return publisher;
    }

    //Get-Methods
    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }

    //Set-Methods
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

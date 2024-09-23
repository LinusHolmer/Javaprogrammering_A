package Lektion9.associationerAggregat;

public class Publisher {
    private Magazine magazine;
    private String name;

    public Publisher(Magazine magazine, String name){
        this.magazine = magazine;
        this.name = name;
    }
    //Get-Methods
    public Magazine getMagazine(){
        return magazine;
    }

    public String getName(){
        return name;
    }

    //Set-Methods
    public void setMagazine(Magazine magazine) {
        this.magazine = magazine;
    }

    public void setName(String name) {
        this.name = name;
    }
}

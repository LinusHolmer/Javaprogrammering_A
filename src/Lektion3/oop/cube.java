package Lektion3.oop;

public class cube {
    private int length;
    private int width;
    private int height;
    private int volume;

    public cube(){
        this(0,0,0);
    }

    // Constructor
    public cube(int length, int width, int height){
        this.length = length;
        this.width = width;
        this.height = height;
        updateVolume();
    }

    // set-Methods
    public void setLength(int length){
        if(length > 0){
            this.length = length;
            updateVolume();
        } else {
            System.out.println("Värdet måste vara över 0.");
        }

    }
    public void setWidth(int width){
        if(width > 0){
            this.width = width;
            updateVolume();
        } else {
            System.out.println("Värdet måste vara över 0.");
        }

    }
    public void setHeight(int height){
        if(height > 0){
            this.height = height;
            updateVolume();
        } else {
            System.out.println("Värdet måste vara över 0.");
        }

    }

    // Method to update volume
    private void updateVolume(){
        this.volume = calculateVolume();
    }

    private int calculateVolume(){
        return length * width * height;
    }

    // get-Methods
    public int getLength(){
        return length;
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    public int getVolume(){
        return volume;
    }



}

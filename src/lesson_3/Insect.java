package lesson_3;

public class Insect {
    private int size;
    private String color;

    public Insect(int size, String color){
        this.color = color;
        this.size = size;
    }

    public int getSize(){return size;}

    public void setSize(int size) {this.size = size;}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {this.color = color;}
}

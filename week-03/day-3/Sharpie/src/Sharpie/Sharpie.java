package Sharpie;

public class Sharpie {
    String color;
    double width;
    double inkAmount = 100;

    public void use() {
        this.inkAmount -= 5;
    }

    public Sharpie(String color, double width) {
        this.color = color;
        this.width = width;
        System.out.println(color + ", " + width);
    }
}

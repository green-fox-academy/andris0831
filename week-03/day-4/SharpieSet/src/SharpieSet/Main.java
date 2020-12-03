package SharpieSet;

public class Main {
    public static void main(String[] args) {
        Sharpie pen = new Sharpie("blue", 1.1);
        Sharpie pen2 = new Sharpie("green", 0.4);
        Sharpie pen3 = new Sharpie("yellow", 1.5);
        Sharpie pen4 = new Sharpie("brown", 0.8);
        Sharpie pen5 = new Sharpie("white", 1.6);

        pen.use();
        System.out.println(pen.inkAmount);
    }
}

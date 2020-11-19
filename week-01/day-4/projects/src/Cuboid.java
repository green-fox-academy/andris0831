public class Cuboid {
    public static void main(String[] args) {
        double height = 72.37;
        double length = 5.2;
        double width = 1.594;

        double volume = (int)(2 * ((height * width) + (height * length) + (width * height)));
        double surface = (int)(height * width * length);

        System.out.println("Surface area: " + surface);
        System.out.println("Volume is: " + volume);
    }
}

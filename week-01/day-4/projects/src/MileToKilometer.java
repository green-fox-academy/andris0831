
import java.util.Scanner;

public class MileToKilometer {
    public static void main(String[] args) {
        double changeNumber = 1.6;
        double userInput1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give distance in decimal number in miles!");

        userInput1 = scanner.nextDouble();
        double result = (userInput1 * changeNumber);
        System.out.println("The distance in kilometers is: " + result + "km");

    }
}

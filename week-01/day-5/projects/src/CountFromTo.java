import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        // Create a program that asks for two numbers
        // If the second number is not bigger than the first one it should print:
        // "The second number should be bigger"
        //
        // If it is bigger it should count from the first number to the second by one
        //
        // example:
        //
        // first number: 3, second number: 6, should print:
        //
        // 3
        // 4
        // 5

        System.out.println("Please give two numbers!");

        Scanner scanner = new Scanner(System.in);
        int userInput1 = scanner.nextInt();
        int userInput2 = scanner.nextInt();
        System.out.print("first number: " + userInput1 + ", ");
        System.out.print("second number: " + userInput2 + " ");
        System.out.print("should print: " + "\n");


        if (userInput1 >= userInput2) {
            System.out.println("The second number should be bigger!");
        } else {
            for (int i = userInput1; i < userInput2; i++) {

                System.out.println(i);
                }
            }
        }
    }


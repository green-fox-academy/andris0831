import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Sum {
    // Create the usual class wrapper and main method on your own.

// Write a function called `sum` that returns the sum of numbers from zero to the given parameter


    public static int adding(int par) {
        int[] numbers = new int[par + 1];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        int sum = 0;
        for (int j = 0; j < numbers.length; j++) {
            sum += numbers[j];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(adding(5));
    }
}

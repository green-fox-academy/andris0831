import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class FunctionException {

    public static void divide(int num) {

        try {
        int result = 10 / num;
        System.out.println(result);
        } catch (Exception ex) {
            System.out.println("fail");
        }
    }

    public static void main(String[] args) {

        // Create a function that takes a number
        // divides ten with it,
        // and prints the result.
        // It should print "fail" if the parameter is 0

        divide(0);
    }
}

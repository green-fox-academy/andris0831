import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Doubled {

    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt


        try {

        List<String> words = Files.readAllLines(Paths.get("duplicated-chars.txt"), StandardCharsets.UTF_8);
        String[] arr = new String[words.size()];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


            }
            
        }


    }


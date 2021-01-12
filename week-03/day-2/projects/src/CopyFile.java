import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {

        public static boolean copyFiles() {
            try {
                Path file1 = Paths.get("projects/word.txt");
                Path file2 = Paths.get("projects/word2.txt");
                Files.copy(file1, file2);
            } catch (Exception ex) {
                return false;
            }
            return true;
        }

    public static void main(String[] args) {
        // Write a function that copies the contents of a file into another
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful





    }
}

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static List<String> readFile(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        return Files.readAllLines(path);
    }

    public static List<String> filterWords(List<String> words){
        List<String> filteredWords = new ArrayList<>();
        for (String word : words){
            if(!isShortWord(word, 4) && containsOnlyLowerCaseLetters(word)){
                filteredWords.add(word);
            }
        }

        return filteredWords;
    }

    public static boolean isShortWord(String word, int threshold){
        return word.length() <= threshold;
    }

    public static boolean containsOnlyLowerCaseLetters(String word){
        for (Character c : word.toCharArray()) {
            if(Character.isUpperCase(c) || !Character.isLetter(c)) {
                return false;
            }
        }

        return true;
    }

    public static String getRandomWordToGuess(List<String> words){
        Random random = new Random();
        return words.get(random.nextInt(words.size()));
    }

    public static StringBuilder generateProgressString(String word){
        StringBuilder progress = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            progress.append("_ ");
        }

        return progress;
    }

    public static void drawHangingTree(int mistakeCounter){
        System.out.println("  _____");
        System.out.println("  |   |");
        System.out.println("  |   " + (mistakeCounter > 0 ? "O" : ""));
        System.out.println("  |  " + (mistakeCounter > 3 ? "\\" : " ") + (mistakeCounter > 1 ? "|" : " ") + (mistakeCounter > 4 ? "/" : ""));
        System.out.println("  |   "  + (mistakeCounter > 2 ? "|" : ""));
        System.out.println("  |  "  + (mistakeCounter > 5 ? "/" : " ") + (mistakeCounter > 6 ? " \\" : ""));
        System.out.println("__|__");
        System.out.println();
    }

    public static void drawGameInformation(String progress, List<Character> guessedCharacters){
        System.out.println(progress);
        System.out.print("Already guessed characters: ");
        for(Character c : guessedCharacters){
            System.out.print(c + ", ");
        }
        System.out.println();
    }

    public static Character getUserGuess(){
        Scanner scanner = new Scanner(System.in);

        String input = "";
        do {
            System.out.println("Please enter a character: ");
            input = scanner.next();
        }while (!isUserInputValid(input));


        return input.charAt(0);
    }

    public static boolean isUserInputValid(String input){
        return isShortWord(input, 1) && containsOnlyLowerCaseLetters(input);
    }

    public static boolean updateProgress(Character guessedCharacter, String word, StringBuilder progress){
        boolean found = false;
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == guessedCharacter){
                progress.setCharAt(i * 2, guessedCharacter);
                found = true;
            }
        }

        return found;
    }

    public static boolean isGameOver(String progress, int mistakeCounter){
        return isGameLost(mistakeCounter) || isGameWon(progress);
    }

    public static boolean isGameLost(int mistakeCounter){
        return mistakeCounter >= 7;
    }

    public static boolean isGameWon(String progress){
        return doesProgressContainsUnderscore(progress);
    }

    public static boolean doesProgressContainsUnderscore(String progress){
        for (char c: progress.toCharArray()){
            if(c == '_'){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) throws IOException {

        List<String> words = filterWords(readFile("words.txt"));
        String word = getRandomWordToGuess(words);
        StringBuilder progress = generateProgressString(word);

        int mistakeCounter = 0;
        List<Character> guessedCharacters = new ArrayList<>();

        do {
            drawHangingTree(mistakeCounter);
            drawGameInformation(progress.toString(), guessedCharacters);

            Character guessedCharacter = getUserGuess();
            boolean isSuccessfulGuess = updateProgress(guessedCharacter, word, progress);

            if(!isSuccessfulGuess){
                ++mistakeCounter;
                guessedCharacters.add(guessedCharacter);
            }

        }while(!isGameOver(progress.toString(), mistakeCounter));

        drawHangingTree(mistakeCounter);
        if(isGameLost(mistakeCounter)){
            System.out.println("vesztettel");
        }else if(isGameWon(progress.toString())){
            System.out.println("nyertel");
        }

        System.out.println("The word is: " + word);
    }
}


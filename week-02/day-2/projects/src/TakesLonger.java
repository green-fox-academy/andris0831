public class TakesLonger {
    // When saving this quote a disk error has occurred. Please fix it.
    // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
    // Using pieces of the quote variable (instead of just redefining the string)

    public static void main(String[] args) {

    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

    int num = quote.lastIndexOf("It") + 3;

    String firstPart = quote.substring(0, num);
    String secondPart = quote.substring(num);
    String plus = "always takes longer than ";

    System.out.println(firstPart + plus + secondPart);
    }
}

public class ToDoPrint {
    // Add "My todo:" to the beginning of the todoText
    // Add " - Download games" to the end of the todoText
    // Add " - Diablo" to the end of the todoText but with indention

    // Expected output:

    // My todo:
    //  - Buy milk
    //  - Download games
    //      - Diablo

    public static void main(String[] args) {

    String todoText = " - Buy milk\n";

    String nextThing = " - Download games\n";
    String nextThing2 = " \t- Diablo";

    String newString = todoText.concat(nextThing).concat(nextThing2);

    System.out.println(newString);
    }
}

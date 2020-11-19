public class CodingHours {
    public static void main(String[] args) {

        // Average working hours //
        int a = 6;
        // The length of the semester //
        int b = 17;
        // Days of the working week //
        int c = 5;
        // Average work hours of the week //
        int d = 52;
        // Hours of the week //
        int f = 168;

        System.out.println("Hours " + "spent " + "with " + "coding: " + ((a * b * c)) );
        System.out.println("Percentage" + " of" + " coding" + " hours: " + (((a * b * c) / (b * d)) * 100) + "%");

    }
}

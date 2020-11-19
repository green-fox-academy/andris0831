public class CodingHours {
    public static void main(String[] args) {

        // Average working hours //
        double a = 6;
        // The length of the semester //
        double b = 17;
        // Days of the working week //
        double c = 5;
        // Average work hours of the week //
        double d = 52;
        // Hours of the week //
        double f = 168;

        System.out.println("Hours spent with coding: " + (int)((a * b * c)) );
        System.out.println("Percentage of coding hours: " + (int)(((a * b * c) / (b * d)) * 100) + "%");

    }
}

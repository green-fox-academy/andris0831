public class SecondInADay {
    public static void main(String[] args) {

        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        System.out.println("Remaining seconds of the day: " + ((24 *360) - ((currentHours * 360) + (currentMinutes * 60) + currentSeconds)));
    }
}

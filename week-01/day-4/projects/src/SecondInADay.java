public class SecondInADay {
    public static void main(String[] args) {

        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int hoursSeconds = 14 * 360;
        int hoursMinutes = 34 * 60;


        System.out.println("Remaining seconds of the day: " + ((24 * 360) - hoursSeconds - hoursMinutes  - currentSeconds));
    }
}

public class Bmi {
    public static void main(String[] args) {

        double massInKg = 81.2;
        double heightInM = 1.78;

        double Bmi = (((massInKg) / ((heightInM * 100)) * heightInM) * 100);

        System.out.println("My BMI: " + Bmi);
    }
}

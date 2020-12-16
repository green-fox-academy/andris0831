package exam.exercises.pirates;

public class WarApp {
    public static void main(String[] args) {
        Armada armada1 = new Armada(10);
        Armada armada2 = new Armada(5);
        boolean warResult = armada1.war(armada2);

        if (warResult) {
            System.out.println("The first armada won the war!");
        } else {
            System.out.println("The second armada won the war!");
        }


    }
}

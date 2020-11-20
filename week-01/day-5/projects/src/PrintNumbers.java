public class PrintNumbers {
    public static void main(String[] args) {
        // Create a program that prints all the even numbers between 0 and 500

        int a = 0;

        while (a < 501) {
            if (((a += 1) % 2) == 0) {
                System.out.println(a);
            }
        }
    }
}

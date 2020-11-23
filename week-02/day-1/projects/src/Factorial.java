public class Factorial {
    //  Create the usual class wrapper
    //  and main method on your own.

    // - Create a function called `factorio`
    //   that returns it's input's factorial

    public static int factorio(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * factorio(num - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(factorio(6));
    }
}

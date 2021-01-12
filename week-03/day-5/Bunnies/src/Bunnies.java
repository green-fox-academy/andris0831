public class Bunnies {
    // We have a number of bunnies and each bunny has two big floppy ears.
    // We want to compute the total number of ears
    // across all the bunnies recursively (without loops or multiplication).

   public static int numberOfEars(int bunnies) {
       if (bunnies == 1) {
           return 2;
       } else {
           return 2 + numberOfEars(bunnies - 1);
       }
   }

    public static void main(String[] args) {
        System.out.println(numberOfEars(10));
    }
}

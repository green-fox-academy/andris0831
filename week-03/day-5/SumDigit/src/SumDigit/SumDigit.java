package SumDigit;

public class SumDigit {
    // Given a non-negative integer n, return the sum of it's digits recursively
    // (without loops).
    //
    // Hint
    //
    // Mod (%) by 10 yields the rightmost digit (e.g. 126 % 10 is 6)
    //
    // Divide (/) by 10 removes the rightmost digit (e.g. 126 / 10 is 12).

    public static int addDigits(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n % 10 + addDigits(n / 10);
        }
    }

    public static void main(String[] args) {
        System.out.println(addDigits(1234));
    }
}

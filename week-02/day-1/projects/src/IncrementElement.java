public class IncrementElement {
    // - Create an array variable named `numbers`
//   with the following content: `[1, 2, 3, 4, 5]`
// - Increment the third element
// - Print the third element

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 3) {
                numbers[2]++;
            }
        }
        System.out.println(numbers[2]);
    }
}

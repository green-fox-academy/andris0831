import java.util.Arrays;

public class DiagonalMatrix {
    // - Create (dynamically*) a two dimensional array
    //   with the following matrix**. Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
    // - Print this two dimensional array to the output
    // * length should depend on a variable
    // ** Relax, a matrix is just like an array

    public static void main(String[] args) {
        int x = 4;
        int[][] matrix = new int[x][x];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }

        }
        System.out.println(Arrays.deepToString(matrix));
    }
}


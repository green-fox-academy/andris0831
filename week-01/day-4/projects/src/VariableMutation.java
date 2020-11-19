import java.sql.SQLOutput;

public class VariableMutation {
    public static void main(String[] args) {

        int a = 3;
        a += 10;

        System.out.println(a);

        int b = 100;
        b -= 7;

        System.out.println(b);

        int c = 44;
        c *= 2;

        System.out.println(c);

        int d = 125;
        d /= 5;

        System.out.println(d);

        int e = 8;
        e *= e;

        System.out.println(e);

        int f1 = 123;
        int f2 = 345;

        boolean bigger = f1 > f2;

        System.out.println(bigger);

        int g1 = 350;
        int g2 = 200;

        boolean bigger2 = ((g2 * 2) > g1);

        System.out.println(bigger2);

        int h = 135798745;

        boolean isDivisibleBy11 = (h % 11) == 0;

        System.out.println(isDivisibleBy11);

        int i1 = 10;
        int i2 = 3;

        boolean isTrue = (i1 > (i2^2)) && (i1 < (i2^3));

        System.out.println(isTrue);

        int j = 1521;

        boolean isTrue2 = (j % 3 == 0) || (j % 5 == 0);

        System.out.println(isTrue2);
    }
}

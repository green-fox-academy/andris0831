import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ListIntroduction2 {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();

        listA.add("Apple");
        listA.add("Avocado");
        listA.add("Blueberries");
        listA.add("Durian");
        listA.add("Lychee");

        ArrayList<String> listB = new ArrayList<>();

        listB.addAll(listA);

        System.out.println(listB.size());

        listB.remove(3);

        listA.set(3, "Kiwifruit");

        if (listA.size() == listB.size()) {
            System.out.println("The two array lists are equal!");
        } else if (listA.size() > listB.size()) {
            System.out.println("A is bigger than B");
        } else {
            System.out.println("B is bigger than A");
        }

        int indexNumber = listA.indexOf("Avocado");
        int indexNumber2 = listB.indexOf("Durian");

        System.out.println(indexNumber);
        System.out.println(indexNumber2);

        listB.addAll(Arrays.asList("Passion Fruit", "Pomelo"));

        for (String i : listB) {
            System.out.println(i);
        }

        System.out.println(listA.get(2));
    }
}

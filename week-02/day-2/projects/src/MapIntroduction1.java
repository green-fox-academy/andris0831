import java.util.HashMap;

public class MapIntroduction1 {
    public static void main(String[] args) {

    HashMap<Integer, Character> myMap = new HashMap<>();

        myMap.put(97, 'a');
        myMap.put(98, 'b');
        myMap.put(99, 'c');
        myMap.put(65, 'A');
        myMap.put(66, 'B');
        myMap.put(67, 'C');

        for (Integer i : myMap.keySet()) {
            System.out.println(i);
        }

        for (Character i : myMap.values()) {
            System.out.println(i);
        }

        myMap.put(68, 'D');

        System.out.println(myMap.get(99));

        myMap.remove(97);

        System.out.println(myMap.get(100));

        myMap.clear();

        System.out.println(myMap.size());
    }
}

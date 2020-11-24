import java.util.ArrayList;

public class ListIntroduction1 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("William");
        names.add("John");
        names.add("Amanda");

        System.out.println(names.toString());
        System.out.println(names.get(2));

        for (String i : names) {
            System.out.println(i);

        }for (int i = 0; i < names.size(); i++) {
            System.out.println(i + 1 + ". " + names.get(i));
        }

        names.remove(1);

        for (int i = names.size() - 1; i >= 0; i--) {
            System.out.println(names.get(i));
        }

        names.clear();

        System.out.println(names);
    }
}

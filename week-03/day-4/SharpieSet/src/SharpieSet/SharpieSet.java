package SharpieSet;

import java.util.ArrayList;

public class SharpieSet {
    public ArrayList<Sharpie> sharpies;

    public void countUsable() {
        for (int i = 0; i < sharpies.size(); i++) {
            if (sharpies.get(i).inkAmount > 0) {
                System.out.println("It's usable!");
            }
        }
    }

    public void removeTrash() {
        for (int i = 0; i < sharpies.size(); i++) {
            if (sharpies.get(i).inkAmount < 1) {
                sharpies.remove(i);
            }
        }
    }
}

package Farm;
    //Reuse your Animal class
    //Create a Farm class
    //it has list of Animals
    //                it has slots which defines the number of free places for animals
    //        breed() -> creates a new animal if there's place for it
    //        slaughter() -> removes the least hungry animal

import java.util.ArrayList;
import java.util.List;

public class Farm {
    List<Animal> animals = new ArrayList<>();
    int freePlace;

    public void breed() {
        if (freePlace > 0) {
            animals.add(new Animal());
        }
    }

    public void slaughter() {
        Animal leastHungryAnimal = animals.get(0);
        for (int i = 0; i < animals.size(); i++) {
            if (leastHungryAnimal.hunger < animals.get(i).hunger) {
                leastHungryAnimal = animals.get(i);
            }
        }
        animals.remove(leastHungryAnimal);
    }
}

package GardenApplication;

import java.util.ArrayList;
import java.util.List;

public class Garden {

    List<Plant> plants = new ArrayList<>();

    public void addPlants(Plant plant) {
        plants.add(plant);
    }

    public void addPlantsIfNeedWater(List<Plant> plants, List<Plant> plantsToWater) {
        for (Plant plant : plants) {
            if (plant.doesNeedWater()) {
                plantsToWater.add(plant);
            }
        }
    }

    public List<Plant> plantsToWater(List<Plant> plants) {
        List<Plant> plantsToWater = new ArrayList<>();
        addPlantsIfNeedWater(plants, plantsToWater);
        return plantsToWater;
    }

    public void watering(Integer amount) {
        System.out.println("Watering with " + amount);
        List<Plant> plantsToWater = plantsToWater(plants);
        Double amountForEach = Double.valueOf(amount) / plantsToWater.size();
        for (Plant plant : plants) {
            plant.absorbWater(amountForEach);
        }
    }

    public void gardenWateringStatus() {
        for (Plant plant : plants) {
            plant.needOfWater();
        }
    }


}

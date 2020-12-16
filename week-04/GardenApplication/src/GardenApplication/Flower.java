package GardenApplication;

public class Flower extends Plant {

    public Flower(String color) {
        super(color);
        setType("Flower");
    }

    public Flower() {

    }

    @Override
    public Integer waterLevel() {
        return 5;
    }


    public Double absorbedWaterAmount() {
        return 0.75;
    }


}

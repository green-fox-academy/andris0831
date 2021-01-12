package GardenApplication;

public class Tree extends Plant {

    public Tree(String color) {
        super(color);
        setType("Tree");
    }

    public Tree() {

    }

    @Override
    public Integer waterLevel() {
        return 10;
    }

    public Double absorbedWaterAmount() {
        return 0.4;
    }

}

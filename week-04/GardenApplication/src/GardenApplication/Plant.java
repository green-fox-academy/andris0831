package GardenApplication;

public class Plant {
    protected String color;
    protected Double waterAmount;
    protected String type;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getWaterAmount() {
        return waterAmount;
    }

    public void setWaterAmount(Double waterAmount) {
        this.waterAmount = waterAmount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Plant() {

    }

    public Plant(String color) {
        this.color = color;
        waterAmount = 0.0;
        type = "Plant";
    }

    public Integer waterLevel() {
        return 0;
    }

    public boolean doesNeedWater() {
        if (waterAmount < waterLevel()) {
            return true;
        } else {
            return false;
        }
    }

    public String needOfWater() {
        if (doesNeedWater()) {
            return "The " + color + type + "needs water";
        } else {
            return "The " + color + type + "doesn't need water";
        }
    }

    public Double absorbWaterAmount() {
        return 1.0;
    }

    public Double absorbWater(Double amount) {
        return waterAmount = amount * absorbWaterAmount();
    }


}

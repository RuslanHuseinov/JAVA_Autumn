package Implementation;

import Interfaces.Vehicle_interfaces.VehicleCategory;

public class CarCategory implements VehicleCategory {
    public CarCategory(String category) {
        this.category = category;
    }

    private String category;
    @Override
    public String getType() {
        return null;
    }

    @Override
    public void setCategory(String category) {
        this.category = category;
    }
}

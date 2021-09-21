package Implementation;

import Interfaces.*;
import Interfaces.Humans_interfaces.Goods;
import Interfaces.Vehicle_interfaces.*;

import java.time.LocalDate;
import java.util.List;

public class ToyotaSupra implements Car, Vehicle, Goods {
    public ToyotaSupra(LocalDate dateOfIssue) {
        this.category = new CarCategory("A");
        this.dateOfIssue = dateOfIssue;
    }

    LocalDate dateOfIssue;
    Engine engine;
    VehicleCategory category;
    Сhassis chassis;
    List<Wheel> wheels;
    @Override
    public void setEngine(Engine engine) {
    this.engine = engine;
    }

    @Override
    public void setChassis(Сhassis chassis) {
    this.chassis = chassis;
    }

    @Override
    public void setDateOfIssue(LocalDate dateOfIssue) {
    this.dateOfIssue = dateOfIssue;
    }

    @Override
    public void setVehicleCategory(VehicleCategory category) {
        this.category = category;
    }

    @Override
    public Engine getEngine() {
        return engine;
    }

    @Override
    public Сhassis getChassis() {
        return chassis;
    }

    @Override
    public List<Wheel> getWheels() {
        return wheels;
    }

    @Override
    public LocalDate getDateOfIssue() {
        return dateOfIssue;
    }

    @Override
    public VehicleCategory getVehicleCategory() {
        return category;
    }

    @Override
    public long getPrice() {
        return 0;
    }
}

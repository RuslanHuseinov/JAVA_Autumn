package Interfaces.Vehicle_interfaces;

import java.util.List;

public interface Car extends Vehicle{
    Engine getEngine();
    void setEngine(Engine engine);
    Сhassis getChassis();
    void setChassis(Сhassis chassis);
    List<Wheel> getWheels();
}

package Interfaces.Vehicle_interfaces;

import java.time.LocalDate;

public interface Vehicle {
    LocalDate getDateOfIssue();
    void setDateOfIssue(LocalDate dateOfIssue);
    VehicleCategory getVehicleCategory();
    void setVehicleCategory(VehicleCategory vehicleCategory);
}

package Model;

import Interfaces.*;

import java.time.LocalDate;
import java.util.Date;

public class OtherStuffEmployee extends RegularEmployee implements Employee, OtherStuff {
    private String name;
    private LocalDate birthDate;
    private LocalDate hiringDate;
    private int ID;
    private Department department;
    private String description;
    @Override
    public String getDescription() {
        return description;
    }
}

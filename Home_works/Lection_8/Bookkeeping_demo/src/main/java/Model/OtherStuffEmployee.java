package Model;

import Interfaces.*;

import java.time.LocalDate;
import java.util.Date;

public class OtherStuffEmployee implements Employee, OtherStuff {
    private String name;
    private LocalDate birthDate;
    private LocalDate hiringDate;
    private int ID;
    private Department department;
    private String description;
    @Override
    public int getId() {
        return 0;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setBirthDate(LocalDate date) {
        this.birthDate = date;
    }

    @Override
    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public void setHiringDate(LocalDate date) {
        this.hiringDate = date;
    }

    @Override
    public LocalDate getHiringDate() {
        return null;
    }

    @Override
    public void setDepartment(Department department) {

    }

    @Override
    public Department getDepartment() {
        return department;
    }

    @Override
    public long getSalaryBonus() {
        return 0;
    }

    @Override
    public String getDescription() {
        return description;
    }
}

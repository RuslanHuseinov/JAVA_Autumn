package Model;

import Interfaces.Department;
import Interfaces.Employee;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class RegularEmployee implements Employee {
    private String name;
    private LocalDate birthDate;
    private LocalDate hiringDate;
    private int ID;
    private Department department;
    @Override
    public int getId() {
        return 0;
    }

    @Override
    public long getSalaryBonus() {
        LocalDate currentDate = LocalDate.now();

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

    }

    @Override
    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public void setHiringDate(LocalDate date) {

    }

    @Override
    public LocalDate getHiringDate() {
        return hiringDate;
    }

    @Override
    public void setDepartment(Department department) {

    }

    @Override
    public Department getDepartment() {
        return null;
    }
}

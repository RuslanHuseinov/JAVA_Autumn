package Model;

import Interfaces.Department;
import Interfaces.Employee;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class RegularEmployee implements Employee {
    private int ID;
    private String name;
    private LocalDate birthDate;
    private LocalDate hiringDate;
    private Department department;


    @Override
    public long getSalaryBonus() {
        long result = 0;
        LocalDate currentDate = LocalDate.now();
        if (this.getBirthDate().getMonth() == currentDate.getMonth()){
            result +=( department.getFund()/ department.getAllEmployeesList().size() * 0.8) * 0.01;
        }
        return result;
    }

    @Override
    public int getId() {
        return ID;
    }
    @Override
    public void setName(String name) {
    this.name = name;
    }

    @Override
    public String getName() {
        return name;
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
        return hiringDate;
    }

    @Override
    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public Department getDepartment() {
        return department;
    }

}

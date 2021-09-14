package Interfaces;

import com.sun.istack.internal.NotNull;

import java.time.LocalDate;
import java.util.Date;

public interface Employee {
    public int getId();
    public void setName(String name);
    public String getName();
    public void setBirthDate(LocalDate date);
    public LocalDate getBirthDate();
    public void setHiringDate(LocalDate date);
    public LocalDate getHiringDate();
    public void setDepartment(Department department); // set link for
    public Department getDepartment(); /* @NotNull?*/
    public long getSalaryBonus();
}

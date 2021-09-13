package Model;

import Controller.EmployeeCommand;
import Interfaces.Department;
import Interfaces.Employee;
import Interfaces.Manager;

import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class ManagerEmployee implements Employee, Manager {
    private String name;
    private LocalDate birthDate;
    private LocalDate hiringDate;
    private int ID;
    private Department department;
    private List<Employee> managersEmployees = new LinkedList<>();

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

    @Override
    public int getManagerBonus() {
        return 0;
    }

    @Override
    public List<Employee> getManagersEmployees() {
        return managersEmployees;
    }

    @Override
    public boolean removeEmployeeFromManager(Employee employeeForFiring) {
       return managersEmployees.remove(employeeForFiring);
    }

    @Override
    public boolean addEmployeeToManager(Employee employeeForHiring) {
        return managersEmployees.add(employeeForHiring);
    }
}

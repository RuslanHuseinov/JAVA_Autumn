package Model;


import Interfaces.Department;
import Interfaces.Employee;
import Interfaces.Manager;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class ManagerEmployee extends RegularEmployee implements Employee, Manager {
    private String name;
    private LocalDate birthDate;
    private LocalDate hiringDate;
    private int ID;
    private Department department;
    private List<Employee> managersEmployees = new LinkedList<>();

    @Override
    public long getManagerBonus() {
        long result = 0;
        result += getSalaryBonus();
        result += getManagersEmployees().size() * ((department.getFund() * 0.8) * 0.01);
        return result;
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

    @Override
    public String toString() {
        StringBuilder result =  new StringBuilder(super.toString());
        result.append("Manager employees : " + managersEmployees);
        return result.toString();
    }
}

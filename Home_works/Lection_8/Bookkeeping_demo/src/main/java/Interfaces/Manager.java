package Interfaces;

import java.util.List;

public interface Manager extends Employee{
    public long getManagerBonus();
    public List<Employee> getManagersEmployees();
    public boolean removeEmployeeFromManager(Employee employeeForFiring);
    public boolean addEmployeeToManager(Employee employeeForHiring);
}

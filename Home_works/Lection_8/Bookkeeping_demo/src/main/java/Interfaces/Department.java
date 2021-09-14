package Interfaces;

import java.util.List;

public interface Department {
    public String getName();
    public void setName(String name);
    public boolean addEmployee(Employee employee);
    public boolean removeEmployee(Employee employee);
    List<Employee> getAllEmployeesList();
    public void setFund(long money);
    public long getFund();
    public long getSalary(Employee employee);
    public int size(); // must return employeesListSize()
}

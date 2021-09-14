package Model;

import Interfaces.Department;
import Interfaces.Employee;
import Interfaces.Manager;

import java.util.LinkedList;
import java.util.List;

public class DepartmentImplementation implements Department {
    List<Employee> allEmployees = new LinkedList<>();
    List<Manager> allManagers = new LinkedList<>();
    private String name;
    private long fund;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean addEmployee(Employee employee) {
        return allEmployees.add(employee);
    }

    @Override
    public boolean removeEmployee(Employee employee) {
        return allEmployees.remove(employee);
    }

    @Override
    public List<Manager> getAllManagersList() {
        return allManagers;
    }

    @Override
    public List<Employee> getAllEmployeesList() {
        return allEmployees;
    }

    @Override
    public void setFund(long money) {
        fund = money;
    }

    @Override
    public long getSalary(Employee employee) {
//        salart LOGIC >????????????????????????
//        long localFund = (long) (fund * 0.8) / getAllEmployeesList().size() == 0 ? 1 : getAllEmployeesList().size();
//        long result = localFund + employee.getSalaryBonus();
//        return result;

        return 0;
    }

    @Override
    public long getFund() {
        return fund;
    }

    @Override
    public int size() {
        return 0;
    }
}

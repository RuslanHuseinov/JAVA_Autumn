package Controller;

import Exceptions.EmployeeNotFoundException;
import Interfaces.*;
import Model.DepartmentImplementation;
import Model.ManagerEmployee;

import java.util.List;

public class Utilities {
    public static Department createDepartment(){
        return new DepartmentImplementation();
    }
    public static Employee createEmployee(){
        return new ManagerEmployee();
    }
    public static void cloneEmployee(){

    }
    public static void setEmployeeFields(Employee employee, String[] fields){

    }
    public static void setOtherStuffFields(OtherPersonal otherPersonal, String description){
        otherPersonal.setDescription(description);
    }
    public static boolean addEmployeeToDepartment(Department department, Employee employee){
        if (!department.getAllEmployeesList().contains(employee)){
            department.getAllEmployeesList().add(employee);
            return true;
        }
        return false;
    }
    public static boolean removeEmployeeFromeDepartment(Employee employee, Department department){
        if (department.getAllEmployeesList().contains(employee)){
            department.getAllEmployeesList().remove(employee);
            return true;
        }
        return false;
    }
    public static boolean addEmployeeToManager(Manager manager, Employee employee){
        if (!manager.getManagersEmployees().contains(employee)){
            manager.addEmployeeToManager(employee);
            return true;
        }
        return false;
    }
    public static boolean removeEmployeeFromManager(Manager manager, Employee employee){
        if (manager.getManagersEmployees().contains(employee)){
            manager.removeEmployeeFromManager(employee);
            return true;
        }
        return false;
    }
    public static Employee findEmployeeByName(List<Employee> list, String name) throws EmployeeNotFoundException {
        for (Employee employee: list){
            if (employee.getName().equalsIgnoreCase(name)){
                return employee;
            }
        }
        throw new EmployeeNotFoundException("there is no " + name + " employee in this list");
    }
    public static Employee findEmployeeById(List<Employee> list, int ID) throws EmployeeNotFoundException {
        for (Employee employee: list){
            if (employee.getId() == ID){
                return employee;
            }
        }
        throw new EmployeeNotFoundException("there is no employee with id ="+ID + " in this list");
    }

    public static String getAllEmployeesAsStringFromList(List<Employee> list){
        StringBuilder stringBuilder = new StringBuilder("");
        for (Employee employee: list){
            stringBuilder.append(employee.toString());
        }
        return stringBuilder.toString();
    }
    public static String getAllManagersAsStringFromList(List<Employee> list){
        StringBuilder stringBuilder = new StringBuilder("");
        for (Employee employee: list){
            if (employee instanceof Manager){
            stringBuilder.append(employee.toString());
        }
        }
        return stringBuilder.toString();
    }
    public static String getAllOtherStuffAsStringFromList(List<Employee> list){
        StringBuilder stringBuilder = new StringBuilder("");
        for (Employee employee: list){
            if (employee instanceof OtherPersonal){
                stringBuilder.append(employee.toString());
            }
        }
        return stringBuilder.toString();
    }

    public static Department chooseDepartment(Company company) {

        return null;
    }
}

package Model;

import Interfaces.Company;
import Interfaces.Department;
import Interfaces.Employee;

import java.util.LinkedList;
import java.util.List;

public class JAVAzon implements Company {
    List<Department> departments;

    public JAVAzon() {

        this.departments = new LinkedList<>() ;
    }

    public JAVAzon(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public List<Department> getDepartments() {
        return this.departments;
    }
}

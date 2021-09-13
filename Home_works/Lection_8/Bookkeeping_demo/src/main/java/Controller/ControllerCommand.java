package Controller;

import Interfaces.Command;
import Interfaces.Controller;
import Interfaces.Employee;


public class EmployeeCommand implements Command<Controller> {
    private String name;

    public EmployeeCommand(String name) {
        this.name = name;
    }


    @Override
    public void execute(Controller controller) {

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
    public String toString() {
       return getName();
    }
}

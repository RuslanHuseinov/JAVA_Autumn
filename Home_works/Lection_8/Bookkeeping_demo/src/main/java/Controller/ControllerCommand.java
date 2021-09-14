package Controller;

import Interfaces.Command;
import Interfaces.Controller;
import Interfaces.Employee;


public class ControllerCommand implements Command {
    private String name;

    public ControllerCommand(String name) {
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
       return name;
    }
}

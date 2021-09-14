package Controller;

import Interfaces.Command;
import Interfaces.Controller;

public class ControllerCommand implements Command<Controller> {
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

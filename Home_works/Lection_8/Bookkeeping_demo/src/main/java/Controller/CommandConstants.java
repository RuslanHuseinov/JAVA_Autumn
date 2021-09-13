package Controller;

import Interfaces.Command;
import Interfaces.Controller;


public class CommandConstants {
    static Command[] mainMenuCommands = {
            CommandConstants.returningCommand,
            new EmployeeCommand("create") {
                @Override
                public void execute(Controller controller) {
                controller.setCommands(CommandConstants.createCommands);
                }
            },
            new EmployeeCommand("Delete an employee") {
                @Override
                public void execute(Controller controller) {
                controller.getView().printMessage("Trying to delete employees");
                }
            },
            new EmployeeCommand("Get all employees"){
                @Override
                public void execute(Controller controller) {

                }
            },
            new EmployeeCommand("exit"){
                @Override
                public void execute(Controller controller) {
                System.exit(0);
                }
            }

    };
    static Command[] createCommands = {
            CommandConstants.returningCommand,
            new EmployeeCommand("Create an employee"){
                @Override
                public void execute(Controller controller) {

                }
            },
    };

    static Command returningCommand = new EmployeeCommand("return"){
        @Override
        public void execute(Controller controller) {
            controller.setCommands(CommandConstants.mainMenuCommands);
        }
    };
}

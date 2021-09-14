package Controller;

import Interfaces.Command;
import Interfaces.Controller;
import Interfaces.Department;
import Interfaces.Employee;


public class CommandConstants {
    public final static Command RETURN_COMMAND = new ControllerCommand("return") {
        @Override
        public void execute(Controller controller) {
            controller.setCommands(CommandConstants.MAIN_MENU_COMMANDS);
        }
    };

    private final static Command[] COMMON_COMMANDS = {};

    private final static Command[] CHANGE_TYPE_COMMANDS = {
            new ControllerCommand("change some ..manager") {
                @Override
                public void execute(Controller controller) {

                }
            },
            new ControllerCommand("change some ..employee") {
                @Override
                public void execute(Controller controller) {

                }
            },
            new ControllerCommand("change some .. other personal") {
                @Override
                public void execute(Controller controller) {

                }
            },
            CommandConstants.RETURN_COMMAND,

    };
    public final static Command[] DELETE_COMMANDS = {
            CommandConstants.RETURN_COMMAND,
            new ControllerCommand("delete an employee") {
                @Override
                public void execute(Controller controller) {

                }
            },

    };
    public final static Command[] GET_COMMANDS = {CommandConstants.RETURN_COMMAND};
    public final static Command[] CREATE_COMMANDS = {
            CommandConstants.RETURN_COMMAND,
            new ControllerCommand("Create an employee") {
                @Override
                public void execute(Controller controller) {
                    Employee employee = Utilities.createEmployee();
                    Department department = Utilities.chooseDepartment(controller.getCompany());
                    assert department != null;
                    department.addEmployee(employee);
                }
            },
            new ControllerCommand("Create an department") {
                @Override
                public void execute(Controller controller) {
                    Department department = Utilities.createDepartment();
                    controller.getCompany().getDepartments().add(department);
                }
            },
    };

    public final static Command[] MAIN_MENU_COMMANDS = {
            new ControllerCommand("create") {
                @Override
                public void execute(Controller controller) {
                    controller.setCommands(CommandConstants.CREATE_COMMANDS);
                }
            },
            new ControllerCommand("remove") {
                @Override
                public void execute(Controller controller) {
                    if (controller.getCompany().getDepartments().size() == 0) {
                        controller.getView().printMessage("no departments or employees to delete");
                    } else
                        controller.setCommands(CommandConstants.DELETE_COMMANDS);
                }
            },
            new ControllerCommand("change type") {
                @Override
                public void execute(Controller controller) {
                    controller.setCommands(CommandConstants.CHANGE_TYPE_COMMANDS);
                }
            },
            new ControllerCommand("exit") {
                @Override
                public void execute(Controller controller) {
                    System.exit(0);
                }
            }

    };

}

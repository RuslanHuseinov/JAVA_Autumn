package Controller;

import Interfaces.Command;
import Interfaces.Controller;


public class CommandConstants {
    public final static Command RETURN_COMMAND = new ControllerCommand("return"){
        @Override
        public void execute(Controller controller) {
            controller.setCommands(CommandConstants.MAIN_MENU_COMMANDS);
        }
    };
    public final static Command[] DELETE_COMMANDS ={
            CommandConstants.RETURN_COMMAND,
            new ControllerCommand("delete an employee"){
                @Override
                public void execute(Controller controller) {

                }
            },

    };
    public final static Command[] GET_COMMANDS = {CommandConstants.RETURN_COMMAND};
    public final static Command[] CREATE_COMMANDS = {
            CommandConstants.RETURN_COMMAND,
            new ControllerCommand("Create an employee"){
                @Override
                public void execute(Controller controller) {
                controller.getCompany()
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
            new ControllerCommand("delete") {
                @Override
                public void execute(Controller controller) {
                    if (controller.getCompany().getDepartments().size() == 0){
                    controller.getView().printMessage("no departments or employees to delete");
                    }else
                        controller.setCommands(CommandConstants.DELETE_COMMANDS);
                }
            },
            new ControllerCommand("get"){
                @Override
                public void execute(Controller controller) {
                    controller.setCommands(CommandConstants.GET_COMMANDS);
                }
            },
            new ControllerCommand("exit"){
                @Override
                public void execute(Controller controller) {
                    System.exit(0);
                }
            }

    };

}

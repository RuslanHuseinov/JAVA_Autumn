package Controller;

import Interfaces.Command;
import Interfaces.Controller;


public class CommandConstants {
    public static Command[] mainMenuCommands = {
            CommandConstants.returningCommand,
            new ControllerCommand("create") {
                @Override
                public void execute(Controller controller) {
                controller.setCommands(CommandConstants.createCommands);
                }
            },
            new ControllerCommand("delete") {
                @Override
                public void execute(Controller controller) {
                    controller.setCommands(CommandConstants.deleteCommands);
                }
            },
            new ControllerCommand("get"){
                @Override
                public void execute(Controller controller) {
                    controller.setCommands(CommandConstants.getCommands);
                }
            },
            new ControllerCommand("exit"){
                @Override
                public void execute(Controller controller) { 
                    System.exit(0);
                }
            }

    };
    public static Command[] deleteCommands ={CommandConstants.returningCommand};
    private static Command[] getCommands = {CommandConstants.returningCommand};
    public static Command[] createCommands = {
            CommandConstants.returningCommand,
            new ControllerCommand("Create an employee"){
                @Override
                public void execute(Controller controller) {

                }
            },
    };

    public static Command returningCommand = new ControllerCommand("return"){
        @Override
        public void execute(Controller controller) {
            controller.setCommands(CommandConstants.mainMenuCommands);
        }
    };
}

package View;

import Interfaces.Command;
import Interfaces.View;

import java.util.ResourceBundle;

public class BookkeepingView implements View {
    static ResourceBundle resourceBundle = ResourceBundle.getBundle("messages");

    @Override
    public void printMessage(String message) {
        System.out.println(message);
    }

    @Override
    public void showCommands(String... commandsName) {
        for (String command : commandsName){
            printMessage(command);
        }
    }

    @Override
    public void printWrongDataInput(String message) {
        System.out.println(message);
    }

    @Override
    public ResourceBundle getResourceBunde() {
        return resourceBundle;
    }

    @Override
    public void setResourceBunde(ResourceBundle bunde) {

    }
}

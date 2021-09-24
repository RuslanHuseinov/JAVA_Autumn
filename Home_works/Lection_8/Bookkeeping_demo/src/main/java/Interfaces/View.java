package Interfaces;

import java.util.ResourceBundle;
import java.util.concurrent.RecursiveAction;

public interface View {
    public void printMessage(String message);
    public void printWrongDataInput(String message);
    public void showCommands(String ...args);
    public ResourceBundle getResourceBunde();
    public void setResourceBunde(ResourceBundle bunde);
}

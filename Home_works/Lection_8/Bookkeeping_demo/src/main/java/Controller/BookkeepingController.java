package Controller;

import Interfaces.*;
import View.*;
import Model.Company;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class BookkeepingController implements Controller<Employee> {
    List<Employee> presentEmployeeList = new LinkedList<>();
    public Scanner scanner = new Scanner(System.in);
    public Command[] commands = CommandConstants.mainMenuCommands;
    public View view;

    public BookkeepingController( View view) {
        this.view = view;
    }

    public void init(){
    startProgram();
    }
    public void startProgram(){
        while (true){
            view.printMessage(view.getResourceBunde().getString(MessageConstants.LIST_OF_AVAILABLE_COMMAND));
            view.showCommands(this.commands);
            String choicedCommandName = inputStringWithScanner();
            chooseCommand(choicedCommandName);

        }
    }
    public void chooseCommand(String commandName){
        if ((commandName != null && commandName.length()>0)) {
            for (Command command : this.commands) {
                if (command.getName().equalsIgnoreCase(commandName)) {
                    command.execute(this);
                }
            }
        }else
            view.printWrongDataInput(view.getResourceBunde().getString(MessageConstants.INPUT_COMMAND));

    }
    String inputStringWithScanner(){
        return scanner.nextLine();
    }

    @Override
    public void setScanner(Scanner scanner) {

    }

    @Override
    public View getView() {
        return view;
    }

    @Override
    public Command[] getCommands() {
        return commands;
    }

    public void setCommands(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public List<Employee> getList() {
        return presentEmployeeList;
    }
}

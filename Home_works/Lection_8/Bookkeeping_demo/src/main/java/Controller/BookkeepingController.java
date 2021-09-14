package Controller;

import Interfaces.*;
import Model.JAVAzon;
import View.*;

import java.util.Scanner;


public class BookkeepingController implements Controller {
    Company company;  // model
    public Scanner scanner;
    public Command[] commands;
    public View view;

    public BookkeepingController( View view) {
        company = new JAVAzon();
        scanner = new Scanner(System.in);
        commands = CommandConstants.MAIN_MENU_COMMANDS;
        this.view = view;
    }

    public void init(){
        while (true){
            view.printMessage(view.getResourceBunde().getString(MessageConstants.LIST_OF_AVAILABLE_COMMAND));
            view.showCommands(commands);
            String choicedCommandName = inputStringWithScanner();
            chooseCommand(choicedCommandName);
        }
    }

    public void chooseCommand(String commandName){
        if ((commandName != null && commandName.length()>0)) {
            for (Command command : commands) {
                if (command.getName().equalsIgnoreCase(commandName)) {
                    command.execute(this);
                    break;
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
    public Company getCompany() {
        return this.company;
    }
}

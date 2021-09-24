package Controller;

import Interfaces.*;
import Model.JAVAzon;
import View.*;

import java.util.Scanner;


public class BookkeepingController implements Controller {
    Company company;  // model
    public View view;
    public Scanner scanner;


    public BookkeepingController(View view) {
        company = new JAVAzon();
        scanner = new Scanner(System.in);
        this.view = view;
    }

    public void init() {
        while (true) {
            view.printMessage(view.getResourceBunde().getString(MessageConstants.INPUT_COMMAND));
            view.showCommands();
            String choicedCommandName = inputStringWithScanner();
            chooseCommand(choicedCommandName);
        }
    }

    public void chooseCommand(String commandName) {
        if ((commandName != null && commandName.length() > 0)) {

        } else
            view.printWrongDataInput(view.getResourceBunde().getString(MessageConstants.WRONG_DATA_INPUT_COMMAND));

    }

    String inputStringWithScanner() {
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
    public Company getCompany() {
        return this.company;
    }
}

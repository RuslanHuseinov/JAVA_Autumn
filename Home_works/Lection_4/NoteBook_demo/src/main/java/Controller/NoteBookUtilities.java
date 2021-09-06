package Controller;

import Model.NoteBook;
import View.View;
import View.TextConstants;

import java.util.ResourceBundle;
import java.util.Scanner;

public class NoteBookUtilities {
    private View view;
    private Scanner scanner;
    private ResourceBundle bundle;

    public NoteBookUtilities(View view, Scanner scanner, ResourceBundle bundle) {
        this.view = view;
        this.scanner = scanner;
        this.bundle = bundle;
    }

    public NoteBook note(){
        NoteBook result =  new NoteBook();

        String loginRegex = this.bundle.getString(RegexConstants.LOGIN_REGEX);
        String nameRegex = this.bundle.getString(RegexConstants.NAME_REGEX);
        String nameMessage = view.messageBuilder(view.bundle.getString(TextConstants.FIRST_NAME),
                view.bundle.getString(TextConstants.STRING_FORMAT),
                nameRegex
                );
        String loginMessage = view.messageBuilder(view.bundle.getString(TextConstants.LOGIN_DATA),
                view.bundle.getString(TextConstants.STRING_FORMAT),
                loginRegex);

        result.setLogin(inputStringWithScanner(loginMessage,loginRegex));
        result.setName(inputStringWithScanner(nameMessage,nameRegex));

        return result;
    }
    String inputStringWithScanner(String message, String regex){
        String result;
        view.printInputMessage(message);
        while (true){
            result = scanner.nextLine();
            if(result.matches(regex)){
                return result;
            }else {
                view.printWrondDataMessage(message);
            }
        }
    }
}

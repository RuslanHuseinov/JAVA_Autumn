package Controller;

import Model.NoteBook;
import Model.RegexConsts;
import View.View;
import View.MessageConsts;

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

        String loginRegex = this.bundle.getString(RegexConsts.LOGIN_REGEX);
        String loginMessage = view.concatMessages(view.resourceBundle.getString(MessageConsts.LOGIN_MESSAGE),
                view.resourceBundle.getString(MessageConsts.FORMAT_MESSAGE),
                loginRegex);

        String nameRegex = this.bundle.getString(RegexConsts.NAME_REGEX);
        String nameMessage = view.concatMessages(view.resourceBundle.getString(MessageConsts.NAME_MESSAGE),
                view.resourceBundle.getString(MessageConsts.FORMAT_MESSAGE),
                nameRegex
        );

        String surnameRegex = this.bundle.getString(RegexConsts.SURNAME_REGEX);
        String surnameMessage = view.concatMessages(view.resourceBundle.getString(MessageConsts.SURNAME_MESSAGE),
                view.resourceBundle.getString(MessageConsts.FORMAT_MESSAGE),
                surnameRegex
        );

        String passwordRegex = this.bundle.getString(RegexConsts.PASSWORD_REGEX);
        String password = view.concatMessages(view.resourceBundle.getString(MessageConsts.PASSWORD_MESSAGE),
                view.resourceBundle.getString(MessageConsts.FORMAT_MESSAGE),
                passwordRegex
        );

        String phone_numberRegex = this.bundle.getString(RegexConsts.PHONE_NUMBER_REGEX);
        String phone_number = view.concatMessages(view.resourceBundle.getString(MessageConsts.PHONE_NUMBER_MESSAGE),
                view.resourceBundle.getString(MessageConsts.FORMAT_MESSAGE),
                phone_numberRegex
        );


        result.setLogin(inputStringWithScanner(loginMessage,loginRegex));
        result.setPassword(inputStringWithScanner(password,passwordRegex));
        result.setName(inputStringWithScanner(nameMessage,nameRegex));
        result.setSurname(inputStringWithScanner(surnameMessage,surnameRegex));
        result.setPhoneNumber(inputStringWithScanner(phone_number,phone_numberRegex));


        return result;
    }
    String inputStringWithScanner(String message, String regex){
        String result;
        view.printInputDataMessage(message);
        while (true){
            result = scanner.nextLine();
            if(result.matches(regex)){
                return result;
            }else {
                view.printWrongDataMessage(message);
            }
        }
    }
}

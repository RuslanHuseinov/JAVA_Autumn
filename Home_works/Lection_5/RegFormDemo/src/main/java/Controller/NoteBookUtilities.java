package Controller;

import Model.NotUniqueLoginException;
import Model.NoteBook;
import Model.RegexConsts;
import View.View;
import View.MessageConsts;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.Scanner;

public class NoteBookUtilities {
    private View view;
    private Scanner scanner;
    private ResourceBundle bundle;
    private Connection connection;

    public NoteBookUtilities(View view, Scanner scanner, ResourceBundle bundle, Connection connection) {
        this.view = view;
        this.scanner = scanner;
        this.bundle = bundle;
        this.connection = connection;
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
        try {                                                       /*hardcode, also doesnt work if user try to input wrong login 2 times in a row*/
            checkLoginUniqueness(result.getLogin());
        }catch (NotUniqueLoginException exc){
            System.err.println(exc);
            exc.printStackTrace();
            result.setLogin(inputStringWithScanner(loginMessage,loginRegex));
        }
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

    public boolean checkLoginUniqueness(String login) throws NotUniqueLoginException {
        String SQL_SELECT = "SELECT login FROM users WHERE login ='"+login+"'";  /*hardcode*/
        try {
            PreparedStatement statement = connection.prepareStatement(SQL_SELECT);
            if (statement.execute()){
                throw new NotUniqueLoginException();
            }
        }catch (SQLException exc){
            System.err.println(exc);
        }
        return false;
    }

    public void insertNoteBookToDataBase(NoteBook noteBook ) throws SQLException{
        String SQL_INSERT = "INSERT INTO users (idusers ,login, password, name, surname, telephone_number) VALUES (?,?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(SQL_INSERT);
        preparedStatement.setString(1, "0");
        preparedStatement.setString(2, noteBook.getLogin());
        preparedStatement.setString(3, noteBook.getPassword());
        preparedStatement.setString(4, noteBook.getName());
        preparedStatement.setString(5, noteBook.getSurname());
        preparedStatement.setString(6, noteBook.getPhoneNumber());
        preparedStatement.executeUpdate();
    }
}

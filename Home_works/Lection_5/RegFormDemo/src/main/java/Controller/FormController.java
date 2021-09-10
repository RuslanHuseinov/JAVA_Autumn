package Controller;

import Model.NoteBook;
import Model.Model;
import View.View;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.Scanner;

public class FormController {
    private View view;
    private Scanner scanner;
    private ResourceBundle bundle;
    private Connection connection;

    public FormController(View view, Scanner scanner, ResourceBundle bundle, Connection connection) {
        this.view = view;
        this.scanner = scanner;
        this.bundle = bundle;
        this.connection = connection;
    }

    public void init(){
        NoteBookUtilities noteBookUtilities = new NoteBookUtilities(this.view,this.scanner,this.bundle);

        NoteBook noteBook = noteBookUtilities.note();
        System.out.println(noteBook.toString());
        try {
            insertNoteBookToDataBase(noteBook);
        }catch (SQLException exc){
            System.err.println(exc);
        }
    }

    public void insertNoteBookToDataBase(NoteBook noteBook ) throws SQLException {
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

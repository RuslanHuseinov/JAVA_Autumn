package Controller;

import Model.NoteBook;
import View.View;

import java.sql.Connection;
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

        NoteBookUtilities noteBookUtilities = new NoteBookUtilities(this.view,this.scanner,this.bundle,this.connection);

        NoteBook noteBook = noteBookUtilities.note();

        try {
            noteBookUtilities.insertNoteBookToDataBase(noteBook);
        } catch (SQLException exception) {
            System.err.println(exception);
            exception.printStackTrace();
        }
    }




}

package Controller;

import Model.Model;
import View.View;

import java.sql.Connection;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Controller {
    View view;
    Model model;
    Connection connection;
    public static final String REGEX_PROPP = "regex";
    public static final ResourceBundle controllerBundle = ResourceBundle.getBundle(REGEX_PROPP);

    private Scanner scanner;
    {
        this.view = new View();
        this.model = new Model();
        scanner = new Scanner(System.in);
        connection = DBConnection.DB_CONNECTION_INSTANCE.getConnection();
    }
    public void init(){
    FormController formController = new FormController(this.view,this.scanner,Controller.controllerBundle,this.connection);
    formController.init();
    }
}

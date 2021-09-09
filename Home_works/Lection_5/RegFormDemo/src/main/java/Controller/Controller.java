package Controller;

import Model.Model;
import View.View;

import java.sql.Connection;
import java.util.Scanner;

public class Controller {
    View view;
    Model model;
    Connection connection;
    private Scanner scanner;
    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
        scanner = new Scanner(System.in);
        connection = DBConnection.DB_CONNECTION_INSTANCE.getConnection();

    }
    public void init(){

    }
}

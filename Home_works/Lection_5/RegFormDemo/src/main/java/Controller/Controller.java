package Controller;

import Model.Model;
import View.View;

import java.sql.Connection;

public class Controller {
    View view;
    Model model;
    Connection connection;
    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
        connection = DBConnection.DB_CONNECTION_INSTANCE.getConnection();
    }
    public void init(){

    }
}

package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public enum DBConnection {
    DB_CONNECTION_INSTANCE;
    Connection connection;
    DBConnection(){
//        Properties
//        connection = DriverManager.getConnection()
    }


}

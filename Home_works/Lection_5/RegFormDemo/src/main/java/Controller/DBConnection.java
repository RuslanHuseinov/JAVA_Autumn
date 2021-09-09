package Controller;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public enum DBConnection {

    DB_CONNECTION_INSTANCE();

    private Connection connection;

    DBConnection(){
        try {
            Properties properties = DBConnection.loadPropertiesFile()
            String URL = properties.getProperty("url");
            String USER = properties.getProperty("user");
            String PASSWORD = properties.getProperty("password");

            try {
                connection = DriverManager.getConnection(URL,USER,PASSWORD);
            }catch (SQLException exc){
                System.err.println(exc);
            }

        }catch (IOException exc){
            System.err.println(exc);
        }


    }
    private static Properties loadPropertiesFile() {
        Properties prop = new Properties();
        try {
            InputStream is = new FileInputStream("jdbc.properties");
            prop.load(is);
            is.close();
        }catch (IOException exc){
            System.err.println(exc);
        }
        return prop;
    }
    public Connection getConnection(){
        return connection;
    }


}

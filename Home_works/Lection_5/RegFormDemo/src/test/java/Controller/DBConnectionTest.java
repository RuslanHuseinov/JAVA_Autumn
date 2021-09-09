package Controller;

import org.junit.jupiter.api.Test;

import java.sql.*;

import static org.junit.jupiter.api.Assertions.*;

class DBConnectionTest {
    @Test
    void isConnectionWork (){
        Connection connection = DBConnection.DB_CONNECTION_INSTANCE.getConnection();
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users");
            while (resultSet.next()){
                System.out.println(resultSet.getString(1));
            }
        }catch (SQLException exc){
            System.err.println(exc);
        }

    }
}
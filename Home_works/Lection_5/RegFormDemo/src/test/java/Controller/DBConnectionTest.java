package Controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.sql.*;

import static org.junit.jupiter.api.Assertions.*;

class DBConnectionTest {
    @Test
    void isConnectionWork (){
        assertDoesNotThrow(DBConnection.DB_CONNECTION_INSTANCE::getConnection);

    }
}
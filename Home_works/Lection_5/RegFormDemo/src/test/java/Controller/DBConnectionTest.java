package Controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DBConnectionTest {
    @Test
    void isConnectionWork (){
        assertNotNull(DBConnection.DB_CONNECTION_INSTANCE.getConnection());
    }
}
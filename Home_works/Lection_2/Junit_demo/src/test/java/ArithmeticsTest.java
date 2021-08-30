import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.function.Executable;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticsTest {
    Arithmetics arithmetics;
    @BeforeEach
    public void contructor(){
        arithmetics = new Arithmetics();
    }
    @Test
    void add() {
        assertEquals(4,arithmetics.add(2,2));
        /*assertEquals(0.3,arithmetics.add(0.1,0.2));*/
    }
  /*  @Test @Timeout(value = 100,unit = TimeUnit.MILLISECONDS)
    public void testN(){
        while (true){
            System.out.println("Hello");
        }
    }*/
    static void division() {
        Arithmetics arithmetics = new Arithmetics();
        arithmetics.intDivision(10,0);
    }
    @Test
    void testDivExc(){
        assertThrows(ArithmeticException.class,(Executable) ArithmeticsTest::division);
    }

    @Test
    void deduct() {
    }

    @Test
    void multiple() {
        assertAll(
                ()->assertEquals(4,arithmetics.multiply(2,2)),
                ()-> assertEquals(-4,arithmetics.multiply(2,-2)),
                ()-> assertEquals(4,arithmetics.multiply(-2,-2)),
                ()-> assertEquals(0,arithmetics.multiply(1,0)));
    }
}
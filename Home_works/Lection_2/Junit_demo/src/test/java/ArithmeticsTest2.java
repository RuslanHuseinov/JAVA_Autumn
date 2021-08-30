import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticsTest2 {
    private Arithmetics arithmetics;
    private Arithmetics arithmetics2;
    @BeforeAll
    public static void doSomth(){
        /*method with "Before all" annotation, must be static!!!*/
    }
    @BeforeEach
    public void runT(){

        arithmetics = new Arithmetics();
        arithmetics2 = new Arithmetics();
    }
    @AfterEach
    public void finishT(){
        arithmetics = null;
        arithmetics2 = null;
    }
    @AfterAll
    public static void finishAll(){

    }
    @Test
    void objectCheck(){
        assertNotNull(arithmetics);
        assertNotSame(arithmetics,arithmetics2);

//        assertSame(arithmetics,arithmetics2);
//        assertNull(arithmetics);
    }

    @Test
    void add() {
        double result = arithmetics.add(0.2,0.2);
        if (result!=0.4){
            fail();
        }

//        assertTrue(result==0.4);
//        assertFalse(result!=0.4);
    }

    @Test
    void division() {
        double result = arithmetics.division(100,20);
        if (result!=5.0){
            fail();
        }
//        assertEquals(5,Arithmetics.division(100,20));
    }

    @Test
    void deduct() {
        double result = arithmetics.deduct(3,7);
        if (result!=-4){
            fail();
        }
    }

    @Test
    void multiply() {
        double result = arithmetics.multiply(3,7);
        if (result!=21){
            Assertions.fail();
        }
    }
}
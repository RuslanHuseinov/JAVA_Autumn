import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModelTest {
    private static Model testModelInstance;
    @BeforeAll
    static void modelInit(){
        testModelInstance = new Model();
    }

    @Test
    void rand() {
        int randomNumber;
        for (int i = 0; i < 100000; i++) {
            randomNumber = testModelInstance.rand(0,100);
            boolean inRange = (randomNumber >= 0 && randomNumber <= 100);
            assertTrue(inRange);
        }

    }
    @Test
    void randWithoutParams() {
        int randomNumber;
        for (int i = 0; i < 100000; i++) {
            randomNumber = testModelInstance.rand();
            boolean inRange = (randomNumber >= 0 && randomNumber <= 100);
            assertTrue(inRange);
        }

    }

    @Test
    void setInput() {
        boolean inputCheck =  testModelInstance.setInput(101);
        assertFalse(inputCheck);
    }


    @Test
    void getAttemptLength() {
        int length = testModelInstance.getAttemptLength();
        assertEquals(0,length);
    }

    @Test
    void getRangeAsString() {
        String testRangeMsg = testModelInstance.getAttemptListAsString();
        assertNotNull(testRangeMsg);
    }

    @Test
    void getAttemptListAsString() {
        String testList = testModelInstance.getAttemptListAsString();
        assertNotNull(testList);
    }

    @Test
    void getLeftRange() {
        int range = testModelInstance.getLeftRange();
        assertEquals(0, range);
    }

    @Test
    void getRightRange() {
        int range = testModelInstance.getRightRange();
        assertEquals(100,range );
    }
}
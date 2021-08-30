import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WhenConvertArabicToRomanNumber {

    @Test
    public void convert_1_To_I(){

        String romanNumber = ConvertNumber.toRoman(1);

        Assertions.assertEquals("I",romanNumber);
    }
    @Test
    public void convert_2_To_II(){

        String romanNumber = ConvertNumber.toRoman(2);

        Assertions.assertEquals("II",romanNumber);
    }
    @Test
    public void convert_3_To_III(){

        String romanNumber = ConvertNumber.toRoman(3);

        Assertions.assertEquals("III",romanNumber);
    }

    @Test
    public void convert_5_To_V(){

        String romanNumber = ConvertNumber.toRoman(5);

        Assertions.assertEquals("V",romanNumber);
    }
    @Test
    public void convert_6_To_VI(){

        String romanNumber = ConvertNumber.toRoman(6);

        Assertions.assertEquals("VI",romanNumber);
    }
    @Test
    public void convert_4_To_IV(){

        String romanNumber = ConvertNumber.toRoman(4);

        Assertions.assertEquals("IV",romanNumber);
    }
    @Test
    public void convert_10_To_X(){

        String romanNumber = ConvertNumber.toRoman(10);

        Assertions.assertEquals("X",romanNumber);
    }
    @Test
    public void convert_9_To_IX(){

        String romanNumber = ConvertNumber.toRoman(9);

        Assertions.assertEquals("IX",romanNumber);
    }
    @Test
    public void convert_19_To_XIX(){

        String romanNumber = ConvertNumber.toRoman(19);

        Assertions.assertEquals("XIX",romanNumber);
    }
    @Test
    public void convert_21_To_XXI(){

        String romanNumber = ConvertNumber.toRoman(21);

        Assertions.assertEquals("XXI",romanNumber);
    }
}
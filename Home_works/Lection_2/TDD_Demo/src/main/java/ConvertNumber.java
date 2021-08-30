
public class ConvertNumber {
    public static void main(String[] args) {
        System.out.println( toRoman(10));
    }
    public static String toRoman (int arabicNumber){
        String romanNumber = getRomanNumber(arabicNumber);
        romanNumber = romanNumber.replace("IIII","IV");
        romanNumber = replaceInterlacedDigits(romanNumber);
        return romanNumber;
    }
    private static String replaceInterlacedDigits(String romanNumber){
        for (int i = 2; i< romanNumber.length(); i++){
            if(romanNumber.charAt(i-2) == romanNumber.charAt(i)
                    && romanNumber.charAt(i-1)!= romanNumber.charAt(i)){
                romanNumber = romanNumber.substring(0,i-2)+
                        romanNumber.charAt(i-1) +
                        nextDigit(romanNumber.charAt(i))+ romanNumber.substring(i+1);
            }
        }
        return romanNumber;
    }
    private static char nextDigit (char digit){
        return new DigitsMap().nextDigit(digit);
    }
    private static String getRomanNumber(int arabicNumber) {

        StringBuilder romanNumber = new StringBuilder();
        DigitsMap digitsMap = new DigitsMap();

        for (PairOfDigits digit: digitsMap.digits){
            while (arabicNumber >= digit.getArabic()){
                romanNumber.append(digit.getRoman());

                arabicNumber -=digit.getArabic();
            }
        }

        return romanNumber.toString();

    }


}

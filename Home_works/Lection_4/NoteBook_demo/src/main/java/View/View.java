package View;

import java.util.Locale;
import java.util.ResourceBundle;

    public class View {
    public final static String BUNNDLE_NAME = "messages";
    public final static String SPACE_LITTERAL = " ";
    public final ResourceBundle bundle = ResourceBundle.getBundle(BUNNDLE_NAME,new Locale("ua","UA"));

    public String messageBuilder(String... strings){
        StringBuilder result = new StringBuilder();
        for (String message: strings) {
            result.append(SPACE_LITTERAL + message);
        }
        return result.toString();
    }
    public void printInputMessage(String message){
        System.out.println(bundle.getString(TextConstants.INPUT_STRING_DATA));
        System.out.println(message);
    }
    public void printWrondDataMessage(String message){
        System.out.println(bundle.getString(TextConstants.WRONG_INPUT_DATA));
        System.out.println(message);

    }

}

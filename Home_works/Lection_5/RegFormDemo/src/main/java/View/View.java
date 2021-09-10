package View;

import java.util.ResourceBundle;

public class View {
    public ResourceBundle resourceBundle = ResourceBundle.getBundle("messages");

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printWrongDataMessage(String message){
        System.out.println(resourceBundle.getString(MessageConsts.WRONG_INPUT_MESSAGE));
        System.out.println(message);
    }
    public void printInputDataMessage(String message){
        System.out.println(resourceBundle.getString(MessageConsts.HEADER_MESSAGE));
        System.out.println(message);
    }

    public String concatMessages(String ...args){
        StringBuilder strBuilder = new StringBuilder();
        for (String str : args){
            strBuilder.append(str + MessageConsts.SPACE_LITTERAL);
        }
        return strBuilder.toString();
    }
}

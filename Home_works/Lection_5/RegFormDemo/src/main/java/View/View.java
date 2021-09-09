package View;

import java.util.ResourceBundle;

public class View {
    ResourceBundle resourceBundle = ResourceBundle.getBundle()
    public void printMessage(String message){
        System.out.println(message);
    }
    public void printWrongDataMessage(String message){
        //        some code
        //        some code
        System.out.println(message);
    }
    public void printInputDataMessage(String message){
        //        some code
        //        some code
        System.out.println(message);
    }
    
    /*public String concatMessages(String ...args){
        StringBuilder strBuilder = new StringBuilder();
        for (String str : args){
            strBuilder.append(str + );
        }
    }*/
}

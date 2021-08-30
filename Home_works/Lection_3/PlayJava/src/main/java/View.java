
public class View {
    public static final String START_GAME_MESSAGE = "Hi, try to guess the number";
    public static final String WRONG_DATA_INPUT_MESSAGE ="Wrong data input";
    public static final String DEFAULT_DATA_INPUT_MESSAGE ="Please enter the integer number";
    public static final String ATTEMPT_LIST_MESSAGE ="Your previous attempts: ";
    public static final String GAME_WINNER_MESSAGE ="Congratulations your guess is right";
    public static final String TOTAL_ATTEMPTS_MESSAGE ="Your total attempts  = ";

    public void showMessage(String message ){
        System.out.println(message);
    }
}

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Model {
    private int secretNumber;
    private int input;
    private int leftRange;
    private int rightRange;
    private List<Integer> attemptList;
    private boolean gameOver;

    public final static int DEFAULT_MIN_SECRET_NUMBER_VALUE = 0;
    public final static int DEFAULT_MAX_SECRET_NUMBER_VALUE = 100;

    public Model() {
        this.secretNumber = rand();
        setRanges();
        this.attemptList = new LinkedList<>();
        gameOver = false;
    }
    public Model(int min, int max) {
        this.secretNumber = rand(min, max);
        setRanges(min, max);
        this.attemptList = new LinkedList<>();
        gameOver = false;

    }

    private void setRanges(int min, int max){
        leftRange = min;
        rightRange = max;
    }
    private void setRanges(){
        leftRange = DEFAULT_MIN_SECRET_NUMBER_VALUE;
        rightRange = DEFAULT_MAX_SECRET_NUMBER_VALUE;
    }

    public int rand(int min, int max){
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public int rand(){
        return (int) (Math.random() * (DEFAULT_MAX_SECRET_NUMBER_VALUE - DEFAULT_MIN_SECRET_NUMBER_VALUE + 1)
                + DEFAULT_MIN_SECRET_NUMBER_VALUE);
    }

    public boolean setInput(int input) {
        if (input < getLeftRange() || input > getRightRange()) {
            return false;
        }

        this.input = input;
        refreshRanges();
        if (input == secretNumber){
            gameOver = true;
        }
        return true;

    }

    public boolean isGameOver() {
        return gameOver;
    }

    private void refreshRanges(){

        if (this.input<secretNumber){
            leftRange = this.input+1;
        }else if(this.input>secretNumber){
            rightRange = this.input-1;
        }

        attemptList.add(input);
    }

    public int getAttemptLength(){
        return attemptList.size();
    }

    public String getRangeAsString(){
        return " from "+ leftRange + " to "+ rightRange+ " ";
    }

    public String getAttemptListAsString() {
        return Arrays.toString(attemptList.toArray());
    }

    public int getLeftRange() {
        return leftRange;
    }

    public int getRightRange() {
        return rightRange;
    }
}

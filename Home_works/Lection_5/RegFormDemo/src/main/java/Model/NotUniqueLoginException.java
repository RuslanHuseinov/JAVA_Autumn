package Model;

public class NotUniqueLoginException extends Exception{


    public NotUniqueLoginException() {
        super();
    }

    public NotUniqueLoginException(String message) {
        super(message);
    }
}

package Exceptions;

public class EmployeeNotFoundException extends EmployeeException{
    public EmployeeNotFoundException() {
        super();
    }

    public EmployeeNotFoundException(String message) {
        super(message);
    }
}

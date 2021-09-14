package Interfaces;

import java.util.Scanner;

public interface Controller {
    public void init();
    public void setScanner (Scanner scanner);
    public View getView();
    Command[] getCommands();
    void setCommands(Command[] commands);
    public Company getCompany();
}

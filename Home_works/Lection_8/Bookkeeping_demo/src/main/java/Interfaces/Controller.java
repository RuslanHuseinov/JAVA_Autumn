package Interfaces;

import Model.Company;

import java.util.List;
import java.util.Scanner;

public interface Controller {
    public void init();
    public void setScanner (Scanner scanner);
    public View getView();
    Command[] getCommands();
    void setCommands(Command[] commands);
    public Company getCompany();
}

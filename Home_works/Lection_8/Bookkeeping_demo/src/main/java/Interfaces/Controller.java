package Interfaces;

import java.util.List;
import java.util.Scanner;

public interface Controller<T> {
    public void init();
    public void setScanner (Scanner scanner);
    public View getView();
    Command[] getCommands();
    void setCommands(Command[] commands);
    public List<T> getList();
}

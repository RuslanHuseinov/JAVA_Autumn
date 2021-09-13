package Interfaces;

import java.util.List;

public interface Command{
    public  void execute(Controller controller);
    public void setName(String name);
    public String getName();
}

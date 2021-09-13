package Interfaces;

import java.util.List;

public interface Command<T>{
    public  void execute(T object);
    public void setName(String name);
    public String getName();
}

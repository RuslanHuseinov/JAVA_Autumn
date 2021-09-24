package Controller;

import Interfaces.Command;

import java.util.HashMap;

public class Switch {
    public final HashMap<String, Command> commandHashMap = new HashMap<>();

    public void register(String commandName, Command command){
        commandHashMap.put(commandName,command);
    }
    public void execute(String commandName){
        Command command = commandHashMap.get(commandName);
        if (command == null){
            throw new IllegalStateException("no such command exist");
        }command.execute();
    }
}

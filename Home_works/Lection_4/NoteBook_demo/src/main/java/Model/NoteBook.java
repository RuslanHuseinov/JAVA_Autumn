package Model;

import java.io.Serializable;

public class NoteBook implements Serializable {
    private static final long serialVersionUID =2998571354858548381L;
    String name;
    String login;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}

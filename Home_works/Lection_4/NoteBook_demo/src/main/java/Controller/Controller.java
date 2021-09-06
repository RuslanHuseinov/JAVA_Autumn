package Controller;

import Model.Model;
import Model.NoteBook;
import View.View;


import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Controller {
    View view;
    Model model;
    public static final String REGEX_PROPP = "regex";
    private static final ResourceBundle controllerBundle = ResourceBundle.getBundle(REGEX_PROPP,new Locale("",""));

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void start(){
        Scanner scanner = new Scanner(System.in);
        NoteBook userNoteBook  = new NoteBookUtilities(this.view,scanner,this.controllerBundle).Note();
    }
}



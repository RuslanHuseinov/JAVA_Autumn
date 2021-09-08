package Controller;

import Model.Model;
import View.View;

public class Controller {
    View view;
    Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }
}

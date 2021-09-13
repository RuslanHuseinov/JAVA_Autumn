import Interfaces.Controller;
import Controller.BookkeepingController;
import View.*;

public class Main {
    public static void main(String[] args) {
        Controller controller = new BookkeepingController(new BookkeepingView());
        controller.init();

    }
}

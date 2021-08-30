import java.util.Scanner;

public class Controller {
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    private Model model;
    private View view;

    public void start() {
        view.showMessage(View.START_GAME_MESSAGE);
        Scanner scanner = new Scanner(System.in);

        do {
            view.showMessage(View.DEFAULT_DATA_INPUT_MESSAGE + model.getRangeAsString());

            while (!scanner.hasNextInt()) {
                view.showMessage(View.WRONG_DATA_INPUT_MESSAGE);
                scanner.next();
            }

            int inputValue = scanner.nextInt();

            if (model.setInput(inputValue)) {
                view.showMessage(View.ATTEMPT_LIST_MESSAGE + model.getAttemptListAsString());

            } else {
                view.showMessage(View.WRONG_DATA_INPUT_MESSAGE);
            }

        } while (!model.isGameOver());

        view.showMessage(View.GAME_WINNER_MESSAGE);
        view.showMessage(View.TOTAL_ATTEMPTS_MESSAGE + model.getAttemptLength());
    }

}

import Interfaces.Emoployee;

public class Main {
    public static void main(String[] args) {
        Emoployee employeers[] = new Emoployee[10];
        for (Emoployee e: employeers
             ) {
            e.getName();
            e.getSalary();

        }
    }
}

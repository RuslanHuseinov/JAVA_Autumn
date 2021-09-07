import java.io.IOException;

public class App {
    public static void main(String[] args) {
        System.err.println("#1.in");
        try {
            f();
        }catch (Error error){
            System.err.println("error catch");
        }
        System.err.println("#1.out");
    }

    public static void f() {
        System.err.println(".   #2.in");
        g(); // создаем фрейм, помещаем в стек, передаем в него управление
        System.err.println(".   #2.out");  //вернулись
    } // выходим из текущего фрейма, кончились инструкции

    public static void g() {
        System.err.println(".   .   #3.in");
        h(); // создаем фрейм, помещаем в стек, передаем в него управление
        System.err.println(".   .   #3.out"); // вернулись
    } // выходим из текущего фрейма, кончились инструкции

    public static void h() {
        System.err.println(".   .   .   #4.in");
        if (true) {
            System.err.println(".   .   .   #4.THROW");
            throw new Error();
        }
        System.err.println(".   .   .   #4.out"); // ПРОПУСКАЕМ
    }
    public static int area(int width, int height){
        if (width < 0 || height < 0){
            throw new IllegalArgumentException("Negative sizes: w = " + width + ", h = " + height);
        }
        return height * width;
    }
}

import java.io.IOException;

public class App {
    public static void main(String[] args){
        try {
            throw new Error();

        }catch (Exception exc){
            if (exc instanceof RuntimeException){
                System.out.println("this is runtime exc");
            }else System.err.println("not a runtime exc");
        }
    }

    public static void f() {
        System.err.println(".   #2.in");
        try {
            g();
        }catch (Error error){
            System.err.println("error catch");
        }
        System.err.println(".   #2.out");
    }

    public static void g() {
        System.err.println(".   .   #3.in");
        try {
            h();
        }catch (Error error){
            System.err.println("error catch");
//            System.out.println("error catch");
        }
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

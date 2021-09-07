import java.io.IOException;

public class App {
    public static void main(String[] args) {
        System.out.println("hello error");
        String str = infinity()==null?"":infinity();
        System.out.println(str);
    }
    public static int area(int width, int height){
        if (width < 0 || height < 0){
            throw new IllegalArgumentException("Negative sizes: w = " + width + ", h = " + height);
        }
        return height * width;
    }

    public static void foo(NullPointerException exc){
        try {
            throw exc;
        }catch (NullPointerException sameExc){
            foo(sameExc);
        }
    }

    public static String infinity() /*throws Throwable*/{
//        throw new IOException();
//        throw new ArithmeticException();
        throw new NullPointerException();
//        System.exit(0);
//        throw new Error();
    }
}

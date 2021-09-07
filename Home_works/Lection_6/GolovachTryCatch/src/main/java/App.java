import java.io.IOException;

public class App {
    public static void main(String[] args){
        try {
            Throwable exc = new Error();
            throw  exc;
        }catch (RuntimeException exc){
            System.err.println("runtime catched");
        }catch (Exception exc){
            System.err.println("exception catched");
        }catch (Throwable exc){
            System.err.println("throwable catched");
        }






//        try {
//            System.err.print(" 0");
//            if (true) {throw new RuntimeException();}
//            System.err.print(" 1");
//        } catch (RuntimeException e) {
//            System.err.print(" 2");
//            try {
//                System.err.print(" 3");
//                if (true) {throw new Error();}
//                System.err.print(" 4");
//            } catch (Throwable t) {
//                System.err.print(" 5");
//            }
//            System.err.print(" 6");
//        } catch (Error e) {
//            System.err.print(" 7");
//        }
//        System.err.println(" 8");

    }
    // 0 2 3 5 6 8
}

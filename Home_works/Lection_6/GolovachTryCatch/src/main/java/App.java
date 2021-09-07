public class App {
    public static void foo(NullPointerException exc){
        try {
            throw exc;
        }catch (NullPointerException sameExc){
            foo(sameExc);
        }
    }
    public static void main(String[] args) {
        foo(null);
    }
}

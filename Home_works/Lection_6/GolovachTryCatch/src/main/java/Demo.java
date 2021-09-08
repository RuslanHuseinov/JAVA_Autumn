import java.io.IOException;
import java.rmi.AccessException;

public class Demo {
    public static void main(String[] args) {
        Parent object = new Child();
        Child child = new Child();

    }

    /*public static void doSome(Parent instance) throws AccessException {
        instance.foo();
    }*/
    public static void doSome(Child instance) throws AccessException {
        instance.foo();
    }
}

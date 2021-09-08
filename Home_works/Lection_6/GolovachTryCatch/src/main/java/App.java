import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Throwable{
    try {
        Throwable exc = new Exception();
        throw exc;
    }catch (Exception e){
        e.printStackTrace();
    }
    }
    public static void foo(){
        throw new MyUncheckedException();
    }
    public static void foo1()throws Exception{

            throw new MyCheckedException();

    }
    public static void foo2() throws Throwable{
        Throwable exception = new MyCheckedException();
        throw exception;
    }


}

package interView.frequentlyAsked_by_kirill;

//https://interviewnoodle.com/exception-in-java-89a0b41e0c45

//usually we cant recover from error
//Runtime exceptions and errors are UNHANDLED
//TODO we have to declare or catch Handled Exceptions
public class Exceptions {
    public static void main(String[] args) {
        try {
            int a = 1;
            // we can catch Errors but we shouldn't
            // Please note that the Java Virtual Machine throws errors to indicate severe
            // problems from which it can’t recover, such as lack of memory and stack overflows, among others.
            throw new OutOfMemoryError();
        } catch(OutOfMemoryError e){
            //if we get some kind of JVM error we will not be able to catch or finally it
            System.out.println(e);
            System.out.println("recovered?");
        }
        finally {
            System.out.println("finally");
        }
    }

}

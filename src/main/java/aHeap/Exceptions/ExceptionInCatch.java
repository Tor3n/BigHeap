package Exceptions;

public class ExceptionInCatch {
    public static void main(String[] args) throws Exception{
        try{
            try{
                System.out.println("IN TRY");
                throw new Exception();
            } catch (Exception e){
                System.out.println("In catch we are");
                throw new Exception();
            } finally{
                System.out.println("finally");
            }
        } catch (Exception e){
            System.out.println("In outer catch");
        }

    }
}

package interView;

public class TryCatchReturn {

    public static void main(String[] args) {
        System.out.println(tryCatch());
    }

    public static int tryCatch(){
        try{
            throw new Exception("e");
            //return 1;
        }catch (Exception ignored){
            return 2;
        } finally {
            return 3;
        }
    }
}

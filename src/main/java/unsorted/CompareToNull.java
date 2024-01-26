package unsorted;

public class CompareToNull {
    public static void main(String[] args) {
        Integer a = null;
        Integer b = 1;
        try{
            if((Integer) Integer.parseInt("1")!=null){
                System.out.println("asdfasdf");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

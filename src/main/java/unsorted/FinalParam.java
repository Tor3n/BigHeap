package unsorted;

public class FinalParam {
    public static void main(String[] args) {
        FinalParam f = new FinalParam();
        String ss = "A";
        System.out.println(f.checkNotFinal(ss));
        System.out.println(ss);
    }

    public void checkFinal(final String param){
        //error
        //param = "AAAZZZAZA";
    }

    public String checkNotFinal(String param){
        param = "AAAZZZAZA";
        return param;
    }

}

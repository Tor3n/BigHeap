package unsorted;

import java.util.ArrayList;
import java.util.Arrays;

public class TestNulls {
    public static void main(String[] args) {

        ArrayList<String[]> res = new ArrayList<String[]>();
        String[] typeind = {"LOV", "GTD" , "NUMKOR"};
        String[] valind = {"S", null, "asdfasdf"};

        String inl =null, inG = null, inN = null;
        for (int i = 0; i < typeind.length; i++) {
            String value = valind[i];
            String type = typeind[i];
            if ("NUMKOR".equals(type)){
                inN=value;
            } else if("GTD".equals(type)){
                inG = value;
            }
        }
        res.add(new String[]{inN, inG});


        System.out.println(res.get(0)[0]+", "+res.get(0)[1]);
    }

    public static void tessssst(String[] args){
        StringBuilder sb = new StringBuilder();
        sb.append("HALO, TESTING, ");
        for (int i = 0; i < args.length; i++) {
            sb.append(Arrays.asList(args).get(i));
        }
        System.out.println(sb);
    }

    public static String sets(String one, String two, String three){
        String result = "SELECT * FROM kek \n"+
                " where depo " + (one.equals("")? " IS NULL " : " = '"+two+"'");
        return result;
    }
}





























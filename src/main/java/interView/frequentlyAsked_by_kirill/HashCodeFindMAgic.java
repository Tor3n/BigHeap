package interView.frequentlyAsked_by_kirill;

import java.util.HashMap;

public class HashCodeFindMAgic {
    public static void main(String[] args) {
          int a = 0;
         //System.out.println(a=hash("ggsdfg"));
         //System.out.println(4 & (a=hash("2342rf")));

        System.out.println(15 & (a=hash("abc")));
        System.out.println(15 & (a=hash("ddaf")));
        System.out.println(15 & (a=hash("asdfasdf")));
        System.out.println(15 & (a=hash("Hello")));

        //11 6 4
        HashMap<String, String> map = new HashMap<>();
        map.put("abc","CCC");
        map.put("ddaf","CCC");
        map.put("asdfasdf","CCC");
        map.put("Hello","CCC");
        map.put("abc","CCC");

    }

    static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }


}

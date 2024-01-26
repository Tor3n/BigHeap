package unsorted;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Labels {

    public static void main(String[] args) throws JsonProcessingException {
        String[] names = new String[]{"ad","asdf"};
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode rootNode = mapper.createObjectNode();
        String v = null;
        rootNode.put("s", "l");
        rootNode.put("ss", "l");
        rootNode.put("sssv", v==null?null:"ыва");
        //System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(rootNode));

        Object[][] result = new Object[2][3];
        result[0][0]= "aaa";    result[1][0]= "bbb";
        result[0][1]= "aaaa";   result[1][1]= "bbbb";
        result[0][2]= "aaaaa";  result[1][2]= "bbbbb";

        /*for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0]);
            System.out.println(result[i][1]);
            System.out.println(result[i][2]);
        }*/
        //System.out.println("*****************************");
        //System.out.println(Arrays.deepToString(result));

        myLabel: for (int i = 0; i < 5; i++) {
            System.out.println("opper "+i);
            for (int j = 0; j < 6; j++) {
                if(j==2){
                    continue myLabel;
                }
                System.out.println("    inner "+j);

            }

        }

        //System.out.println(mp);
    }
}

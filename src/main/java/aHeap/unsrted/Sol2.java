package aHeap.unsrted;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Sol2 {
    int a;
    int b;
    String c;

    {
        var d = 0;
    }

    public static void main(String[] args) throws JsonProcessingException {
        String[] names = new String[]{"ad","asdf"};
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode rootNode = mapper.createObjectNode();
        String v = null;
        rootNode.put("s", "l");
        rootNode.put("s", v);
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(rootNode));
    }


    public void setkk(String k){
        System.out.println("����");
        System.out.println("heheh");
        var st = "d";
    }

    public void setA(int a){
        this.a = a;
    }

    public int getA(){
        return this.a;
    }
}

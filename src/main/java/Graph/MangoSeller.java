package Graph;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class MangoSeller {
    static HashMap<String, String[]> frends;
    static LinkedList<String> mainQue;

    static boolean isSeller(String name){
        return name.endsWith("om");
    }

    static void graphDataStarter(){
        frends = new HashMap<>();
        mainQue = new LinkedList();
        frends.put("I", new String[]{"Bob", "Alise", "Claire"});
        frends.put("Alise", new String[]{"Peggie"});
        frends.put("Bob", new String[]{"Peggie", "Aunje"});
        frends.put("Claire", new String[]{"Tom", "Jonnie"});
    }

    public static void main(String[] args) {
        graphDataStarter();
        mainQue.add("I");
        while(true){
            String popName = mainQue.pop();
            if(isSeller(popName)){
                System.out.println("You've found it!");
                return;
            }

            String[] nameFriends = frends.get(popName);
            for(String friendName : nameFriends){
                if(!mainQue.contains(friendName)){
                    mainQue.add(friendName);
                }
            }
            //mainQue.addAll(Arrays.asList(frends.get(popName)));
        }

    }


}

package HashmapAnalisys;


import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.reflect.*;
import java.util.Map;
import java.util.Set;

public class HashLogic {

    static Object table;

    public static JTree printMapParams(Map initMap, JTree tree, DefaultMutableTreeNode top) throws NoSuchFieldException, IllegalAccessException{
        Set<Map.Entry<Fruit, Integer>> ent = initMap.entrySet();
        Object[] meArr =  ent.toArray();

        DefaultMutableTreeNode node = null;

        Class mapClass = initMap.getClass();
        Field nodeArr = mapClass.getDeclaredField("table");
        nodeArr.setAccessible(true);
        table = nodeArr.get(initMap);

        for(Object tableNode : (Object[]) table){
            if(tableNode!=null){
                addNextOrExit(tableNode, top);
            } else {
                node = new DefaultMutableTreeNode(("empty bucket"));
                top.add(node);
            }
        }

        return tree;
        /*
          Field hash = objgetDeclaredField("hash");
          Field next = obj.getDeclaredField("next");
          Field key = obj.getDeclaredField("key");
          Field value = obj.getDeclaredField("value");
        value.setAccessible(true); */
    }

    private static void addNextOrExit(Object tnField, DefaultMutableTreeNode treeNode ) throws NoSuchFieldException, IllegalAccessException {
        if (tnField==null){
            return;
        }
        Class tnFieldClass = tnField.getClass();
        Field tnFieldNextField = tnFieldClass.getDeclaredField("next");
        tnFieldNextField.setAccessible(true);
        Object next = tnFieldNextField.get(tnField);

        String keySimpleName=null;
        String valueSimpleName=null;

        DefaultMutableTreeNode node = new DefaultMutableTreeNode();
        Class obj = tnField.getClass();
        Field[] fields = obj.getDeclaredFields();
        StringBuilder nodeSB = new StringBuilder();
        for(Field f : fields){
            nodeSB.append(f.getName());
            f.setAccessible(true);

            if(f.getName().equals("key")){
                //for extensive inside info
                if(f.get(tnField)==null){
                    //key might be null
                    nodeSB.append("{ null }");
                } else {
                    keySimpleName = f.get(tnField).toString();
                    Field insideObject = obj.getDeclaredField("key");
                    insideObject.setAccessible(true);
                    Object insiddee = insideObject.get(tnField);

                    Class insideCl = insiddee.getClass();
                    Field[] fieldsOfInsideClass = insideCl.getDeclaredFields();
                    StringBuilder keyObjSB = new StringBuilder();
                    keyObjSB.append("{");
                    keyObjSB.append(System.lineSeparator());
                    keyObjSB.append(" classname : ").append(insideCl.getSimpleName()).append(", ");
                    for(Field ff : fieldsOfInsideClass){
                        ff.setAccessible(true);
                        keyObjSB.append(ff.getName()).append(" : ").append(ff.get(insiddee)).append(", ").append(System.lineSeparator());
                    }
                    if(!keyObjSB.toString().contains("hash")){
                        keyObjSB.append("hash: "+insiddee.hashCode());
                    }

                    //(length-1)&hash
                    keyObjSB.append("attribute of the same bucket: ((length-1)&hash): "+((((Object[]) table).length-1) & insiddee.hashCode()));
                    keyObjSB.append(System.lineSeparator());

                    keyObjSB.append(" }");
                    //System.out.println(keyObjSB.toString());
                    nodeSB.append(" : ").append(keyObjSB.toString()).append(" ");
                }
            } else{
                nodeSB.append(" : ").append(f.get(tnField)).append(" ");
            }

            if(f.getName().equals("value")){
                valueSimpleName=f.get(tnField).toString();
            }

            nodeSB.append(System.lineSeparator());
        } //for




        String finalKeySimpleName = keySimpleName;
        String finalValueSimpleName = valueSimpleName;
        ArrayList<String> o = new ArrayList<String>(){
            @Override
            public String toString(){
                return ""+ finalKeySimpleName +" -> "+finalValueSimpleName;
            }
        };
        o.add(nodeSB.toString());

        node.setUserObject(o);
        treeNode.add(node);
        addNextOrExit(next, node);
    }
    
}

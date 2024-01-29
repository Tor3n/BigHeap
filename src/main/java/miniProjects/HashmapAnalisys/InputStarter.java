package miniProjects.HashmapAnalisys;

import java.util.HashMap;

public class InputStarter {
    static HashMap<String, Integer> initDataMap;
    static HashMap<Fruit, Integer> initDataMap1;

    public static HashMap<Fruit, Integer> initData1(){
        Fruit f1 = new Fruit("Apple", 0.3);
        Fruit f2 = new Fruit("Apricot", 0.2);
        Fruit f3 = new Fruit("Arbus", 0.66);
        Fruit f4 = new Fruit("Anon", 0.5);
        Fruit f5 = new Fruit("Ananase", 1.3);
        Fruit f6 = new Fruit("nnima1l", 1.9);
        Fruit f7 = new Fruit("aaaA", 1.91);
        Fruit f8 = new Fruit("bbfA", 1.922);
        Fruit f9 = new Fruit("asdfas", 1.94);
        Fruit f10 = new Fruit("Bananas", 1.1922);
        Fruit f11 = new Fruit("Baton", 1.1922);
        Fruit f12 = new Fruit("Natawa", 1.9);
        Fruit f13 = new Fruit("Naftalin", 1.9);

        initDataMap1 = new HashMap<>();
        initDataMap1.put(f1,1);
        initDataMap1.put(f2,2);
        initDataMap1.put(f3,3);
        initDataMap1.put(f4,4);
        initDataMap1.put(f5,5);
        initDataMap1.put(f6,6);
        initDataMap1.put(f7,7);
        initDataMap1.put(f8,8);
        initDataMap1.put(f9,9);
        initDataMap1.put(f10,10);
        initDataMap1.put(f11,11);
        initDataMap1.put(f12,10);
        initDataMap1.put(f13,11);

        return initDataMap1;
    }

    public static HashMap<String, Integer> initData(){

        initDataMap = new HashMap<>();
        initDataMap.put("Halo",1);
        initDataMap.put("Hi",2);
        //initDataMap.put("Salut",3);
        initDataMap.put("Bonjour",4);
        initDataMap.put("SalamatSizbi",5);
        initDataMap.put("Privet",6);
        initDataMap.put("Hola",7);
        initDataMap.put("Konichiva",8);
        initDataMap.put("HEH",9);
        initDataMap.put("KKKEKASDkasdf",10);
        initDataMap.put("ASDASD",11);
        initDataMap.put("Salami",12);
        initDataMap.put("Salamatstvuiu",5);
        initDataMap.put(null,5);
        initDataMap.put(null,25);

        return initDataMap;
    }

}

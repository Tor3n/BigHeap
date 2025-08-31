package aHeap.SingleTones;

public class JustStaticFieldSingletone {

    private static JustStaticFieldSingletone instance = new JustStaticFieldSingletone();

    public static JustStaticFieldSingletone getInstance(){

        return instance;
    }

    private JustStaticFieldSingletone(){

    }

}

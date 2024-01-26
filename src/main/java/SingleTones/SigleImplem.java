package SingleTones;

public class SigleImplem {

/*

    Because the Java programming language is multithreaded, initialization of a class or interface requires careful synchronization

    The implementation of the Java Virtual Machine is responsible for taking care of synchronization and recursive initialization

 */

    public static void main(String[] args) {
        SingleTone ss =SingleTone.getInstance();
        SingleTone ss2 =SingleTone.getInstance();
        SingleTone ss3 =SingleTone.getInstance();
        SingleTone ss5 =SingleTone.getInstance();
        System.out.println(ss.hashCode());
        System.out.println(ss2.hashCode());
        System.out.println(ss3.hashCode());
        System.out.println(ss5.hashCode());
    }
}

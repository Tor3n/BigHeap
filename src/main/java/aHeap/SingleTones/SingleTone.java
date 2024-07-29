package aHeap.SingleTones;

public class SingleTone {

    final int k = 1;
    public static final int h = 2;

    public static SingleTone getInstance(){
        return SingleHelper.INSTANCE;
    }

    private static class SingleHelper{
        private static final SingleTone INSTANCE = new SingleTone();
    }

    private SingleTone(){
        System.out.println("HALO");
    }
}

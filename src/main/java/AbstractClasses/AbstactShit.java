package AbstractClasses;

public abstract class AbstactShit {
    int a;
    String b;

    public AbstactShit(int a){
        this.a = a;
    }

    protected void insert_logs(String aa){
        System.out.println("initial abstract shit");
    }

    public abstract void hehe();
}

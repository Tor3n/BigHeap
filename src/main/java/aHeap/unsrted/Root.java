package aHeap.unsrted;

public class Root {
    private StringBuilder builder=new StringBuilder("private stringbuilder");
    public static void main(String[] args) {
        Root root = new Branch();
        //root.method1();
        Branch branch = (Branch) root;
        //branch.method1();
    }

    public void method1() {
        System.out.println("root");
    }

    String variab = "var before";
    String variab1 = "var0";

    public StringBuilder getBuilder(){
        return builder;
    }
}

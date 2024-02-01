package Classess;

public class ClassB extends ClassA{

    int a = 22;

    public int lel(){
        return 2;
    }

    public static void main(String[] args) {
        ClassB b = new ClassB();
        System.out.println("Just usual shit "+b.a+" "+b.lel());
        ClassA b2 = new ClassB();
        System.out.println("Unusual shit "+b2.a+" "+b2.lel());

        b.superTest();
    }

    public void superTest(){
        ClassA b2 = new ClassB();
        System.out.println("Crazy shit "+b2.a+" "+super.lel());
    }

}

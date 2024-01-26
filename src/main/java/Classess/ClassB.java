package Classess;

public class ClassB extends ClassA{

    int a = 22;

    public int lel(){
        return 2;
    }


    //public static void lelele(String[] args){
    //    System.out.println("overloaded");
   // }

    public static void main(String[] args) {
        ClassB b = new ClassB();
        //System.out.println("Just usual shit "+b.a+" "+b.lel());
        ClassA b2 = new ClassB();
        //System.out.println("Unusual shit "+b2.a+" "+b2.lel());

        lelele(new String[]{"hah"});
       // b.eatShIT();
        /*b.first();
        b.heh();
        b.lel();
        b.lelele();*/

       // b.lelele(new String[]{"heh"});
        //ClassA.lelele(new String[]{"heh"});


    }

    public void eatShIT(){
        ClassA b2 = new ClassB();
        System.out.println("Crazy shit "+b2.a+" "+super.lel());
    }

}

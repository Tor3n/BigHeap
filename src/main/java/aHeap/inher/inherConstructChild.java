package aHeap.inher;

public class inherConstructChild extends InherConstruct{

    @Override
    void call(){
        a=147;
        System.out.println("child: "+a);
    }

    public inherConstructChild(){
        //super();
        call();
    }

}

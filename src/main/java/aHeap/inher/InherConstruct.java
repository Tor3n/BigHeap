package aHeap.inher;

public class InherConstruct {
    int a = 42;

    void call(){
        System.out.println("parent: "+a);
    }

    InherConstruct(){
        //this call goes straight to child
        call();
    }

}

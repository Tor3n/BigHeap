package interView;

class Dog{}

public class linkTransferObj {

    public static void main(String args[]) {
        //объект dog в хипе всего один, пультов управления два (один внутри метода)
        //Так что теперь все, что B делает объекту Cat, повлияет на Cat, на который указывает A, но это не повлияет на содержимое A!
        Dog bark = new Dog();
        System.out.println(bark+" 1");
        alter(bark);
        System.out.println(bark+" 2");
    }

    //изменили пульт управления, на bark никак не повлияло
    public static void alter(Dog bark) {
        System.out.println(bark+" 3");
        bark=new Dog();
        System.out.println(bark+" 4");
    }
}

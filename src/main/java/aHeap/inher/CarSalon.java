package inher;

public class CarSalon {
    public static void main(String[] args){
        Car myCar = (Car) new Duster();
        System.out.println(myCar.getInfo());
    }

    public void testFunc(String...args){
        
    }
}

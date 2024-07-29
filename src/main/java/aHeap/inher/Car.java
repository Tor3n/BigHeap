package aHeap.inher;

public class Car {
    private int hp;
    private int color;
    private int weight;
    private String brand;

    public Car(){
      hp=1;
      color=777;
      weight=1000;
      brand="lada";
    }

    public final void isFinalOv(){

    }

    public Car(int hp,int color,int weight, String brand){
        this.hp = hp;
        this.color=color;
        this.weight=weight;
        this.brand=brand;
    }

    public String getInfo(){
        return "this car's parameters: "+brand+", "+hp+", "+color+", "+weight;
    }
}

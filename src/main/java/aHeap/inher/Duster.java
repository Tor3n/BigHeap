package aHeap.inher;

import aHeap.inher.Car;

public class Duster extends Car {
    private boolean fourXfour;



    public Duster(){
        super(2,8888,1500, "renault");
        fourXfour=true;
    }

    @Override
    public String getInfo(){
        return super.getInfo()+", "+fourXfour;
    }
}

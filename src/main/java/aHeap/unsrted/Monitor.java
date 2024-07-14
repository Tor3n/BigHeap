package aHeap.unsrted;

public class Monitor {
    String model;
    double price;

    @Override
    public boolean equals(Object object) {
        if (object instanceof Monitor) {
            Monitor other = (Monitor) object;
            return model.equals(other.model) && price == other.price;
        }
        return false;
    }


}

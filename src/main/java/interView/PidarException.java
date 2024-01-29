package interView;

public class PidarException {

    public static void main(String[] args) {
        try{
            throw new RuntimeException("a");
        } catch(RuntimeException e){
            throw new RuntimeException(e);
        }
        finally {
           PidarException ee = new PidarException();
           ee.kek();
        }
    }

    public void kek() {
        System.out.println("123");
    }

}

package lambdas;

public class lambdaRunnableExample {
    volatile boolean flag = false;

    Runnable r1 = () -> {
        System.out.println("r1 started");
        try{
            synchronized (this){
                this.wait(500);
            }
            flag = true;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    };

    public void doTheJob() throws InterruptedException {
        while (true){
            System.out.println("connecting... "+" flag is: "+flag);
            synchronized (this){
                this.wait(100);
            }
            if (flag){
                System.out.println("harosh");
                return;
            }

        }
    }

    public static void main(String[] args) throws InterruptedException {
        lambdaRunnableExample e = new lambdaRunnableExample();
        Thread t1 = new Thread(e.r1);
        t1.start();
        e.doTheJob();
    }
}

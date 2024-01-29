package interView;

public class inherr {
}

class Super {
    public int index = 1;
}

class App extends Super {

    public App(int olo) {
        this.index = olo;
    }

    public static void main(String args[]) {
        App myApp = new App(10);
        System.out.println(myApp.index);
    }
}
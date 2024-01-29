package interView;

class TestApp {
    protected int x, y;
}

public class iniTzero {
    int zz;
    public static void main(String args[]) {
        TestApp app = new TestApp();
        System.out.println(app.x + " " + app.y);
        iniTzero iz = new iniTzero();
        System.out.println(iz.zz);
    }

}

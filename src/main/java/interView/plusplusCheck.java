package interView;

public class plusplusCheck {

    public static void main(String args[]) {
        int index = 0;
        boolean flag = true;
        boolean reg1 = false, reg2;
        reg2 = (flag | ((index++) == 0));
        reg2 = (reg1 | ((index += 2) > 0));
        System.out.println(index);
    }
}

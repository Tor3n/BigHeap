package interView;

class Cat{}

public class linkTransferBasic {

    public static void main(String[] args) {
        int x = 3;
        int y = x;
        //Выражение у = х; НЕ означает "записать x в y". Оно означает "скопировать значение внутри х и записать эту копию в у".
        System.out.println(x+" "+y);
        x=6;
        System.out.println(x+" "+y);

        Cat A = new Cat();
        Cat B = A;
        System.out.println(A);
        System.out.println(B);
    }
}


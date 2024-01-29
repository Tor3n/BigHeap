package interView;

class CodeA {
    public String type = "A ";
    public CodeA() {
        System.out.print("CodeA ");
    }
}

public class ConstrPird extends CodeA {
    public ConstrPird() {
        System.out.print("CodeB ");
    }

    void go() {
        type = "B ";
        System.out.print(this.type + super.type+type);
    }

    public static void main(String[] args)
    {
        new ConstrPird().go();
    }
}
package aHeap.unsrted;

public class SOL {
    public static void main(String[] args) {
        Branch br = new Branch();
        br.method1();

        System.out.println(br.variab);
        Root rt = br;
        rt.method1();

        System.out.println(rt.variab);
    }
}

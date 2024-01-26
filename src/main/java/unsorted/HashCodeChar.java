package unsorted;

public class HashCodeChar {
    public static void main(String[] args) {
        String ch = "a";
        String ch1 = "A";
        String ch2 = "A";
        String ch3 = "B";
        System.out.println(ch.hashCode());
        System.out.println(ch1.hashCode());
        System.out.println(ch2.hashCode());
        System.out.println(ch3.hashCode());
    }
}

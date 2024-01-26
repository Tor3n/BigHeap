package commonProblems.reverseAstring;

public class ReverseAstring {
    public static void main(String[] args) {
        //             123456789
        String init = "POLI";
        char[] initChar = init.toCharArray();
        //System.out.println(initChar.length/2);
        for (int i = 0; i < initChar.length/2; i++) {
            char b = initChar[i];
            initChar[i]=initChar[initChar.length-i-1];
            initChar[initChar.length-i-1] = b;
        }
        System.out.println(String.valueOf(initChar));
    }
}

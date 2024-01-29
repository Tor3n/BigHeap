package interView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inputstreamCheck {
    public static void main(String args[]) throws IOException {
        char bit;
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        do {
            bit = (char) obj.read();
            System.out.print(bit);
        } while (bit != 'q');
    }
}

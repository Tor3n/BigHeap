package IO;


import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class IOTest {
    public static void main(String[] args) throws Exception {
        IOTest.test(new byte[]{1,2,3,4,5,6,7});
    }

    static void test(byte[] heh) throws IOException {
          InputStream is = new ByteArrayInputStream(heh);
          byte[] bb = new byte[10];
          is.read(bb);
          System.out.println(Arrays.toString(bb));
    }
}

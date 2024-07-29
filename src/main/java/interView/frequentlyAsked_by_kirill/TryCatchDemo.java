package interView.frequentlyAsked_by_kirill;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.Scanner;
import java.util.function.Supplier;

public class TryCatchDemo {

    //вернет из finally
    @Test
    public void tryCatchDemo(){

        Supplier<Integer> integerSupplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                try {
                    return 1;
                } catch (Exception ignored) {
                    return 2;
                } finally {
                    return 3;
                }
            }
        };
        System.out.println(integerSupplier.get());
        Assertions.assertNotEquals(1, integerSupplier.get());
        Assertions.assertEquals(3, integerSupplier.get());
    }

    @Test
    public void tryCatchFinallyResource_Demo() throws URISyntaxException, FileNotFoundException {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(getClass().getClassLoader().getResource("test.txt").toURI()));
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
                throw new RuntimeException("Something happened on reading");
            }
        } finally {
            if (scanner != null) {
                scanner.close();

                //TODO only this will happen ( we lost previous runtime exception)
                throw new RuntimeException("Something happened on closing");
            }
        }
    }

    //autoclosable example
    @Test
    public void tryWithResource_Demo() throws URISyntaxException {
        try (Scanner scanner = new Scanner(new File(getClass().getClassLoader().getResource("test.txt").toURI()))) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

package interView.frequentlyAsked_by_kirill;

import aHeap.SingleTones.SingleTone;
import interView.frequentlyAsked_by_kirill.testClasses.BadHashDistribution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Optional;

public class Optionals {
    //Optionals нужны чтобы запревентить НПЕ
    //Обычно возвращают Optional

    @Test
    public void optionalOf_Demo1() {

        //сли какое-то поле Null optional вернет Optional.empty()
        //this map method is inside optional class
        Assertions.assertEquals(Optional.empty(), Optional.of(new BadHashDistribution(null)).map(v -> v.getName()));

        //TODO Optional.of() может произвести старный добрый NPE
        //or else выписывает нечто другое, если контейнер пустой
        Assertions.assertThrows(NullPointerException.class, () -> Optional.of(null).orElseGet(() -> "default"));
    }


    @Test
    public void optionalOfNullable_Demo() {
        Assertions.assertEquals(Optional.empty(), Optional.ofNullable(null));

        //TODO we have to use ofNullable if an Object might be Null
        String name = null;
        Assertions.assertDoesNotThrow(() -> Optional.ofNullable(name).orElseGet(() -> "default"));
    }


}

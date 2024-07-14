package aHeap.unsrted;

import reception.SomeClass;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Refl {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        SomeClass ww = new SomeClass();
        Method m = SomeClass.class.getDeclaredMethod("sendSmthTo", String.class, String.class, String.class);
        m.setAccessible(true);
        System.out.println((String) m.invoke(ww, new Object[]{"asda", "as", "aaaa"}));
    }
}

package Reflection;

import java.lang.reflect.Field;

public class ReflecTionClass {
    public static void main(String[] args) {
        ClassB bb = new ClassB();

        Class<?> bbClass = bb.getClass();
        //Field[] ff = bbClass.getDeclaredFields();

        Class<?> bbSUper = bbClass.getSuperclass();
        Field[] ff2 = bbSUper.getDeclaredFields();
        System.out.println(ff2.length);

    }
}


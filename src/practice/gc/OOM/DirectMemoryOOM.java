package practice.gc.OOM;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * VMargs: -XX:DirectMemorySize=10M
 *
 */
public class DirectMemoryOOM {

    private static final int ONE_MB = 1024 * 1024;

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Field field = Unsafe.class.getDeclaredField("theUnsafe");
        field.setAccessible(true);
        Unsafe unsafe = (Unsafe) field.get(null);
        while (true) {
            unsafe.allocateMemory(ONE_MB);
        }
    }

}
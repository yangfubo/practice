package practice.classHeaderDataPadding;

import jdk.nashorn.internal.ir.debug.ObjectSizeCalculator;

/**
 * VM orgs: -XX:+PrintCommandLineFlags 压缩指针默认开启
 */
public class ClassHeaderAndDataAndPadding {
    // 对象头 1.标记字（8） 2.压缩类型指针（4）
    int a; // 4
    byte b1;
    byte b2;
    byte b3; // b1(1)+b2(1)+b3(1)+填充（1）
    long c; // 8
    String s; // 压缩对象指针（4）

    public static void main(String[] args){
        ClassHeaderAndDataAndPadding object1 = new ClassHeaderAndDataAndPadding();
        AnotherClass object2 = new AnotherClass();
        System.out.println("object1 = " + ObjectSizeCalculator.getObjectSize(object1));
        System.out.println("object2 = " + ObjectSizeCalculator.getObjectSize(object2));
        System.out.println("new int[0] = " + ObjectSizeCalculator.getObjectSize(new int[0]));
        System.out.println("new int[1] = " + ObjectSizeCalculator.getObjectSize(new int[1]));
    }

    public static class AnotherClass{
        // 对象头 1.标记字（8） 2.压缩类型指针（4）
        int a; // 4
        byte b; // b(1)+填充（3）
        // 填充（4）
    }
}


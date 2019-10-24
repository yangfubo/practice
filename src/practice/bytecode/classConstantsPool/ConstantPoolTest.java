package practice.bytecode.classConstantsPool;

public class ConstantPoolTest {

    public static final String str = "hello world";

    public static final Integer num = 127;

    static {
        System.out.println("static code block init");
    }

    public static void main(String[] args){
        System.out.println(str);
        ConstantPoolTest test = new ConstantPoolTest();
        test.foo(1);
    }

    public int foo(int a){
        try {
            a = bar();
        }catch (Exception e){
            a = 2;
        }finally {
            a = 3;
        }
        return a;
    }

    public int bar(){
        Integer i = 1;
        return i;
    }

    public static int staticMethod(){
        return num;
    }
}

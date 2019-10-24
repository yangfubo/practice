package practice.aop;

public class MyInterfaceImpl implements MyInterface {
    @Override
    public void sayHello(String word) {
        System.out.println("hello " + word);
    }
}

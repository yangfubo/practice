package practice.aop;

import java.lang.reflect.Proxy;

public class AopMain {

    public static void main(String[] args) {
        System.out.println("sun.misc.ProxyGenerator.saveGeneratedFiles="+System.getProperty("sun.misc.ProxyGenerator.saveGeneratedFiles"));
        MyInterface myInterface = new MyInterfaceImpl();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(myInterface);
        MyInterface proxy = (MyInterface) Proxy.newProxyInstance(AopMain.class.getClassLoader(), new Class[]{MyInterface.class}, myInvocationHandler);
        proxy.sayHello("world!");
    }
}

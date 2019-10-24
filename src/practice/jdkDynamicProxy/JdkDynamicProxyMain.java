package practice.jdkDynamicProxy;

import java.lang.reflect.Proxy;

/**
 * vm args:
 * -Dsun.misc.ProxyGenerator.saveGeneratedFiles=true
 */
public class JdkDynamicProxyMain {

    public static void main(String[] args) {
        System.out.println("sun.misc.ProxyGenerator.saveGeneratedFiles="+System.getProperty("sun.misc.ProxyGenerator.saveGeneratedFiles"));
        MyInterface myInterface = new MyInterfaceImpl();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(myInterface);
        MyInterface proxy = (MyInterface) Proxy.newProxyInstance(JdkDynamicProxyMain.class.getClassLoader(), new Class[]{MyInterface.class}, myInvocationHandler);
        proxy.sayHello("world!");
    }
}

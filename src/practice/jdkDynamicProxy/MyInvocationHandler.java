package practice.jdkDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    /**
     * 要代理的接口的实现类实例
     */
    Object target;

    public MyInvocationHandler(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        /**
         * Spring Aop就是在这增加的advice增强
         */
        System.out.println("before method invoke");
        Object result = method.invoke(target,args);
        System.out.println("after method invoke");
        return result;
    }
}

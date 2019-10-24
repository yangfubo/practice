package practice.dispatch;

public class StaticDispatch {
    abstract static class Human {

    }

    static class Man extends Human {

    }

    static class WoMan extends Human {

    }

    public void hello(Human human) {
        System.out.println("呵·人类");
    }

    public void hello(WoMan woMan) {
        System.out.println("呵·女人");
    }

    public void hello(Man man) {
        System.out.println("呵·男人");
    }

    public static void main(String[] args) {

        StaticDispatch staticDispatch = new StaticDispatch();
        Human woman = new WoMan();
        Human man = new Man();
        staticDispatch.hello(woman);
        staticDispatch.hello(man);

        //静态类型变化
        staticDispatch.hello((Man) man);
        staticDispatch.hello((WoMan) woman);
    }


}



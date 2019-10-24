package practice.dispatch;

public class DynamicDispatch {

    static  class Human{
        void sayHello(){
            System.out.println("呵，人类");
        }
    }

    static class Woman extends Human{
        @Override
        public void sayHello(){
            System.out.println("呵，女人");
        }
    }

    static class Man extends Human{
        @Override
        public void sayHello(){
            System.out.println("呵，男人");
        }
    }

    public static void main(String[] args){
        Human man = new Man();
        Human woman = new Woman();
        man.sayHello();
        woman.sayHello();

        man = new Woman();
        man.sayHello();
    }
}

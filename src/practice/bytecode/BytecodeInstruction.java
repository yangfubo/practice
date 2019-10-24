package practice.bytecode;

public class BytecodeInstruction extends Father implements MyInterface{

    public static  Integer num = 1;

    public static final String staticStr = "staticStr";

    private String privateStr;

    public BytecodeInstruction(String privateStr){
        // invokespecial指令调用构造器方法
        this.privateStr = privateStr;
    }

    public static void main(String[] args){
        BytecodeInstruction newObj = new BytecodeInstruction("privateStr");
        try {
            newObj.virtualMethod(newObj.privateStr, num);
            newObj.interfaceMethod();
            BytecodeInstruction.staticMethod(staticStr);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally code block");
        }
    }

    public int virtualMethod(String word, Integer i){
        System.out.println(word);
        return i;
    }

    @Override
    public void interfaceMethod() throws Exception {
        try {
            System.out.println("interface method to init a iarray");
            int[] intArray = {1,2,3,4};
            int length = intArray.length;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void staticMethod(String str){
        System.out.println("static method "+str);
    }

    public void add(){
        int i = 1;
        int x = 2;
        int y= i+x;
    }
}

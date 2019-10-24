package practice.bytecode.practiceStr;

public class PracticeStrMain {
    public static void main(String[] args){
        // 在JVM内存模型常量池中缓存了“helloWorld”字符串，所以他们的内存地址相同
        String str1="helloWorld";
        String str2="helloWorld";
        String str3="hello";
        boolean flag=str1==str2;
        System.out.println("==运算符："+flag);
        System.out.println(str1.substring(0,5)==str3);
        System.out.println(str1.substring(0,5).equals(str3));
    }
}

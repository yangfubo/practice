package practice.bytecode.stringConstantsPool;

public class StringConstantsPool {

    public static Integer staticNum = 123456789;

    public static String staticStr = "str";

    static {
        System.out.println("run static init block code\n");
    }
    public static void main(String[] args) {
        Integer localNum = 123456789;
        String str1 = "str";
        String str2 = "str";
        String str3 = new String("str");
        String str4 = str3.intern();
        System.out.println("static final str == str1 :" + (staticStr == str1));
        System.out.println("str1 == str2 : " + (str1 == str2));
        System.out.println("str1 == str3 : " + (str1 == str3));
        System.out.println("str4 == str1 : " + (str4 == str1));
        System.out.println("str4 == str3 : " + (str4 == str3));
        System.out.println("staticNum == localNum : " + (staticNum == localNum));
        System.out.println("StringConstantsPool.staticStr == StaticString.staticStr : " + (StringConstantsPool.staticStr == StaticString.staticStr));
    }
}



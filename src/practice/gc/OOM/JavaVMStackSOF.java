package practice.gc.OOM;

/**
 * VM args: -Xss128k
 *
 */
public class JavaVMStackSOF {

    private int stackLength;

    public void stackLeak() {
        stackLength ++ ;
        stackLeak();
    }

    public static void main(String[] args){
        JavaVMStackSOF javaVMStackSOF = new JavaVMStackSOF();
        try {
            javaVMStackSOF.stackLeak();
        } catch (Throwable e) {
            System.out.println("stack length:"+javaVMStackSOF.stackLength);
            throw e;
        }
    }
}

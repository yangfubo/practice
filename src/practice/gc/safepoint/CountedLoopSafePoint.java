package practice.gc.safepoint;

import java.util.ArrayList;
import java.util.List;

/**
 * VM args:
 * -Xmx50m
 * -XX:+PrintGCApplicationStoppedTime
 * 测试表明，即使是计数循环也会有安全点
 */
public class CountedLoopSafePoint {

    private static String str = "tesgfdgdffgdgdfgdfgdfgdfgdfgdgfdgdt";

    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        for (int i=0;i<10000;i++){
            str = str + str;
            String s = new String(str.intern());
            list.add(s);
        }
    }
}

package practice.gc.OOM;

import java.util.ArrayList;
import java.util.List;

/**
 * VM args:
 * -Xms50m
 * -Xmx50m
 * -Xmn25m
 *
 */
public class HeapOOM {

    public static void main(String[] args){
        String test = "heapOOm";
        List<String> list = new ArrayList<>(100000);
        while (true){
            String str = test + test;
            list.add(str.intern());
        }
    }
}

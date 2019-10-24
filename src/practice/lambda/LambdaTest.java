package practice.lambda;

import java.util.stream.IntStream;

/**
 * -Djdk.internal.lambda.dumpProxyClasses=./
 */
public class LambdaTest{
    public static void main(String[] args){
       LambdaTest test = new LambdaTest();
       test.test();
    }

    public void test(){
        int x = 2;
        IntStream.of(1,2,3).map(i -> i*2).map(i -> i*x).forEach(i -> System.out.println(i));
    }
}

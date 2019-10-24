package practice.multiThread.synchronizedInstruction;


/**
 * 使用javap工具查看生产的class文件信息来分析synchronized关键字的字节码指令
 * javap -v classfile
 *
 * @author yangfubo
 */
public class SynchronizedTest {
    public static void main(String[] args){
        synchronized (SynchronizedTest.class){
            m();
        }
    }

    public static synchronized void m() {
    }
}

/*
Classfile /D:/WorkSpace/JavaPractice/src/practice/multiThread/tool/javap/SynchronizedTest.class
Last modified 2018-12-21; size 628 bytes
        MD5 checksum 99c2c524b1ee0d1e81ec144f7e65f803
        Compiled from "SynchronizedTest.java"
public class SynchronizedTest
        minor version: 0
        major version: 52
        flags: ACC_PUBLIC, ACC_SUPER
        Constant pool:
        #1 = Methodref          #4.#23         // java/lang/Object."<init>":()V
        #2 = Class              #24            // practice/multiThread/tool/javap/SynchronizedTest
        #3 = Methodref          #2.#25         // practice/multiThread/tool/javap/SynchronizedTest.m:()V
        #4 = Class              #26            // java/lang/Object
        #5 = Utf8               <init>
   #6 = Utf8               ()V
           #7 = Utf8               Code
           #8 = Utf8               LineNumberTable
           #9 = Utf8               LocalVariableTable
           #10 = Utf8               this
           #11 = Utf8               Lpractice/multiThread/tool/javap/SynchronizedTest;
           #12 = Utf8               main
           #13 = Utf8               ([Ljava/lang/String;)V
           #14 = Utf8               args
           #15 = Utf8               [Ljava/lang/String;
           #16 = Utf8               StackMapTable
           #17 = Class              #15            // "[Ljava/lang/String;"
           #18 = Class              #26            // java/lang/Object
           #19 = Class              #27            // java/lang/Throwable
           #20 = Utf8               m
           #21 = Utf8               SourceFile
           #22 = Utf8               SynchronizedTest.java
           #23 = NameAndType        #5:#6          // "<init>":()V
           #24 = Utf8               practice/multiThread/tool/javap/SynchronizedTest
           #25 = NameAndType        #20:#6         // m:()V
           #26 = Utf8               java/lang/Object
           #27 = Utf8               java/lang/Throwable
           {
public SynchronizedTest();
        descriptor: ()V
        flags: ACC_PUBLIC
        Code:
        stack=1, locals=1, args_size=1
        0: aload_0
        1: invokespecial #1                  // Method java/lang/Object."<init>":()V
        4: return
        LineNumberTable:
        line 9: 0
        LocalVariableTable:
        Start  Length  Slot  Name   Signature
        0       5     0  this   Lpractice/multiThread/tool/javap/SynchronizedTest;

public static void main(java.lang.String[]);
        descriptor: ([Ljava/lang/String;)V
        flags: ACC_PUBLIC, ACC_STATIC
        Code:
        stack=2, locals=3, args_size=1
        0: ldc           #2                  // class practice/multiThread/tool/javap/SynchronizedTest
        2: dup
        3: astore_1
        4: monitorenter
        5: invokestatic  #3                  // Method m:()V
        8: aload_1
        9: monitorexit
        10: goto          18
        13: astore_2
        14: aload_1
        15: monitorexit
        16: aload_2
        17: athrow
        18: return
        Exception table:
        from    to  target type
        5    10    13   any
        13    16    13   any
        LineNumberTable:
        line 11: 0
        line 12: 5
        line 13: 8
        line 14: 18
        LocalVariableTable:
        Start  Length  Slot  Name   Signature
        0      19     0  args   [Ljava/lang/String;
        StackMapTable: number_of_entries = 2
        frame_type = 255 *//* full_frame *//*
        offset_delta = 13
        locals = [ class "[Ljava/lang/String;", class java/lang/Object ]
        stack = [ class java/lang/Throwable ]
        frame_type = 250 *//* chop *//*
        offset_delta = 4

public static synchronized void m();
        descriptor: ()V
        flags: ACC_PUBLIC, ACC_STATIC, ACC_SYNCHRONIZED
        Code:
        stack=0, locals=0, args_size=0
        0: return
        LineNumberTable:
        line 17: 0
        }
        SourceFile: "SynchronizedTest.java"
        */


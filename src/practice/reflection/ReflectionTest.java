package practice.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionTest {

    public static void main(String[] args){
        try {
            Class clazz=Admin.class;
            Class supClazz=clazz.getSuperclass();
            //打印类声明
            String modifiers= Modifier.toString(clazz.getModifiers());
            String className=clazz.getName();
            System.out.print(modifiers+" "+"class "+className);
            if (!supClazz.equals(Object.class)){
                System.out.print(" extends "+supClazz.getName());
            }
            System.out.println("{");
            //打印成员
            printFields(clazz);
            //打印构造器
            printConstructors(clazz);
            //打印方法
            printMethods(clazz);
            System.out.println("}");
        } catch (Exception e) {

        }


    }

    public static void printFields(Class clazz){
        Field[] fields=clazz.getDeclaredFields();
        for (Field field:fields){
            String modifers=Modifier.toString(field.getModifiers());
            String type=field.getType().getName();
            String name=field.getName();
            println(modifers+" "+type+" "+name+";");
            println("");
        }
    }

    public static void printConstructors(Class clazz){
        Constructor[] constructors=clazz.getDeclaredConstructors();
        for (Constructor constructor:constructors){
            String modifers=Modifier.toString(constructor.getModifiers());
            print(modifers);
            String name=constructor.getName();
            print(" "+name);
            Class[] paramTypes=constructor.getParameterTypes();
            print("(");
            for(Class paramType:paramTypes){
                print(paramType.getName()+",");
            }
            println(");");
        }
    }

    public static void printMethods(Class clazz){
        Method[] methods=clazz.getDeclaredMethods();
        for (Method method:methods){
            String modifiers=Modifier.toString(method.getModifiers());
            print(modifiers+" ");
            String returnTypeName=method.getReturnType().getName();
            print(returnTypeName+" ");
            String name=method.getName();
            print(name+"(");
            Class[] paramTypes=method.getParameterTypes();
            for (Class paramType:paramTypes){
                String paramTypeName=paramType.getTypeName();
                print(paramTypeName+",");
            }
            println(")");
        }
    }

    public static void print(String str){
        System.out.print(str);
    }

    public static void println(String str){
        System.out.println(str);
    }

}




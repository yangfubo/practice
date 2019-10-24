package practice.properties;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Properties;

public class FieldsCopyUtil {

    /***
     *  从properties读取键值对，key为源对象的属性名，value为目标对象的属性名
     *  如文件中name=buyerName    from.name -->to.buyerName
     *  用反射来get,set,必须是同一类型的数据，基本类型拷贝值，自定义类型拷贝地址
     *
     * @author yangfubo
     * @param from 源对象
     * @param to 目标对象
     * @param properties properties对象
     * @return void
     */
    public static void copy(Object from, Object to, Properties properties){
        Enumeration en=properties.propertyNames();
        Class fClazz=from.getClass();
        Class tClazz=to.getClass();
        try {
            while (en.hasMoreElements()){
                // from字段名
                String key=(String) en.nextElement();
                // to字段名
                String value=properties.getProperty(key);
                String getName="get"+key.substring(0,1).toUpperCase()+key.substring(1);
                // getXxxxx 方法
                Method getMtd=fClazz.getMethod(getName);
                // 调用from.getXxxxx()方法
                Object getObj= getMtd.invoke(from,null);
                String setName="set"+value.substring(0,1).toUpperCase()+value.substring(1);
                // setXxxxx(args)方法
                if (getObj!=null){
                    Method setMtd=tClazz.getMethod(setName, getObj.getClass());
                    // 调用to.setXxxxx(args)
                    setMtd.invoke(to,getObj);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("拷贝出错！",e);
        }

    }


    /***
     *  从properties读取键值对，key为源对象的属性名，value为目标对象的属性名
     *  如文件中name=buyerName    from.name -->to.buyerName
     *  用反射来get,set,必须是同一类型的数据，基本类型拷贝值，自定义类型拷贝地址
     *
     * @author yangfubo
     * @param from 源对象
     * @param to 目标对象
     * @param fileName properties文件路径名
     * @return void
     */
    public static void copy(Object from, Object to,String fileName){
        InputStream fs=null;
        try {
            fs = FieldsCopyUtil.class.getClassLoader().getResourceAsStream(fileName);
            Properties properties=new Properties();
            properties.load(fs);
            copy(from,to,properties);
            fs.close();
        }catch (Exception e){
            throw new RuntimeException("拷贝出错！",e);
        } finally {
            try{
                if (fs!=null){
                    fs.close();
                }
            }catch (Exception e){
                System.out.println("文件流关闭失败！");
            }
        }
    }
}

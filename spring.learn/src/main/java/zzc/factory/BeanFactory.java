package zzc.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 一个创建Bean对象的工厂
 * Bean是具有重用组件的含义
 * Java Bean 用Java语言编写的可重用组件
 * (1) 需要配置文件，配置dao和service,类的唯一标识全限定类名
 * (2) 通过配置文件反射创建文件
 *
 * 通过工厂模式进行创建对象：
 *  读取配置文件
 *  生成bean对象
 * @author : zzc
 * @date: 2021-06-08 15:19
 **/
public class BeanFactory {
    //定义一个Properties对象
    private static Properties properties ;
    //用于存放实例对象，单例模式
    private static Map<String,Object> beans ;
    static {
        beans = new HashMap<>() ;
        properties = new Properties() ;
        InputStream in = BeanFactory.class.getResourceAsStream("bean.properties") ;
        try {
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        /**
         * 将配置文件中的所有bean对象放到容器内
         */
        Enumeration keys = properties.keys() ;
        while(keys.hasMoreElements()){
            //获取bean的key
            String key = keys.nextElement().toString();
            String beanPath = properties.getProperty(key);
            try {
                Object value = Class.forName( beanPath).newInstance() ;
                beans.put(key,value);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 根据配置文件中的bean对象名称返回实例
     * 采用了单例模式，保持只有一个实例
     * @param beanName
     * @return
     */
    public Object getBean(String beanName){
        return beans.get(beanName);
    }
    public static void main(String args[]) {

    }
}

package spring.anoaction.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 配置类作用与bean.xml一致
 * spring的注解：
 *  @Configuration:指定但前类是一个配置类
 *  @ComponentScan:用于通过注释指定sprign在创建容器时要扫描的包
 *  属性：
 *      value或basePackages ：要扫描包的类路径
 * @bean:将当前方法的返回值作为bean对象存入到spring容器中
 *      属性：
 *          name:指定bean的id,默认为方法名称
 * @import:导入其他配置类
 *      属性：
 *          需要指定的配置的字节码，可以是多个，为数组。
 *          有import的类为主配置类，被导入的配置类为子配置类
 * @PropertySource:
 *      用于指定property文件的路径。
 *      如果要指定类路径则通过classpath:类路径进行设置。
 *      取Property文件的数据，通过el表达式进行获取
 *      获取：@value(${配置文件中的key})
 * @author : zzc
 * @date: 2021-06-12 10:32
 **/
//表明该类
@Configuration
//指定要扫描的包
@ComponentScan(basePackages = "zzc.domain")
public class SpringConfig {

}

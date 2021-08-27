package zzc.ssm.mysel.mybaits.anaction;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解开发
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Sekect {
    /**
     * 配置sql语句
     * @return
     */
    String value();
}

package spring.anoaction.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.anoaction.domain.User;
import spring.anoaction.service.IAnoactionUser;
import spring.anoaction.service.IAnoactionUserImpl;

/**
 * 模拟客户端的需求,调用业务层功能
 * @author : zzc
 * @date: 2021-06-07 22:40
 **/
public class Client {
    public static void main(String args[]) {
        /**
         * 由于采用的是ClassPathXmlApplicationContext方法
         * 所以会一次性把所有的对象都创建完毕
         */
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-context.xml") ;
        IAnoactionUser user = (IAnoactionUser) ac.getBean("userAnoaction");
        System.out.println(user);
    }
}

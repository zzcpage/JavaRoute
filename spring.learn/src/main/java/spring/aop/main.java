package spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.aop.service.IAccountService;

/**
 * @author : zzc
 * @date: 2021-06-12 14:38
 **/
public class main {
    public static void main(String args[]) {
        //1. 获取spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-context.xml") ;
        //2. 获取被增强的bean对象
        IAccountService iAccountService = (IAccountService) ac.getBean("iaccountservice");
        iAccountService.findAll();
        //3. 从结果可以看出
        //
    }
}

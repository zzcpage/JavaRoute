package spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author : zzc
 * @date: 2021-06-12 17:55
 **/

/**
 * 基于注解的AOP
 * 只需要声明该类是一个切面类
 * 并且在相应通知方法上通过注解表明属于什么通知即@Befor和@After等
 * 然后在著名对象的切面表达式
 * 注解类似于XML，只不过简单了代码
 */
@Component()
@Aspect//表示当前类是一个切面类
public class Logger {
   public void printLog(){
       System.out.println("这是前置日志");
   }

    /**
     * 基于注解的AOP配置
     */
    @After("execution(public void spring.aop.service.impl.IAccountServiceImpl.findAll())")
    public void printAfterLog(){
        System.out.println("这是后置日志");
    }
    public void printExpectionLog(){
        System.out.println("这是异常日志");
    }
    public void printFinallyLog(){
        System.out.println("这是最终日志");
    }

    /**
     * spring的环绕通知，通过ProceedingJoinPoint进行代码控制
     * spring的环绕通知的特别之处在于可以通过自定义的代码实现通知
     * 而也可以通过spring提供的xml通知进行配置。二者都可以
     * @param pjp
     * @return
     */
    public Object aroundPringLof(ProceedingJoinPoint pjp){
       Object rtvalue = null ;
       try {
            Object[] args = pjp.getArgs() ;
            rtvalue = pjp.proceed(args);
            return rtvalue ;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }finally {
            return rtvalue;
        }
    }
}

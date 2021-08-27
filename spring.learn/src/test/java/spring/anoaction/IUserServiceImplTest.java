package spring.anoaction;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Junit集成Spring
 *  (1) 程序入口   main方法
 *  (2) junit单元测试中，没有main方法也能执行
 *      junit集成了一个main方法
 *      该方法就会判断当前测试类中有哪些方法有@Test注解
 *      junit就让有Test注解的方法执行
 *  (3) junit不会自动创建spring的核心容器
 * 整合junit:
 *      (1) 导入spring的test的jar包 spring-test
 *      (2) 使用junit提供的注解把原来的main方法给替换，替换
 *      成spring提供的main方法 @Runwith
 *      (3) 告诉spring的运行器，spring和ioc创建是基于xml还是基于注解创建的
 *      并说明注解位置，@ContextConfiguration
 *      属性 ： locations: 指定xml文件的位置，加上classpath:表明在类路径下
 *              classes: 指定注解类所在的位置
 * 注：如果采用spring.5.x版本时候，junit必须是4.1.2以上
 * @author : zzc
 * @date: 2021-06-12 14:20
 **/
//进行junit整合  通过runwith替换junit的main方法
// 指定spring的test方法springjunitclassrunner.class字节码
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( )
public class IUserServiceImplTest {

}

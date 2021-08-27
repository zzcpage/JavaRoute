package spring.anoaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import spring.anoaction.dao.IUserDao;
import spring.anoaction.domain.User;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import java.util.List;

/**
 * @author : zzc
 * @date: 2021-06-11 23:01
 *  注解的分类：
 *  （1） 用于创建对象（bean）
 *         1.@Component 将当前类对象存入到spring容器
 *         2.Controller 和Component一样,只不过一般用于控制层
 *         3.Repository 和Component一样，一般用于持久层
 *         4.Service 和Component一样，一般用于业务层
 *    以上四种创建对象的注解功能都一样，随便卸载哪都可以使用，Controller
 *    Respository和Service只是为了区分MVC三层模式，用不用都一样.
 *  （2） 用于注入数据
 *      1. Autowired:作用(类型注入)
 *          自动按照唯一的bean对象类型和要注入的变量类型进行匹配
 *          可以在变量上也可以在方法上。
 *          如果不存在匹配项，则注入失败。
 *          如果有多个相同接口的bean实现：
 *              通过变量名称进行匹配注入bean对象的id。
 *         通过Autowired get/set方法就不一定必须需要
 *      2.Qualifier（依赖于Autowired，需要一起使用）
 *          作用：按照类中注入的基础之上再按照名称注入，给类成员注入的时候不能单独使用
 *        在给方法参数注入的时候可以.通过Qualifier可以对参数进行注入，如果存在两个不同的实现方式
 *        通过Qualifier进行注入
 *        属性：
 *          value:用于指定注入bean的id
 *      3.Resource：
 *          直接按照Bean的id注入，可以单独使用
 *          属性：
 *              name:用于指定bean的id
 *      基本类型不能通过注解实现注入，集合类型需要通过xml进行注入
 *      基本类型的注入：通过@Value进行设定
 *          属性：
 *              value: 用于指定数据的值，可以通过Spring中的El表达式
 *                  EL表达式写法:${表达式}
 *  （3） 用于改变作用范围
 *         通过@Scope进行设定,默认为单例
 *          属性：
 *              value:
 *              singleton 单例（默认）
 *               prototype 多例
 *  （4）和生命周迅相关即init-method 和destory-method
 *          PreDestory:
 *              用于指定销毁方法
 *         PostConstruct:
 *              用于指定初始化方法
 **/
// Component用于将当前类对象存入
// 默认为小写类名，通过value可以指定id属性
@Component(value = "userAnoaction")
//用于指定bean对象的作用域
// singletion单例
// prototype多例
@Scope(value = "singleton")
public class IAnoactionUserImpl implements IAnoactionUser {
    @Resource(name = "userdaos")
    private IUserDao iUserDao ;
    @Override
    public List<User> findAll() {
        return null;
    }
    //指定init方法
    @PostConstruct
    private void init(){
        System.out.println("初始化");
    }

    //指定销毁方法
    @PreDestroy
    private void destory(){
        System.out.println("销毁");
    }
}

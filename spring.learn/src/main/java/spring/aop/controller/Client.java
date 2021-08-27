package spring.aop.controller;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import spring.aop.service.IAccountService;
import spring.aop.service.impl.IAccountServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 * @author : zzc
 * @date: 2021-06-12 15:57
 **/
public class Client {
    public static void main(String args[]) {
        IAccountService iAccountService = new IAccountServiceImpl();
        IAccountService iAccountServices = (IAccountService) Proxy.newProxyInstance(iAccountService.getClass().getClassLoader(),
                iAccountService.getClass().getInterfaces(), new InvocationHandler() {
                    /**
                     * 执行被代理对象的任何接口都会经过该放啊发
                     * (这就类似于中间处理函数，通过method和args可以知道
                     *  当前处理的方法和参数，然后根据自己中间商所需要进行的操作
                     *  来处理传递的参数，如可能需要提取5%的利润，则将
                     *  参数中传递给被代理对象的利润，抽取5%再传递给被代理
                     *  对象
                     * )
                     * @param proxy 代理对象的引用
                     * @param method 但钱执行的方法
                     * @param args 当前执行方法所需要的参数
                     * @return 和被代理对象具有相同的返回值
                     * @throws Throwable
                     */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //1.提供增强的代码

                //返回结果
                return method.invoke(iAccountService,args);
            }
        });
        IAccountService iAccountServices2 = (IAccountService) Enhancer.create(iAccountService.getClass(), new MethodInterceptor() {
            /**
             * 执行被代理对象的任何方法，都会经过该方法
             * 代理者，通过该方法进行处理中间业务逻辑
             * 和基于接口的方法的用法类似
             * @param o
             * @param method
             * @param objects
             * @param methodProxy
             * @return
             * @throws Throwable
             */
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                return method.invoke(iAccountService,args);
            }
        });
    }
}

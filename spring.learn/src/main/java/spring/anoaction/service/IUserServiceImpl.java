package spring.anoaction.service;

import spring.anoaction.domain.User;

/**
 * @author : zzc
 * @date: 2021-06-07 22:38
 **/
public class IUserServiceImpl {
    private int a ;

    public IUserServiceImpl(String s) {

    }

    static User getUsers(){
       System.out.println("静态方法");
        return new User();
    }
    User getUser(){
        System.out.println("非静态方法");
        return new User();
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public IUserServiceImpl() {
    }

    public IUserServiceImpl(int a) {
        this.a = a;
    }

    public static void main(String args[]) {

    }
}

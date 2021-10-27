package Java核心技术.第三章Java的基本程序设计;

import java.sql.SQLOutput;

/**
 * @date: 2021-10-26 19:44
 **/
public class Java基本数据类型 {

    public static final double PI = 3.1415926 ;

    /**
     * Java的基本数据类型
     */
    public static void basicType(){
        byte a ;
        short b ;
        int c;
        long d  ;
        d = 10000000L ; //通过L表示为长整型数据
        c = 0x123 ; //通过0x表示为十六进制
        c = 0b1001 ; //通过0b表示二进制数据
        c = 010 ; //通过0开头，表示为八进制数据。

        float e = 12.5f ;
        double f = 1234.2522 ;

        char g = '\u2122'; //注册符号 Tm
        System.out.println(g);
        g = '\u03C0' ;
        System.out.println(g);

    }

    /**
     * Java的变量
      */
    public static void bytes(){
        int a = 30 , b ; //对变量进行初始化
        b = 20 ; //对变量进行赋值
        final  double PI = 3.1415962 ;
    }

    /**
     * java的操作
     */
    public static void byteOperate(){
        int a = 2 , b = 4 ;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);

    }

    /**
     * java字符串
     */
    public static void byteString(){
        String a = "123";
        String b = "123" ;
        String c = new String("123") ;
        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(a == c);
        System.out.println(a.equals(c));
    }

    public static void main(String args[]) {
        System.out.println("hello world");
        // 如果想要程序在执行中间退出，则通过System.exit()退出程序
        basicType();
        //System.exit(1);
        System.out.println("程序中止返回");
        byteString() ;
    }

}

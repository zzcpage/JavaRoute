package leetcode.初级算法.字符串;

/**
 * @author : zzc
 * @date: 2021-10-26 12:53
 **/
public class resver {
    //    给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
    //
    //    如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
    //
    //    假设环境不允许存储 64 位整数（有符号或无符号）。

    //     如果要判断超过了32位的有效符号整数，那么只能通过字符串进行比较.
    //     这题的难点就在于限制了只能存储32位的数据(不能够借助64位的数据)，所以需要采用字符串进行模拟
    //     其中要注意的一点就是在求负数的反转数据的时候，需要注意取余的时候，因该对余数进行乘法，否则会出现溢出现象
    //     因为 -INT.min 会超出正数的表达范围。
    public int reverse(int x) {
        String max = "2147483647" ;
        String min = "-2147483648" ;
        String re = "" ;
        int lenMin = 11 , lenMax = 10 , len = 0  ;
        if(x == 0 ){
            return 0 ;
        }else if(x < 0 ){
            while(x != 0){
                re += (x%10)*-1 ;
                x = x / 10 ;
                len++;
            }
            re = "-"+re ;
            len++;
            if(((len)>lenMin)||((len)==lenMin&&re.compareTo(min)>0))
                return 0;
            else
                return Integer.valueOf(re) ;
        }else{
            while(x != 0){
               re += x%10 ;
                x = x / 10 ;
                len++;
            }

            if(((len)>lenMax)||((len)==lenMax&&re.compareTo(max)>0))
                return 0;
            else{
                return Integer.valueOf(re) ;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Math.pow(2,31)-1);
        System.out.println(String.valueOf(Math.pow(2,31)));
        System.out.println(new resver().reverse(-2147483648));
    }
}

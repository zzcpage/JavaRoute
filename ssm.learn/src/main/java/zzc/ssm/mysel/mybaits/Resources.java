package zzc.ssm.mysel.mybaits;

import java.io.InputStream;

/**
 * @author : zzc
 * @date: 2021-06-04 23:36
 **/
public class Resources {
    /**
     * 根据输入参数，获取一个字节输入流
     * @param filePath
     * @return
     */
    public static InputStream getResourceAsStream(String filePath){
        //读取配置文件的信息
        return Resources.class.getClassLoader().getResourceAsStream(filePath) ;
    }
    public static void main(String args[]) {

    }
}

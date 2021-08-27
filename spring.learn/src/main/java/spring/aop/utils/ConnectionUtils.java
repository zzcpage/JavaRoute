package spring.aop.utils;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * 连接工具类，用于从数据库中获取一个连接
 * @author : zzc
 * @date: 2021-06-12 14:53
 **/
public class ConnectionUtils {

    private ThreadLocal<Connection> con = new ThreadLocal<>();

    private DataSource dataSource ;

    private void setDataSource(DataSource dataSource){
        this.dataSource = dataSource ;
    }

    /**
     * 获取当前线程上的连接
     * @return
     */
    public Connection getThreadConnection(){
        //1. 先从ThradLocal上获取
        Connection conn = con.get()  ;
        //2. 判断当前线程上是否具有连接
        if(conn == null){
            //3. 从数据库中获取一个连接存入到ThreadLoacl中
            try {
                conn = dataSource.getConnection() ;
                con.set(conn);
                return  conn ;
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null ;
    }

    /**
     * 解除绑定
     */
    public void remove(){
        con.remove();
    }
}

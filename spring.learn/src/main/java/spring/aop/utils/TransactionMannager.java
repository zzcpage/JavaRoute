package spring.aop.utils;

import java.sql.Connection;

/**
 * 事务管理的工具类
 * 包括：开启事务，提交事务，事务回滚和释放连接的操作。
 * @author : zzc
 * @date: 2021-06-12 14:58
 **/
public class TransactionMannager {

    private ConnectionUtils connection ;

    public void setConnection(ConnectionUtils connection) {
        this.connection = connection;
    }

    /**
     * 开启事务
     */
    public void beginTransaction(){
        try{
            connection.getThreadConnection().setAutoCommit(false);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 提交事务
     */
    public void commit(){
        try{
            connection.getThreadConnection().commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 事务回滚
     */
    public void rollBack(){
        try{
            connection.getThreadConnection().rollback();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 事务释放
     */
    public void release(){
        try{
            connection.getThreadConnection().close(); //释放连接返回到连接池
            connection.remove();    //解除绑定
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}

package zzc.ssm.mysel.mybaits.sqlsession;

/**
 * 用于创建代理dao
 */
public interface SqlSession {
    /**
     * 根据参数创建代理对象
     * @param daoInterfaceClass
     * @param <T>
     * @return
     */
    <T> T getMapper(Class<T> daoInterfaceClass);

    /**
     * 释放资源
     */
    void close();
}

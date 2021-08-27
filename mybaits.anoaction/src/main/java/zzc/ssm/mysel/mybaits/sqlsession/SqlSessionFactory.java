package zzc.ssm.mysel.mybaits.sqlsession;

import org.apache.ibatis.session.SqlSession;

public interface SqlSessionFactory {
    /**
     * 获取一个SqlSession对象
     * @return
     */
    SqlSession gteSession();
}

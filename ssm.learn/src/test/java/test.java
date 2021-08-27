import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import zzc.ssm.mybaits.dao.IUserDao;
import zzc.ssm.mybaits.domain.QueryVO;
import zzc.ssm.mybaits.domain.Users;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : zzc
 * @date: 2021-06-03 22:43
 **/
public class test {
    public static void main(String args[]) throws IOException {
        //实际应用WEB项目中用serveltContext.getRealPath来获取配置文件的路径
        //1.读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml") ;
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder() ;
        SqlSessionFactory factory = builder.build(in) ;
        //3.使用工厂生产工厂Sqlsession对象
        SqlSession session = factory.openSession() ;
        //4.使用sqlSession创建Dao接口的代理对象 也就是DAO
        IUserDao userDao = session.getMapper(IUserDao.class);
        ArrayList<Integer> ids = new ArrayList<>() ;
        ids.add(1) ;
        // 通过QueryVO对查询条件进行封装
        // 根据用户id列表来查找符合条件的用户
        QueryVO queryVO = new QueryVO() ;
        queryVO.setIds(ids);
        Users users = new Users() ;
        users.setUsername("1");
        users.setSex("1");
        List<Users> users1 = userDao.findUsrById(queryVO) ;
        for(Users user : users1){
            System.out.println(user);
        }
        session.close();
        in.close();
    }
}

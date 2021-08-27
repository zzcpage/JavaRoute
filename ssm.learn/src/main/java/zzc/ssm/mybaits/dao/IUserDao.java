package zzc.ssm.mybaits.dao;

import org.apache.ibatis.annotations.Select;
import zzc.ssm.mybaits.domain.QueryVO;
import zzc.ssm.mybaits.domain.Users;

import java.util.List;

/**
 * @author : zzc
 * @date: 2021-06-03 22:29
 **/
public interface IUserDao {

    /**
     * 查询所有用户
     * @return
     */
    // @Select("select * from users")
    List<Users> findAll(Users users);

    /**
     * 根据id列表查询所有用户 通过动态sql语句进行查询
     * @param vo
     * @return
     */
    List<Users> findUsrById(QueryVO vo);
}

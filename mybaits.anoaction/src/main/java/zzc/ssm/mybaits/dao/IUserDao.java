package zzc.ssm.mybaits.dao;

import org.apache.ibatis.annotations.*;
import zzc.ssm.mybaits.domain.QueryVO;
import zzc.ssm.mybaits.domain.Users;

import java.util.List;

/**
 * 采用注解开发的Mybaits
 * @Select @Update @Delete @Insert这四种方式进行数据库的操作
 * @author : zzc
 * @date: 2021-06-03 22:29
 **/
//通过这个注解开启二级缓存
@CacheNamespace(blocking = true)
public interface IUserDao {

    /**
     * 查询所有用户
     * 如果需要使用ResultMap类型，则通过@Results进行配置结果集映射信息
     * 而在实际封装结果集时候，通过ResultMap来指明结果集映射信息
     * @return
     */
     /* @Results(id="usermap",value = {
             //如果是主键则id设置为true, column表示数据库列名，property表示实体属性名
             @Result(id = true,column = "",property = ""),
             @Result(column = "",property = ""),
             @Result(column = "",property = ""),
             @Result(column = "",property = ""),
             ......
     })*/

    /*
        对于实体的一对多的关系，通过分析Result内部的格式，
        Result通过one指定一对一的关系，并且在@One内指定关系实体的获取方法
        @Result(column = "",property = "",one=@One(select="",fetchType=""))
        通过many=@Many指定对应关系实体的获取方法
        @Result(column = "",property = "",通过many=@Many(select="",fetchType=""))
        fetchType用于指定是懒加载还是立即加载，查看源码可得

        缓存的使用:
            一级缓存：Mybaits自带一级缓存
            二级缓存:
     */

    @Select("select * from users")
    //通过ResultMap来指定结果集的映射信息
    @ResultMap(value = {
            "usermap"
    })
    List<Users> findAll();

    /**
     * 根据id列表查询所有用户 通过动态sql语句进行查询
     * @param vo
     * @return
     */
    List<Users> findUsrById(QueryVO vo);
}

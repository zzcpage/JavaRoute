package spring.jdbctemplate.jdbctemplare;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.*;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import zzc.domain.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 * @author : zzc
 * @date: 2021-06-13 23:18
 * jdbcTemplate的最基本用法
 **/
public class Jdbctemplates {
    public static void main(String args[]) {
        // 1. 配置数据源
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver") ;
        ds.setUrl("jdbc:mysql://localhost:3306/school?useUnicode=true&amp;characterEncoding=UTF-8") ;
        ds.setUsername("test") ;
        ds.setPassword("123456") ;
        //2.创建jdbcTemplate对象
        JdbcTemplate jt = new JdbcTemplate() ;//设置数据源
        jt.setDataSource(ds);//执行sql语句操作
        jt.execute("delete from user where id = 1");
        List<User> users = new LinkedList<>() ;
        //保存操作
        jt.update("insert into user(id,password)values (?,?)",1,123);
        //更新操作
        jt.update("update  user set id=?,password=?",1,123);
        //删除
        jt.update("delete from user where id=?",1);
        //查询操作 需要建立一个结果集映射
        users = jt.query("select * from user",new userMapper());
        users = jt.query("select * from user",new BeanPropertyRowMapper<User>(User.class));
    }
}
class userMapper implements RowMapper<User>{

    /**
     * 将结果集封装到User中
     * @param rs
     * @param rowNum
     * @return
     * @throws SQLException
     */
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {

        User user = new User() ;
        user.setId(rs.getInt("id"));
        // 通过结果集创建映射
        return user;
    }
}
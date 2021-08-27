package spring.jdbctemplate.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import spring.jdbctemplate.dao.UserDao;
import zzc.domain.User;

import java.util.List;

/**
 * 通过注解的jdbctemplate注解开发
 * @author : zzc
 * @date: 2021-06-14 11:01
 **/
@Repository
public class UserDaoImpl2 implements UserDao {
    @Autowired
    private JdbcTemplateMy jdbcTemplateMy ;

    public static void main(String args[]) {

    }

    @Override
    public List<User> findAll() {
        return null;
    }
}

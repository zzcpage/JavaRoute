package spring.CAID.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import spring.CAID.dao.UserDao;
import zzc.domain.User;

import java.util.List;

/**
 * @author : zzc
 * @date: 2021-06-14 11:00
 * 通过继承jdbcDaoSupport则可以通过Spring自动进行
 * 创建JdbcTemplate 和 DataSource而不再需要自行创建
 **/
public class UserDaoImpl extends JdbcDaoSupport implements UserDao {

    public static void main(String args[]) {

    }

    @Override
    public List<User> findAll() {
        return null;
    }
}

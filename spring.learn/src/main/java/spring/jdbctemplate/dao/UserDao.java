package spring.jdbctemplate.dao;

import zzc.domain.User;

import java.util.List;

/**
 * @author : zzc
 * @date: 2021-06-14 10:59
 **/
public interface UserDao {
    List<User> findAll() ;
}

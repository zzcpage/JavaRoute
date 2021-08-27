package zzc.dao;

import zzc.domain.User;

import java.util.List;

public interface IUserDao {

    List<User> findAll();
}

package spring.anoaction.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import spring.anoaction.domain.User;

import java.util.List;

public interface IUserDao {

    List<User> findAll();
}

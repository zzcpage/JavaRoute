package spring.anoaction.dao;

import org.springframework.stereotype.Component;
import spring.anoaction.domain.User;

import java.util.List;

/**
 * @author : zzc
 * @date: 2021-06-12 00:17
 **/
@Component(value = "userdaos")
public class IUserDaos implements IUserDao {
    public static void main(String args[]) {

    }

    @Override
    public List<User> findAll() {
        return null;
    }
}

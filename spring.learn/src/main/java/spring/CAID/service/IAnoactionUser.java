package spring.CAID.service;

import spring.anoaction.domain.User;

import java.util.List;

public interface IAnoactionUser {
    List<User> findAll();
}
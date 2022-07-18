package ru.kata.spring.boot_security.demo.dao;


import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    List<User> listUsers();
    User getByID(long id);
    void edit(User user);
    void delete(User user);
    User findByUsername(String username);
    void addRole(Role role);
}

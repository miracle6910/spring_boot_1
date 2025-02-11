package com.web.dao;

import com.web.model.User;

import java.util.List;

public interface UserDao {
    User getUserById(int id);

    List<User> getAllUsers();

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(int id);
}

package com.web.service;

import com.web.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    User getUserById(int id);
    List<User> getAllUsers();
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(int id);
}
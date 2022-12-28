package com.example.spring_boot_1.service;

import com.example.spring_boot_1.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserId(long id);

    void addUser(User user);

    void updateUser(User user);

    User removeUser(long id);

}

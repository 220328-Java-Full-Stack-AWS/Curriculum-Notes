package com.revature.dao;

import com.revature.models.User;

import java.util.List;

public interface UserDao {

    void saveUser(User u);

    List<User> getAllUsers();

    User getUserByUserName(String username);

    void updateUser(User u);

}

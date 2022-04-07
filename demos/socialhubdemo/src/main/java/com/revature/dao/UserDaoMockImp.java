package com.revature.dao;

import com.revature.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoMockImp implements UserDao{

    //We have our connection to the database
    private MockUserDB db = MockUserDB.getInstance();

    @Override
    public void saveUser(User u) {
        //To store data in a hashmap, we use put(Key, Value)
        db.getUdb().put(u.getUsername(), u);
    }

    public List<User> getAllUsers(){
        return new ArrayList<User>(db.getUdb().values());
    }

    public User getUserByUserName(String username){
        return db.getUdb().get(username);
    }

    public void updateUser(User u){
        db.getUdb().put(u.getUsername(), u);
    }
}

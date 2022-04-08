package com.revature.services;

import com.revature.dao.UserDao;
import com.revature.exceptions.UsernameOrPasswordIncorrectException;
import com.revature.models.User;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class UserService {

    private UserDao ud;

    //Dependency injection, it is considered good practice because we can swapout any type of UserDao implementation we want
    public UserService(UserDao ud){
        this.ud = ud;
    }

    public User login(String username, String password){
        //Search the db for a user with the specified username, then check to see if the password matches
        if(ud.getUserByUserName(username) != null && ud.getUserByUserName(username).getPassword().equals(password)){
            return ud.getUserByUserName(username);
        } else {
            throw new UsernameOrPasswordIncorrectException();
        }
    }

    public User register(String first, String last, String email, String password){
        Random rand = new Random();
        String username = first + last + (int)(1000 + (Math.random() * 10000));
        User u = new User(first, last, username, email, password);
        //From the service, we would make our database call to actually store this user away
        ud.saveUser(u);
        return u;
    }

    public void followUser(User current, String username){
        //When we follow a user
        //Put the user in our following set
        //Put our user object in their followers
        User u = ud.getUserByUserName(username);
        Set following = current.getFollowing();
        following.add(u);
        current.setFollowing(following);
        Set followers = u.getFollowers();
        followers.add(current);
        u.setFollowers(followers);
        ud.saveUser(u);
        ud.saveUser(current);
    }

    public List<User> topRankedUsers(){
        //The Collections Utility class has methods to do things like sorting collections
        List<User> uList = ud.getAllUsers();
        //The Collections.sort(list) is going to sort our list of users based off of the compareTo method we created early
        Collections.sort(uList);
        return uList;
    }

}

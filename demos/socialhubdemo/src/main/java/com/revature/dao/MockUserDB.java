package com.revature.dao;

import com.revature.models.User;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//This is going to use the singleton pattern
//A single is an object that will only be instatiated once, and shared across the application
public class MockUserDB {

    //We are going to use a HashMap as our mock database
    //The first value is the datatype of the key, the second value is the datatype of what we are storing
    private Map<String, User> udb;

    private static MockUserDB db;

    private MockUserDB(){
        udb = new HashMap<>();
    }

    static public MockUserDB getInstance(){
        if(db == null){
            db = new MockUserDB();
            return db;
        }
        return db;
    }

    public Map<String, User> getUdb(){
        return udb;
    }

    public void populateUsers(){
        User u1 = new User("Rick", "Sanchez", "RickSanchez1234", "rick@mail.com", "password");
        User u2 = new User("Morty", "Smith", "MortySmith1234", "morty@mail.com", "password");
        User u3 = new User("Summer", "Smith", "SummerSmith1234", "summer@mail.com", "password");
        User u4 = new User("Jimmy", "Nuetron", "JimmyNuetraon1234", "jimmy@mail.com", "password");
        User u5 = new User("Timmy", "Turner", "TimmyTurner1234", "timmy@mail.com", "password");

        Set<User> u1Followers = new HashSet<>();
        Set<User> u1Following = new HashSet<>();

        u1Following.add(u2);
        u1Following.add(u3);
        u1Following.add(u4);

        u1Followers.add(u2);
        u1Followers.add(u5);

        Set<User> u2Followers = new HashSet<>();
        Set<User> u2Following = new HashSet<>();

        u2Followers.add(u1);
        u2Followers.add(u3);

        u2Following.add(u1);
        u2Following.add(u3);
        u2Following.add(u4);
        u2Following.add(u5);

        Set<User> u3Followers = new HashSet<>();
        Set<User> u3Following = new HashSet<>();

        u3Followers.add(u1);
        u3Followers.add(u2);
        u3Followers.add(u4);
        u3Followers.add(u5);

        u3Following.add(u2);
        u3Following.add(u4);

        Set<User> u4Followers = new HashSet<>();
        Set<User> u4Following = new HashSet<>();

        u4Followers.add(u1);
        u4Followers.add(u2);
        u4Followers.add(u3);

        u4Following.add(u3);
        u4Following.add(u5);

        Set<User> u5Followers = new HashSet<>();
        Set<User> u5Following = new HashSet<>();

        u5Followers.add(u4);
        u5Followers.add(u2);
        u5Followers.add(u1);

        u5Following.add(u3);
        u5Following.add(u2);
        u5Following.add(u1);

        u1.setFollowers(u1Followers);
        u1.setFollowing(u1Following);
        u2.setFollowers(u2Followers);
        u2.setFollowing(u2Following);
        u3.setFollowers(u3Followers);
        u3.setFollowing(u3Following);
        u4.setFollowers(u4Followers);
        u4.setFollowing(u4Following);
        u5.setFollowing(u5Following);
        u5.setFollowers(u5Followers);

        udb.put(u1.getUsername(), u1);
        udb.put(u2.getUsername(), u2);
        udb.put(u3.getUsername(), u3);
        udb.put(u4.getUsername(), u4);
        udb.put(u5.getUsername(), u5);
    }

}

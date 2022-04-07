package com.revature.dao;

import com.revature.models.User;

import java.util.HashMap;
import java.util.Map;

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
            return new MockUserDB();
        }
        return db;
    }

    public Map<String, User> getUdb(){
        return udb;
    }

}

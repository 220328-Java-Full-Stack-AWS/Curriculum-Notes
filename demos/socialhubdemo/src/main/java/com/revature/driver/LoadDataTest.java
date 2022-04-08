package com.revature.driver;

import com.revature.dao.MockPostDB;
import com.revature.dao.MockUserDB;
import com.revature.models.User;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LoadDataTest {

    private static MockUserDB db = MockUserDB.getInstance();

    public static void main(String args[]){
        MockUserDB.getInstance().populateUsers();
        Map<String, User> users = db.getUdb();
        System.out.println(users);


        MockPostDB.getInstance().populatePosts();
        System.out.println(MockPostDB.getInstance().getPdb());

    }

}

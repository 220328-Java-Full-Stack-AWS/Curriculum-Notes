package com.revature.dao;

import com.revature.models.Post;
import com.revature.models.User;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class MockPostDB {

    private Map<String, List<Post>> pdb;

    private static MockPostDB db;

    private MockPostDB(){
        pdb = new HashMap<>();
    }

    static public MockPostDB getInstance(){
        if(db == null){
            db = new MockPostDB();
            return db;
        }
        return db;
    }

    public Map<String, List<Post>> getPdb(){
        return pdb;
    }

    public void populatePosts(){

        Date start = new Date(1640908800000l);
        Date end = new Date(1672444800000l);

        User u1 = MockUserDB.getInstance().getUdb().get("RickSanchez1234");

        Post p1 = new Post("Ricks first post", u1, between(start, end));
        Post p2 = new Post("Ricks second post", u1, between(start, end));
        Post p3 = new Post("Ricks third post", u1, between(start, end));
        Post p4 = new Post("Ricks fourth post", u1, between(start, end));

        List<Post> u1Posts = new ArrayList<>();
        u1Posts.add(p1);
        u1Posts.add(p2);
        u1Posts.add(p3);
        u1Posts.add(p4);

        pdb.put(u1.getUsername(), u1Posts);

        User u2 = MockUserDB.getInstance().getUdb().get("MortySmith1234");

        Post p5 = new Post("Mortys first post", u2, between(start, end));
        Post p6 = new Post("Mortys second post", u2, between(start, end));
        Post p7 = new Post("Mortys third post", u2, between(start, end));
        Post p8 = new Post("Mortys fourth post", u2, between(start, end));

        List<Post> u2Posts = new ArrayList<>();
        u2Posts.add(p5);
        u2Posts.add(p6);
        u2Posts.add(p7);
        u2Posts.add(p8);

        pdb.put(u2.getUsername(), u2Posts);

        User u3 = MockUserDB.getInstance().getUdb().get("SummerSmith1234");

        Post p9 = new Post("Summers first post", u3, between(start, end));
        Post p10 = new Post("Summers second post", u3, between(start, end));
        Post p11 = new Post("Summers third post", u3, between(start, end));
        Post p12 = new Post("Summers fourth post", u3, between(start, end));

        List<Post> u3Posts = new ArrayList<>();
        u3Posts.add(p9);
        u3Posts.add(p10);
        u3Posts.add(p11);
        u3Posts.add(p12);

        pdb.put(u3.getUsername(), u3Posts);

        User u4 = MockUserDB.getInstance().getUdb().get("JimmyNuetraon1234");

        Post p13 = new Post("Summers first post", u4, between(start, end));
        Post p14 = new Post("Summers second post", u4, between(start, end));
        Post p15 = new Post("Summers third post", u4, between(start, end));
        Post p16 = new Post("Summers fourth post", u4, between(start, end));

        List<Post> u4Posts = new ArrayList<>();
        u4Posts.add(p13);
        u4Posts.add(p14);
        u4Posts.add(p15);
        u4Posts.add(p16);

        pdb.put(u4.getUsername(), u4Posts);

        User u5 = MockUserDB.getInstance().getUdb().get("TimmyTurner1234");

        Post p17 = new Post("Summers first post", u5, between(start, end));
        Post p18 = new Post("Summers second post", u5, between(start, end));
        Post p19 = new Post("Summers third post", u5, between(start, end));
        Post p20 = new Post("Summers fourth post", u5, between(start, end));

        List<Post> u5Posts = new ArrayList<>();
        u5Posts.add(p17);
        u5Posts.add(p18);
        u5Posts.add(p19);
        u5Posts.add(p20);

        pdb.put(u5.getUsername(), u5Posts);

    }

    private Date between(Date startInclusive, Date endExclusive) {
        long startMillis = startInclusive.getTime();
        long endMillis = endExclusive.getTime();
        long randomMillisSinceEpoch = ThreadLocalRandom
                .current()
                .nextLong(startMillis, endMillis);

        return new Date(randomMillisSinceEpoch);
    }

}

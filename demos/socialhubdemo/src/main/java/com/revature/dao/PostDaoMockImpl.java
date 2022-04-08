package com.revature.dao;

import com.revature.models.Post;

import java.util.List;

public class PostDaoMockImpl implements PostDao{

    private MockPostDB db = MockPostDB.getInstance();


    @Override
    public List<Post> getPostsByUser(String username) {
        return db.getPdb().get(username);
    }
}

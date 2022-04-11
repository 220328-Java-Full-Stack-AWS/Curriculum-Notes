package com.revature.dao;

import com.revature.models.Post;

import java.util.ArrayList;
import java.util.List;

public class PostDaoMockImpl implements PostDao{

    private MockPostDB db = MockPostDB.getInstance();


    @Override
    public List<Post> getPostsByUser(String username) {
        return db.getPdb().get(username);
    }

    @Override
    public void createPost(Post p) {
        //Our posts are stored with key being the users username, so we need to get that first
        String username = p.getUser().getUsername();

        //We need the preexisting list of posts, if one does not exist, create one
        List<Post> posts = db.getPdb().get(username);

        if(posts != null){
            posts.add(p);
        } else {
            posts = new ArrayList<>();
            posts.add(p);
        }

        db.getPdb().put(username, posts);

    }
}

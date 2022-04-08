package com.revature.dao;

import com.revature.models.Post;

import java.util.List;

public interface PostDao {

    List<Post> getPostsByUser(String username);

    void createPost(Post p);

}

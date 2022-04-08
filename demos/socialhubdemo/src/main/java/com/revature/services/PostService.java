package com.revature.services;

import com.revature.dao.PostDao;
import com.revature.models.Post;
import com.revature.models.PostComparator;
import com.revature.models.User;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class PostService {

    private PostDao pd;

    public PostService(PostDao pd){
        this.pd = pd;
    }

    public Set<Post> getUserFeed(User u){

        Set<User> following = u.getFollowing();

        Set<Post> userFeed = new TreeSet<>(new PostComparator());

        Iterator<User> ui = following.iterator();
        //Loop through all the users in the following list
        while(ui.hasNext()){
            //Get their posts, and add them to the feed
            userFeed.addAll(pd.getPostsByUser(ui.next().getUsername()));
        }

        return userFeed;

    }

}

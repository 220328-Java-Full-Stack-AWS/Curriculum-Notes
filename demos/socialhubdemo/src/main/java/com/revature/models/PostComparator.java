package com.revature.models;

import java.util.Comparator;

public class PostComparator implements Comparator<Post> {

    @Override
    public int compare(Post o1, Post o2) {
        if(o1.getTimestamp().after(o2.getTimestamp())){
            return -1;
        } else if(o1.getTimestamp().before(o2.getTimestamp())){
            return 1;
        }
        else {
            return 0;
        }
    }
}

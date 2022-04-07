package com.revature.models;

import java.util.Date;

public class Post {

    /*
        - String Content
        - User User
        - Date Timestamp
     */

    private String content;
    private User user;
    private Date timestamp;

    public Post() {
        timestamp = new Date();
        System.out.println(timestamp);
    }

    public Post(String content, User user, Date timestamp) {
        this.content = content;
        this.user = user;
        this.timestamp = timestamp;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Post{" +
                "content='" + content + '\'' +
                ", user=" + user +
                ", timestamp=" + timestamp +
                '}';
    }
}

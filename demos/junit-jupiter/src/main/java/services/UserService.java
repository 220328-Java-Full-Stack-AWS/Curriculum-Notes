package services;

import entities.User;
import repositories.UserRepository;

/*
This is the system under test. We never want to actually leave this file in our tests. However, it is
almost 100% the case that behaviors in classes will invoke methods outside the class. So how do we stop this?

We mock any class objects that this class would de-reference to invoke methods. Then we intercept the method calls.
 */
public class UserService {
    public UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public User auth(String username, String password) {
        return repo.auth(username, password);
    }
}

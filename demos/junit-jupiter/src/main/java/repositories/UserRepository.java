package repositories;

import entities.User;

public class UserRepository {
    public User auth(String username, String password) {
        /* This is a super simple FAKE method. We never actually want this method to
        be invoked, instead we will use mockito to intercept before we ever get here.
         */
        System.out.println("Uh oh, we should never have gotten here!");
        return new User("bad", "bad", "bad", "bad");
    }
}

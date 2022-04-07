package com.revature.driver;

import com.revature.dao.UserDao;
import com.revature.dao.UserDaoMockImp;
import com.revature.models.*;

import java.util.*;

import com.revature.models.Post;
import com.revature.models.PostComparator;
import com.revature.services.UserService;

public class Driver {

    private static UserDao uDao = new UserDaoMockImp(); //After you connect to your database, you can swap UserDaoMockImp with your actual db logic
    private static UserService uServ = new UserService(uDao);

    public static void main(String[] args){
        /*
        User u = uServ.register("Ethan", "McGill", "ethan.mcgill@revature.com", "password");
        User u2 = uServ.register("Giorgi", "Amirajibi", "giorgi@mail.com", "password");
        List<User> users = uDao.getAllUsers();
        for(int i=0; i< users.size(); i++){
            System.out.println(users.get(i));
            System.out.println("Followers: " + users.get(i).getFollowers());
            System.out.println("Following: " + users.get(i).getFollowing());
        }

        uServ.followUser(u, u2.getUsername());

        System.out.println(uDao.getAllUsers());

        for(int i=0; i< users.size(); i++){
            System.out.println(users.get(i));
            System.out.println("Followers: " + users.get(i).getFollowers());
            System.out.println("Following: " + users.get(i).getFollowing());
        }

        System.out.println(uServ.topRankedUsers());

         */

        User loggedIn = null;
        boolean done = false;
        //We probably need user input
        Scanner scan = new Scanner(System.in);

        //We want to loop forever until the user decides they are done

        while(!done){
            //Do our logic
            //Check to see if we have a logged in user
            if(loggedIn == null){
                //Not being logged in, we have two options
                //Register a user
                //Login
                //Prompt the user
                System.out.println("Do you want to login or register? Choose 1 for register, 2 for login");
                //Get their input
                int choice = scan.nextInt();
                scan.nextLine();
                //Do the logic based on their input
                if(choice == 1){
                    //Prompt them for their name, email, password
                    System.out.println("Enter your first name below:");
                    String first = scan.nextLine();
                    System.out.println("Enter your last name below:");
                    String last = scan.nextLine();
                    System.out.println("Enter your email below:");
                    String email = scan.nextLine();
                    System.out.println("Enter your password below");
                    String password = scan.nextLine();
                    uServ.register(first, last, email, password);
                    System.out.println(uDao.getAllUsers());
                }
                else{
                    //Prompt for username and password
                    System.out.println("Enter your username below");
                    String username = scan.nextLine();
                    System.out.println("Enter your password below");
                    String password = scan.nextLine();
                    loggedIn = uServ.login(username, password);
                    System.out.println(loggedIn);
                }

            }
            else{
                //Do our other logic
                System.out.println("Welcome to the lamest social media app!");
                System.out.println("We could have implemented more logic, but too many people are snoozing, and we" +
                        "need to wrap up for the day");
                done = true;
            }


        }

        /*
        //Tree set and Comparator in action today
        Set<Post> postFeed = new TreeSet<>(new PostComparator());

        Date d1 = new Date(1649360546000l);
        Date d2 = new Date(1653048000000l);
        Date d3 = new Date(1645981200000l);
        Date d4 = new Date(1671926400000l);
        Date d5 = new Date(1649408400000l);

        Post p1 = new Post("What a great day, P1", new User(), d1);
        Post p2 = new Post("What a random day, P2", new User(), d2);
        Post p3 = new Post("I don't even know what day this is, P3", new User(), d3);
        Post p4 = new Post("I think its Christmas, P4", new User(), d4);
        Post p5 = new Post("Welcome to tomorrow, P5", new User(), d5);

        postFeed.add(p1);
        postFeed.add(p2);
        postFeed.add(p3);
        postFeed.add(p4);
        postFeed.add(p5);
        postFeed.add(p5);

        System.out.println(postFeed);
         */
    }

}

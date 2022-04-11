package com.revature.exceptions;

public class UsernameOrPasswordIncorrectException extends RuntimeException{

    public UsernameOrPasswordIncorrectException(){
        super("The users provided username or password do not match those stored in the database");
    }

    public UsernameOrPasswordIncorrectException(String message){
        super(message);
    }

}

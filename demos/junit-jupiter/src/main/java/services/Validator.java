package services;

import java.util.regex.Pattern;


/**
 * This class will be used to validate certain types of strings
 */
public class Validator {
    private final String emailPattern = "^([0-9a-zA-Z.]+@[0-9a-zA-Z]+[.][a-zA-Z]+){1,40}$";
    private final String usernamePattern = "^[a-zA-Z0-9]{5,40}$";
    private final String passwordPattern = "^(?=.*?[#?!@$%^&*-])[a-zA-Z0-9].{8,40}$";

    public boolean validate(String string, String pattern) {
        System.out.println("Validating: " + string);
        return Pattern.compile(pattern).matcher(string).find();
    }

    public boolean validateEmail(String email) {
        return validate(email, emailPattern);
    }

    public boolean validateUsername(String username) {
        return validate(username, usernamePattern);
    }

    public boolean validatePassword(String password) {
        return validate(password, passwordPattern);
    }


}

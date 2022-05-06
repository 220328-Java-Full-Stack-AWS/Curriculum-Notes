package services;

import entities.ComplicatedThing;
import exceptions.InvalidInputException;

import java.util.Arrays;

public class ComplicatedService {
    private final Validator validator;


    public ComplicatedService(Validator validator) {
        this.validator = validator;
    }

    public ComplicatedThing complexWork(String string, Integer integer, Object object) throws InvalidInputException {
        if(!validator.validateEmail(string)) { //we will want to mock this
            throw new InvalidInputException("Input does not match valid pattern");
        }

        char[] charArray = string.toCharArray();
        Arrays.sort(charArray);
        String sortedString = new String(charArray);
        sortedString = sortedString.intern();

        if(integer > 45000 || integer < 1) {
            throw new InvalidInputException("Integer outside of valid range");
        }
        integer *= integer;

        return new ComplicatedThing(sortedString, integer, object);
    }
}

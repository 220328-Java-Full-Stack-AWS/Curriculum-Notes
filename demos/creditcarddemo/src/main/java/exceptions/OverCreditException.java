package exceptions;

//To create a custom exception, we need to extend Exception or RunTimeException
public class OverCreditException extends Exception{

    //We also want to create at least one constructor
    public OverCreditException(){
        super("Customer went over their credit limit");
    }

    public OverCreditException(String message){
        super(message);
    }

}

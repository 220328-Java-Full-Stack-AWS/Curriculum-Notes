package exceptions;

public class InvalidBalancePaymentException extends RuntimeException {

    public InvalidBalancePaymentException(){
        super("Customer tried inputting an invalid amount for payment");
    }

}

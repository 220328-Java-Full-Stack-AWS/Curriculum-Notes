import exceptions.OverCreditException;
import model.*;

import java.util.Date;

public class CreditCardDriver {

    public static void main(String args[]){

        //Abstract class cannot be instantiated
        //Customer c = new Customer();

        Date experation = new Date(1775403520000l);

        ChaseCustomer cc = new ChaseCustomer("Kenneth", "Strohm", "123 play grnd stret", 555555555555l, experation, (short) 123, 11122333, 500.0);

        DiscoverCustomer dc = new DiscoverCustomer("Terrell", "Crawford", "123 Revature Way", 123456789l, experation, (short)789, 55566777, 1000.0);

        ChaseAndDiscoverCustomer cadc = new ChaseAndDiscoverCustomer("Robert", "Sutton", "432 RippedOff Lane", 987654321l, experation, (short)546, 888990123, 2000.0);

        System.out.println(cc.getBalance());

        cc.purchase("Food", 500);

        System.out.println(cc.getChasePoints());

        cc.calculateInterest();

        System.out.println(cc.getBalance());

        cc.payBalance(1000.0);

        System.out.println(cc.getBalance());

        //If we attempt to call dc.purchase, there should be an issue because we have to handle the exception
        //We must either surround this exception in a try catch, or duck it further
        try{
            dc.purchase("Food", 700.00);
            System.out.println(dc.getBalance());
            dc.purchase("Travel", 500.00);
            System.out.println(dc.getBalance());
        } catch (OverCreditException e){
            e.printStackTrace();
        } finally {
            dc.payBalance(700.00);
            System.out.println(dc.getBalance());
        }

        //To prove we don't have to handle the RuntimeException we created, we will "accidentally" make one occur
        cadc.purchase("FOOD", 400);
        System.out.println(cadc.getBalance());
        cadc.payBalance(400);
        System.out.println(cadc.getBalance());


    }

}

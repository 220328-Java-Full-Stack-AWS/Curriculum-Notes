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

    }

}

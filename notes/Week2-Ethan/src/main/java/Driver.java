import arrays.ArraysFun;
import accessandscope.Person;

public class Driver {

    public static void main(String args[]){
        /*
        //Create an instance of our ArraysFun class, so we can access the methods provided
        ArraysFun af = new ArraysFun();
        af.printName(2);
        af.getLength();
        af.setNumber(0, 10);
        af.arrayLoop();
        af.twoDLoop();
        int sillyWayToCreateAnArray[] = af.varArgsExample(1,2,3,4,5,6,7,8,9,1,2,3,4,4,5,6,7,8);
        //Enhanced for loop
        //The only downside to enhanced for loops is that we have no index information
        for(int num : sillyWayToCreateAnArray){
            System.out.println(num);
        }
        af.twoDCheck();
        */
        Person p = new Person("Ethan", 24, "SuperSECUREPassword", "Java");
        Person p2 = new Person("Kenneth", 0, "AnotherSuperPassword", "Java");

        //We should be able to access id, being, and name from the driver class
        System.out.println(p.name);
        System.out.println(p.id);
        System.out.println(p.being);
        System.out.println(p2.being);
        p.being = "Dog";
        System.out.println(p2.being);

        //If we attempt to change that final variable
        //p.id = 2;
    }

}

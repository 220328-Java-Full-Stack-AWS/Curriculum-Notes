import animals.Animal;
import people.Person;

public class Main {
    public static void main(String[] args) {
        //print the command line arguments
        Args.printArgs(args);

        //print numbers 1-10 in a for loop
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //Check the number of instances of Person objects based on the incrementing numOfPeople static member
        System.out.println("How many people?");
        System.out.println("Before instantiation:" + Person.getStaticNumOfPeople());

        //instantiate two new Person objects
        //Type identifier = new Type(); //This is the basic object instantiation expression
        Person kyle = new Person("Kyle", 36, "Blue");
        Person chenxi = new Person("Chenxi", 29, "Blue");

        //check numOfPeople again now that we have instantiated new people
        System.out.println("Chenxi: " + chenxi.getNumOfPeople());
        System.out.println("Kyle: " + kyle.getNumOfPeople());


        Animal bobby = new Animal();
        bobby.setSound("meow");
        Animal summer = new Animal("meow");


        StaticTest staticTest1 = new StaticTest();
        StaticTest staticTest2 = new StaticTest();

        staticTest1.setStr("one");
        staticTest1.setStr("one");
        staticTest2.setStr("two");
        staticTest2.setObjectStaticString("two");


        System.out.println(staticTest1.getStr()); //set obj1 local member to "one"
        System.out.println(staticTest1.getObjectStaticString()); //set obj1 static member to "one"
        System.out.println(staticTest2.getStr()); //set obj2 local member to "two"
        System.out.println(staticTest2.getObjectStaticString()); //set obj2 static member "two" - this overwrites the "one" from earlier


    }
}

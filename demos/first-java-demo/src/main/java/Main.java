public class Main {
    public static void main(String[] args) {
        byte by = 127;
        Byte myByte = 127;
        short s = 32767;
        Short myShort = 32767;
        int i = 0; //integer primitive
        Integer myInteger;
        long l = 1;
        Long myLong;
        char c = 'c';
        Character myCharacter;
        float f = 0.5f;
        Float myFloat;
        double d = 0.5;
        Double myDouble;
        boolean b = true;
        Boolean myBoolean;

        int jj = 5;
        float ff = jj;
        int ii = (int) ff;
        float fff = (float) 1;


        OverloadTest.test(12, 2);


        Integer boxed;
        boxed = 7; //7 is an int, but we just put it in the Integer wrapper class with no fuss. No need for constructors or the new keyword
        int unboxed = boxed;
        unboxed++;
        boxed = unboxed;
        boxed++;

        //this is not autoboxing, it's just another similar shortcut so we don't have to use the new keyword.
        String str = "hello";
        String str2 = "hello";
        String str3 = new String("hello");

        if (str == str3) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are NOT equal.");
        }

        str3 = str3.intern();


        System.out.println("After interning...");
        if (str == str3) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are NOT equal.");
        }

        //str == str2 is true //equality checking on reference value
        //str == str3 is false //equality checking on reference value
        //str.equals(str3) is true //this is a deep equality check. This is the good way to test equality.

        /*
        The syntax String str = "string"; puts the string in the string pool
        The syntax String str = new String("String"); does not.
        If we wanted to move a string into the string pool, we call it's intern method.
         */

        String immutableString = "this string cannot be changed.";
        immutableString = immutableString + " let's add more to the string.";


        StringBuilder stringBuilder = new StringBuilder("Beginning of string.");
        stringBuilder.append(" New text appended to the end of the string.");
        System.out.println(stringBuilder.toString());

        StringBuffer stringBuffer = new StringBuffer("Beginning of buffer.");
        stringBuffer.append(" Here we are adding new text to the end of the string.");
        System.out.println(stringBuffer.toString());


        //char[] array = new char[]{'h', 'e', 'l', 'l', 'o'}; //this is a character array, which is what is under the hood of strings.


/*
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

*/
    }
}

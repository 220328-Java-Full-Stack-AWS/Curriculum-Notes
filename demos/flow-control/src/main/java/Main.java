import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Control flow is the flow of instructions that are executed by the CPU (or interpreted into instructions by
        the JVM). Normally execution begins at the first instruction at the program entry point, and continues
        line by line. However, sometimes we cause the JVM to execute instructions that aren't directly next to the
        previous one. This is control flow. We can have execution take different branching paths, loop infinitely or
        until we want it to stop, and even invoking and returning from methods are examples of flow control according
        to our definition.


        Loops:
            for
            while
            do-while
            for-each

        Branching:
            if
            if-else
            switch
                case
                default
                break

        These aren't normally what we think of when we say "control flow" but see our definition above.
        Breaks:
            continue
            break
        Method invocation:
            invoke
            return
         */

        //For Loops:
        //starting condition; ending condition (we loop as long as this is true); iteration
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        for(int j = 10; j != 5; j--) {
            System.out.print(j); //prinln() does a carriage return, print() does not
        }
        System.out.println(); //this is to add a newline
        for(int k = 100; k % 2 == 0; k /= 2) {
            System.out.println(k);
        }

        //super basic while loop, nearly the same as the first for loop above.
        int i = 0;
        while(i < 10) {
            System.out.println(i);
            i++;
        }

        //do while loop. The only real difference between this and while loop is that this one will always
        //execute at least once, because the check is done after the loop.
        do {
            System.out.println(i);
            i--;
        } while (i > 0);


        /*
        For the for-each AKA enhanced for loop, we need an iterable collection. Iterable is an interface which basically
        says that anything implementing it should be able to produce an Iterator. An iterator is a cursor that can be used
        to point to each item in the collection. Iterators are very simple, and have two methods:
        next() and hasNext(). We'll discuss this at another time, what's important is to know that the for-each loop needs
        to get this iterator and utilize it to loop through the collection.

        So here I am creating a LinkedList, which implements Iterable and thus can be used in a for-each loop.
         */
        List<String> myList = new LinkedList<>();
        myList.add("Kyle");
        myList.add("Khalid");
        myList.add("Terrell");
        myList.add("Mohammad");


        int[] ar = new int[5];
        int iiiiii = ar.length;

        /*
        The for-each loop uses the keyword for, just like a normal for loop. However, note how the syntax is different.
        There is a temp reference to a member of the collection, and the reference to the collection.
        Each iteration, one member of the collection is retrieved and stored in the temp variable.
         */
        for (String temp : myList) {
            System.out.println(temp);
        }

        List<Integer> a = new LinkedList<>();
        a.add(14);
        a.add(266);
        a.add(38765);
        a.add(25);

        for (int ii : a) {
            System.out.println("Enhanced For Loop: " + ii);
        }

        for(int iii = 0; !a.get(iii).equals(25); iii++) {
            System.out.println("Regular for loop: " + a.get(iii));
        }

        /*
        Branching
         */
        if(myList.size() >= 3 && myList.size() <= 10 && myList.size() != 5) {
            System.out.println("do this");
        }

        /*
        true && true == true
        true && false == false
        false && true == false
        false && false == false

        true || true == true
        true || false = true
        false || true == true
        false || false == false
         */

        if(myList.size() > 2) {
            System.out.println("do the thing");
        } else {
            System.out.println("do a different thing");
        }


        int x = 4;
        if(x == 1) {
            System.out.println("x equals 1");
        } else if(x == 2) {
            System.out.println("x equals 2");
        } else if(x == 3) {
            System.out.println("x equals 3");
        } else if(x == 4) {
            System.out.println("x equals 4");
        } else if(x == 5) {
            System.out.println("x equals 5");
        } else {
            System.out.println("x is a big old number!");
        }


        switch(x) {
            case 1:
                System.out.println("x equals 1");
                break;
            case 2:
                System.out.println("x equals 2");
                break;
            case 3:
                System.out.println("x equals 3");
                break;
            case 4:
                System.out.println("x equals 4");
                break;
            case 5:
                System.out.println("x equals 5");
                break;
            default:
                System.out.println("x is a big old number!");
                break;
        }

        /*
        If we fail to add breaks to the cases, then we get "fall through" where nothing stops
        the execution from moving on to the next case. The other cases aren't checked, execution simply goes on
        to those lines like normal. So we need to break out of each case. Sometimes we may want to have fall through,
        like in the example below.
         */
        String userInput = "q";
        switch(userInput) {
            case "Q":
            case "q":
                System.out.println("you entered q");
                break;
            case "M":
            case "m":
                System.out.println("you entered m");
                break;
        }




        /*
        When it comes to loops, we have two mroe tools we can use: break and continue.
         */

        //x is 4, we set it above
        while(true) {
            x++;
            System.out.println(x);
            if(x > 7) {
                break;
            }
        }

        //good use case for break: searching a list
        for (String temp : myList) {
            System.out.println(temp);
            if(temp.equals("Kyle")) {
                break; //we found the one we are looking for, no need to continue through the rest of the list.
            }
        }

        for (int k = 0; k < 10; k++) {
            if(k % 2 != 0) {
                continue;
            }
            System.out.println(k + " is even");
        }
    }
}

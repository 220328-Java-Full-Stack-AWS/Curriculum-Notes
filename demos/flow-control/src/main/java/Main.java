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

        /*
        The for-each loop uses the keyword for, just like a normal for loop. However, note how the syntax is different.
        There is a temp reference to a member of the collection, and the reference to the collection.
        Each iteration, one member of the collection is retrieved and stored in the temp variable.
         */
        for (String temp : myList) {
            System.out.println(temp);
        }













    }
}

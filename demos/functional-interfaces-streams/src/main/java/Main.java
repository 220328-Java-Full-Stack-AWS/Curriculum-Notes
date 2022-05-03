import utils.PrintUtil;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static utils.PrintUtil.print;


public class Main {
    public static void main(String[] args) {

        /**
         * Here we create an ad-hoc implementation for the interface. We are assigning a lambda
         * function to the reference, this results in an implementation for the single abstract
         * method in our functional interface. Hence, the single abstract method limitation for
         * these types of interfaces. This is no different from implementing an interface in
         * a class, like we do in ConcreteImplementation.
         **/
        FunctionalInterfaceTest functionalImplementation = str -> {
            StringBuilder sb = new StringBuilder();
            for(int i = str.length() - 1; i >= 0; i--) {
                sb.append(str.charAt(i));
            }
            return sb.toString();
        };

        System.out.println(functionalImplementation.doSomething("hello, world!"));

        ConcreteImplementation concreteImplementation = new ConcreteImplementation();
        System.out.println(concreteImplementation.doSomething("Goodbye, world!"));


        /**
         * Streams - Streams are also part of the functional programming features
         * introduced in Java 8.
         */
        List<String> names = new LinkedList<>();
        names.add("Mohammad");
        names.add("Terell");
        names.add("William");
        names.add("Stan");
        names.add("Montrell");
        names.add("Qiang");
        names.add("Tony");
        names.add("Fatemah");
        names.add("Frederick");
        names.add("Leonel");
        names.add("Giorgi");
        names.add("Randall");
        names.add("Jack");
        names.add("Kenneth");
        names.add("Steven");
        names.add("Bill");
        names.add("George");
        names.add("Brandon");
        names.add("Diego");
        names.add("Anthony");
        names.add("Jarod");
        names.add("Chenxi");
        names.add("Arun");

        List<String> newList = names.stream()
                .filter(s ->  {return s.length() >= 6;})
                .sorted()
                .peek(s -> {System.out.println(s);})//These three lines are basically the same
                .peek(s -> System.out.println(s))//This is a shortcut, it's a single statement so we can shortcut out some of the code
                .peek(System.out::println)//this is a method reference
                .peek(PrintUtil::print)
                .peek(s -> print(s))
                .limit(10)
                .skip(5)
                .collect(Collectors.toList());

        System.out.println(newList);

        Optional<String> mightExist = newList.stream().findAny();

        if(mightExist.isPresent()) {
            System.out.println("\"Random\" name: " + mightExist.get());
        } else {
            System.out.println("List Empty");
        }













    }
}

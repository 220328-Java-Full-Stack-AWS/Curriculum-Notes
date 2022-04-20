import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String str = "Kyle thinks optionals are cool, because of the ofNullable() method";

        //here we use the empty parameter list to invoke the overload that returns an empty Optional
        System.out.println(OptionalsTest.optionalTest());

        //here we use the parameter list that takes a string to invoke the overload that returns a non-empty Optional
        System.out.println(OptionalsTest.optionalTest(str));

        //What do we do with Optionals? We avoid doing null checks.
        //this is what a normal null check looks like.
        if(OptionalsTest.nullTest() == null) {
            System.out.println("not null");
        }

        //Optional null check - null
        if(OptionalsTest.optionalTest("string").isPresent()) {
            System.out.println("This optional is holding a non-null ref");
        }

        if(!OptionalsTest.optionalTest().isPresent()) {
            System.out.println("This optional is holding a null reference");
        }

        //An example of using Optionals with good workflow to check for nullness
        Optional<String> check = OptionalsTest.optionalNullable();
        if(check.isPresent()) {
            System.out.println("Optional contains string: " + check.get());
        } else {
            System.out.println("Optional was empty.");
        }
    }
}

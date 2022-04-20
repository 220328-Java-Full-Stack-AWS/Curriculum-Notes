import java.util.Optional;

public class OptionalsTest {
    public static Optional<String> optionalTest() {
        return Optional.empty();
    }

    public static Optional<String> optionalTest(String str) {
        return Optional.of(str);
    }

    public static Optional<String> optionalNullable(){
        //~50% pseudo-random number to get a string or not

        String str = null;
        if((Math.random() * 10) <= 5) {
            str = "something";
        }


        return Optional.ofNullable(str);
    }

    public static String nullTest() {
        return null;
    }

    public static String nullTest(String str) {
        return str;
    }


}

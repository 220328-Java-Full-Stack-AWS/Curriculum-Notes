public interface FunctionalInterfaceTest {
    String doSomething(String str);

    default String defaultMethod(String str) {
        System.out.println("Default interface method: " + str);
        return str;
    }

    static String staticMethod(String str) {
        System.out.println("Static interface method: " + str);
        return str;
    }
}

public class ConcreteImplementation implements FunctionalInterfaceTest{


    /**
     * This implementation is no different form the implementation we built in
     * Main. With functional interfaces it is not necessary to create a concrete
     * implementing class, we can instead assign this implementation with a
     * lambda function.
     */
    @Override
    public String doSomething(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}

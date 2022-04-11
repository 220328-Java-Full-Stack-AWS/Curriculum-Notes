package accessandscope;

public class PersonSamePackage {

    //This is to test the same package capability of protected
    Person p = new Person("Ethan", 24, "Passord", "Java");

    //Here inside of the the same package, we have access to the age variable
    int personsAge = p.age;

    //We also have access to the default
    String personsPassword = p.password;

}

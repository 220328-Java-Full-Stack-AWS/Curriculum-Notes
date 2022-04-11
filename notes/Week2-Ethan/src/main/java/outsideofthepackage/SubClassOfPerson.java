package outsideofthepackage;

import accessandscope.Person;

public class SubClassOfPerson extends Person {

    public SubClassOfPerson(String name, int age, String password, String tech) {
        super(name, age, password, tech);
    }

    //To access the Person variable that is protected we will have to use the this keyword
    int subClassAge = this.age;

    //Password is default, so it is only accessible inside of the same package, not inside of a subclass
    //String pass = this.password;

}

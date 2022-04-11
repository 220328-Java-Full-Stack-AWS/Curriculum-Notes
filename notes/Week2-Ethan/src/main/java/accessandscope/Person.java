package accessandscope;

public class Person {

    // The final keyword denotes that we cannot reassign the value now that its been assigned
    public final int id = 1;

    //The static keyword denotes that the being variable is class scope, and every instance of Person
    //will share that same value
    //Class scope
    public static String being = "Human";

    //public access modifer means we can access the variable from anywhere
    //instance scope
    public String name;

    //protected means that we can access within the same package and subclasses
    //instance scope
    protected int age;

    //Default is only within the same package
    //instance scope
    String password;

    //Private is only accessible within the class
    private String tech;

    public Person(String name, int age, String password, String tech) {
        this.name = name;
        this.age = age;
        this.password = password;
        this.tech = tech;
    }

    public void setTech(String tech){
        //Any variable inside of this block is a method scope
        String techLowerCase = tech.toLowerCase();
        //If we tried to access this techLowerCase method outside of the setTech method, java would yell at us
        this.tech = techLowerCase;
    }

    //This does not work, because the techLowerCase variable only exists in that method
    //String lowerTech = techLowerCase;

    public void setAge(int age){
        if(age < 0){
            //Any variable inside of this is a block scope
            int newAge = 0;
            this.age = newAge;
        }

        //This also will not work, because it does not exist outside of the if block
        //System.out.println(newAge);
    }
}

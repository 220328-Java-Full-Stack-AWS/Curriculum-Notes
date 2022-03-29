package people;


public class Person {
    private String name;
    private int age;
    private String favoriteColor;
    private static int numOfPeople = 0;

    public Person() {
        numOfPeople++;
    }

    public Person(String name, int age, String favoriteColor) {
        this.name = name;
        this.age = age;
        this.favoriteColor = favoriteColor;
        numOfPeople++;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getNumOfPeople() {
        return numOfPeople;
    }

    public static int getStaticNumOfPeople() {
        return numOfPeople;
    }


}

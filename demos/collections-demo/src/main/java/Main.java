import com.revature.CustomArrayList;
import com.revature.CustomList;
import com.revature.User;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("test");
        myList.add("test");
        myList.add("two");
        myList.add("three");
        myList.add("four");

        System.out.println(myList);

        myList.remove(0);
        myList.remove("three");

        System.out.println(myList);

        myList.add(2, "three");

        System.out.println(myList);

        if(myList.isEmpty()) {
            System.out.println("List is empty?");
        }

        myList.clear();
        if(myList.isEmpty()) {
            System.out.println("List is empty!");
        }


        myList.add("test");
        myList.add("test");
        myList.add("two");
        myList.add("three");
        myList.add("four");
        List<String> newList = myList.subList(2, 5);

        System.out.println(newList);

        Map<String, User> myMap = new HashMap<>();
        myMap.put("Kyle", new User("Kyle", "Plummer", 37));
        myMap.put("Rebecca", new User("Rebecca", "Candelaria", 28));
        myMap.put("Steven", new User("Steven", "Knox", 800));

        Set<String> keySet =  myMap.keySet();

        for(String key : keySet) {
            System.out.println(key);
            System.out.println(myMap.get(key));
        }

        Collection<User> userValues = myMap.values();
        for(User user : userValues) {
            System.out.println(user);
        }

        Set<String> mySet = new HashSet<>();
        mySet.add("Test");


        for(String str : mySet) {
            System.out.println(str);
        }

        Deque<String> myDeque = new ArrayDeque<>();
        myDeque.push("one");
        myDeque.push("two");
        myDeque.push("three");



        while(!myDeque.isEmpty()) {
            System.out.println(myDeque.removeLast());
        }


        CustomList<String> customList = new CustomArrayList<>();
        customList.add("Hello");
        customList.add("World!");



        System.out.println("Custom list stuff: ");
        for(String str : customList) {
            System.out.println(str);
        }

        System.out.println("Custom list stuff after clear(): ");
        customList.clear();
        for(String str : customList) {
            System.out.println(str);
        }

        customList.add("Hello");//0
        customList.add("Test");//1
        customList.add("World");//2
        customList.add("Test");//3

        customList.remove("Test");
        customList.remove(3);

        System.out.println("Custokm list after testing remove functionality...");
        for(String str : customList) {
            System.out.println(str);
        }

        CustomList<Integer> c2 = new CustomArrayList<>();
        c2.add(12);









    }
}

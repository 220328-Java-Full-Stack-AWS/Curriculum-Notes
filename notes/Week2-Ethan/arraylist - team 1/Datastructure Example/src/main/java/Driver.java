public class Driver {

    public static void main(String[] args) {

        MyArrayList myList = new MyArrayList();

        for(int i = 0; i < 12; i++){
            myList.add(i);
        }

        System.out.println("After adding elements");
        for(int i = 0; i < myList.size(); i++){
            System.out.println(myList.getItem(i));
        }

        myList.remove(5);

        System.out.println("After Removing element 5");
        for(int i = 0; i < myList.size(); i++){
            System.out.println(myList.getItem(i));
        }

        myList.clear();

        System.out.println("After Clear");
        for(int i = 0; i < myList.size(); i++){
            System.out.println(myList.getItem(i));
        }
        System.out.println("Size of array = " + myList.size());

    }
}

public class MyArrayList {

    int[] intArr = new int[10];
    private int size = 0;

    public MyArrayList(){

    }

    public int size(){
        return this.size;
    }

    public void add(int intToAdd){

        // If current size is equal to max size of the array make a new array giving us more space (50% more space)
        if (size == intArr.length){
            int newLength = intArr.length + intArr.length / 2;
            int[] newArr = new int[newLength];

            // Copy elements from previous array
            for(int i = 0; i < intArr.length; i++){
                newArr[i] = intArr[i];
            }
            // Add the element to the end
            newArr[size] = intToAdd;
            // Set reference to newly created array
            this.intArr = newArr;
        }
        else {
            intArr[size] = intToAdd;
        }

        this.size++;
    }

    public void remove(int index){

        // Initialize a new array
        int[] newArr = new int[intArr.length];

        // Pointer variables
        int oldArrIndex = 0;
        int newArrIndex = 0;

        // Execute for every element inside the class array
        // Copy elements to our new array
        while(oldArrIndex < size - 1){
            // If we reach the index we are trying to remove.
            // Point to the next element in the class array
            if(oldArrIndex == index){
                oldArrIndex++;
            }
            else {
                oldArrIndex++;
                newArrIndex++;
            }

            // Copy element
            newArr[newArrIndex] = intArr[oldArrIndex];
        }
        size--;

        // Make class array reference the new array
        this.intArr = newArr;
        }


    public void clear(){
        intArr = new int[10];
        this.size = 0;
    }

    public int getItem(int index){
        return intArr[index];
    }

}

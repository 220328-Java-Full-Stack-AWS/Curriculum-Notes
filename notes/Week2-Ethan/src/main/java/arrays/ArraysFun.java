package arrays;

public class ArraysFun {

    //One way to create a new array
    int[] intArray = new int[10];

    //Another way to create an array
    String names[] = {"Ethan", "Mohammad", "Giorgi"};

    //Create a multi-dimensional array
    int[][] twoDArray = new int[3][3];

    //Access arrays we need to use their index
    public void printName(int index){
        System.out.println(names[index]);
    }

    //Lets get the length of the array
    public void getLength(){
        //We can use the .length property of the arrays to see how many indexes they have
        System.out.println(intArray.length);
    }

    public void setNumber(int index, int number){
        intArray[index] = number;
        System.out.println(intArray[index]);
    }

    public void arrayLoop(){
        for(int i=0; i<intArray.length; i++){
            intArray[i] = i+1;
        }
        for(int i=0; i<intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }

    public void twoDLoop(){
        int number = 1;

        //int twoDArray[i][j] = {{1,2,3},{4,5,6},{7,8,9}}

        for(int i=0; i<twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                twoDArray[i][j] = number;
                number++;
                System.out.print(twoDArray[i][j]);
                System.out.print(",");
            }
            System.out.println();
        }
    }

    public void twoDCheck(){
        for(int i=0; i<twoDArray.length; i++){
            System.out.println(twoDArray[i]);
        }
    }

    //Var args
    public int[] varArgsExample(int... values ){

        return values;

    }




}

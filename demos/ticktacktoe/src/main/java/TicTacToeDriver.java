import java.util.Scanner;

public class TicTacToeDriver {

    private Scanner scan = new Scanner(System.in);
    private int counter = 0;

    public static void main(String args[]){

        TicTacToeDriver tttd = new TicTacToeDriver();

        //Where do we start?
        //2D array for a board
        //A variable for whos turn
        char board[][] = {{'1','2','3'}, {'4','5','6'}, {'7', '8', '9'}};
        boolean isXTurn = true;



        //Test to see for the patterns
       while(!tttd.isGameOver(board)){
           System.out.println("Choose a position on the current board");
           for(int i=0; i<board.length; i++){
               for(int j=0; j<board[i].length; j++){
                   System.out.print(board[i][j]);
                   System.out.print(",");
               }
               System.out.println();
           }

           String nextline = tttd.scan.nextLine();

       }




    }

    public boolean isGameOver(char[][] board){
        counter++;
        //O,O,O
        //-,-,-
        //-,-,-
        if(board[0][0] == board[0][1] && board[0][1] == board[0][2]){
            return true;
        }
        else if(board[1][0] == board[1][1] && board[1][1] == board[1][2]){
            return true;
        }
        else if(board[2][0] == board[2][1] && board[2][1] == board[2][2]){
            return true;
        }
        else if(counter == 9){
            return true;
        }
        else{
            return false;
        }
    }

}

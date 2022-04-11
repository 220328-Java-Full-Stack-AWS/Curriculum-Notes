import java.util.Scanner;

public class TicTacToeDriver {

    private Scanner scan = new Scanner(System.in);
    private int counter = 0;
    private boolean tie;

    public static void main(String args[]){

        TicTacToeDriver tttd = new TicTacToeDriver();

        //Where do we start?
        //2D array for a board
        //A variable for whos turn
        char board[][] = {{'1','2','3'}, {'4','5','6'}, {'7', '8', '9'}};
        boolean isXTurn = true;

        //Test to see for the patterns
       while(!tttd.isGameOver(board)){
           if(isXTurn){
               System.out.println("Player X choose a position");
           }
           else {
               System.out.println("Player O choose a position");
           }
           for(int i=0; i<board.length; i++){
               for(int j=0; j<board[i].length; j++){
                   System.out.print(board[i][j]);
                   System.out.print(",");
               }
               System.out.println();
           }

           int position = tttd.scan.nextInt();

           int row = ((position+2)/3)-1;
           int col = (position+2) % 3;

           if(board[row][col] != 'O' && board[row][col] != 'X'){
               if(isXTurn){
                   board[row][col] = 'X';
               }
               else {
                   board[row][col] = 'O';
               }
           }

           tttd.counter++;

           if(tttd.isGameOver(board)){
               if(isXTurn && !tttd.tie){
                   System.out.println("Player X has won the game");
               }
               else if(!isXTurn && !tttd.tie){
                   System.out.println("Player O has won the game");
               }
               else{
                   System.out.println("There was a tie");
               }
           }

           //System.out.println(tttd.counter);

           isXTurn = !isXTurn;

       }




    }

    public boolean isGameOver(char[][] board){
        //O,-,-
        //O,-,-
        //O,-,-
        if(board[0][0] == board[0][1] && board[0][1] == board[0][2]){
            return true;
        }
        else if(board[1][0] == board[1][1] && board[1][1] == board[1][2]){
            return true;
        }
        else if(board[2][0] == board[2][1] && board[2][1] == board[2][2]){
            return true;
        }
        else if(board[0][0] == board[1][0] && board[1][0] == board[2][0]){
            return true;
        }
        else if(board[0][1] == board[1][1] && board[1][1] == board[2][1]){
            return true;
        }
        else if(board[0][2] == board[1][2] && board[1][2] == board[2][2]){
            return true;
        }
        else if(board[0][0] == board[1][1] && board[1][1] == board[2][2]){
            return true;
        }
        else if(board[0][2] == board[1][1] && board[1][1] == board[2][0]){
            return true;
        }
        else if(counter == 9){
            tie = true;
            return true;
        }
        else{
            return false;
        }
    }

}

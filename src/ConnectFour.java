/**
 * Created by 18kohl on 5/16/17.
 */
public class ConnectFour implements BoardGame {
    private int[][] board;
    private int currentPlayer;
    private Position[] winningPositions;
    private int winner;
    
    public ConnectFour(){
    	newGame();
    }
    
    public void newGame(){
        board = new int[6][7];
        for(int[] row : board){
        	for(int num : row){
        		num = 0;
        	}
        }
    }

    @Override
    public boolean gameOver() {
        for(int space : board[0]){
            if(space == 0)
                return false;
        }
        return true;
    }

    @Override
    public int getWinner() {
        return 0;
    }

    @Override
    public Position[] getWinningPositions() {
        return new Position[0];
    }

    @Override
    public boolean columnFull(int column){
        for(int i = 0; i < 5; i++){
            if(getBoard()[i][column] == 0)
                return false;
        }
        return true;
    }

    @Override
    public void play(int column) {
        for(int[] row : board){
            if(board[row][column] == 0) {
                board[row][column] = currentPlayer;
                break;
            }
        }
    }

    @Override
    public int[][] getBoard() {
        return board;
    }

    public static void main(String[] args){
        ConnectFour game = new ConnectFour();
    }
}

/**
 * ConnectFour
 * @author Steven Kohl and Cam Brown
 * @version 5/27/17
 */
public class ConnectFour implements BoardGame {
    private int[][] board;
    private int currentPlayer;
    private Position[] winningPositions;
    private int winner;
    
    /**
     * Constructor for ConnectFour class
     */
    public ConnectFour(){
    	board = new int[6][7];
    	currentPlayer = 1;
    	winningPositions = new Position[4];
    	winner = 0;
    }
    
    /**
     * creates a new game of Connect Four
     */
    public void newGame(){
        for(int r = 0; r < board.length; r++){
        	for(int c = 0; c < board[0].length; c++)
        		board[r][c] = 0;
        }
        currentPlayer = 1;
        for(int i = 0; i < winningPositions.length; i++)
        	winningPositions[i] = new Position();
        winner = 0;
    }

    /**
     * checks if the game is over and sets the winner of the game
     */
    public boolean gameOver() {
    	if(getWinner() != 0){
    		winner = getWinner();
    		return true;
    	}
    	else for(int space : board[0]){
            if(space == 0)
                return false;
        }
        return true;
    }

    public int getWinner() {
    	//Check for vertical wins
        for(int player = 1; player <= 2; player++){
        	for(int c = 0; c <= 6; c++){
        		for(int r = 0; r <= 2; r++){
        			if(board[r][c] == player && board[r+1][c] == player && board[r+2][c] == player && board[r+3][c] == player){
        				for(int i = 0; i < 4; i++)
        					winningPositions[i] = new Position(r+i, c);
        				return player;
        			}
        		}
        	}
        }
        //Check for horizontal wins
        for(int player = 1; player <= 2; player++){
        	for(int r = 0; r <= 5; r++){
        		for(int c = 0; c <= 3; c++){
        			if(board[r][c] == player && board[r][c+1] == player && board[r][c+2] == player && board[r][c+3] == player){
        				for(int i = 0; i < 4; i++)
        					winningPositions[i] = new Position(r, c+i);
        				return player;
        			}
        		}
        	}
        }
        //Check for forward slash wins
        for(int player = 1; player <= 2; player++){
        	for(int r = 3; r <= 5; r++){
        		for(int c = 0; c <= 3; c++){
        			if(board[r][c] == player && board[r-1][c+1] == player && board[r-2][c+2] == player && board[r-3][c+3] == player){
        				for(int i = 0; i < 4; i++)
        					winningPositions[i] = new Position(r-i, c+i);
        				return player;
        			}
        		}
        	}
        }
        //Check for back slash wins
        for(int player = 1; player <= 2; player++){
        	for(int r = 0; r <= 2; r++){
        		for(int c = 0; c <= 3; c++){
        			if(board[r][c] == player && board[r+1][c+1] == player && board[r+2][c+2] == player && board[r+3][c+3] == player){
        				for(int i = 0; i < 4; i++)
        					winningPositions[i] = new Position(r+i, c+i);
        				return player;
        			}
        		}
        	}
        }
        return 0;
    }

    public Position[] getWinningPositions() {
        return winningPositions;
    }

    public boolean columnFull(int column){
        return (board[0][column] != 0);
    }
    
    public void play(int column) {
    	if(!columnFull(column)){
    		for(int row = board.length-1; row >= 0; row--){
            	if(board[row][column] == 0) {
                	board[row][column] = currentPlayer;
                	break;
            	}
        	}
    		currentPlayer = currentPlayer == 1 ? 2 : 1;
    	}
    }

    public int[][] getBoard() {
        return board;
    }
}

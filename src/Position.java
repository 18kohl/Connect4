/**
 * Position class, defining a position with a row and column
 * @author Steven Kohl and Cam Brown
 * @version 5/28/17
 */
public class Position {

    private int row, col;

    /**
     * Parametrized constructor
     * @param r the row
     * @param c the column
     */
    public Position(int r, int c){
        row = r;
        col = c;
    }

    /**
     * No-args constructor, setting row and column to -1, a nonexistent position
     */
    public Position(){
        row = -1;
        col = -1;
    }

    /**
     * Accessor method for the row
     * @return the row of the Position
     */
    public int getRow(){
        return row;
    }

    /**
     * Accessor method for the column
     * @return the column of the Position
     */
    public int getColumn(){
        return col;
    }

    /**
     * Mutator method for the row
     * @param r the row to set
     */
    public void setRow(int r){
        row = r;
    }

    /**
     * Mutator method for the column
     * @param c the column to set
     */
    public void setCol(int c){
        col = c;
    }

    /**
     * Equals method to compare this Position to another object
     * @param other an object to compare to the Position
     * @return true if other is a Position and has the same row and column as this Position
     */
    public boolean equals(Object other){
        if(other instanceof Position){
        	Position otherPosition = (Position)other;
        	return otherPosition.getRow() == row && otherPosition.getColumn() == col;
        }
        else return false;
    }
}

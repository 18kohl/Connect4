/**
 * Created by 18kohl on 5/16/17.
 */
public class Position {

    private int row, column;

    /**
     * Parametrized constructor
     * @param r the row
     * @param c the column
     */
    public Position(int r, int c){
        row = r;
        column = c;
    }

    /**
     * No-args constructor, setting row to 0 and column to 0
     */
    public Position(){
        row = 0;
        column = 0;
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
        return column;
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
    public void setColumn(int c){
        column = c;
    }

    /**
     * Equals method to compare this Position to another object
     * @param other an object to compare to the Position
     * @return true if other is a Position and has the same row and column as this Position
     */
    public boolean equals(Object other){
        return other instanceof Position && other.getRow() == row && other.getColumn() == column;
    }
}

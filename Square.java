
/**
 * Represents a single square in the maze.
 *
 * @author gcschmit
 * @version 1 June 2017
 */
public class Square
{

    public static final char SPACE = '_';
    public static final char WALL = '#';
    public static final char START = 'S';
    public static final char EXIT = 'E';

    // the state of the square in the context of the maze solver
    public enum State
    {
        UNEXPLORED,     // '_'
        ON_WORK_LIST,   // 'o'
        EXPLORED,       // '.'
        ON_PATH         // 'x'
    };

    private int row;
    private int col;
    private char type;
    private Square prev;
    private State state;    // this is required for the GUI to display progress

    /**
     * Constructor for objects of class Square
     * @param row col type
     */
    public Square(int r, int c, char t)
    {
        row = r;
        col = c;
        type = t;
    }


    /**
     * Returns this square's row
     *
     * @return    this square's row
     */
    public int getRow()
    {
        return row;
    }


    /**
     * Returns this square's column
     *
     * @return    this square's column
     */
    public int getCol()
    {
        return col;
    }


    /**
     * Returns this square's type
     *
     * @return    this square's type
     */
    public char getType()
    {
        return type;
    }


    /**
     * Returns this square's previous square
     *
     * @return    this square's previous square
     */
    public Square getPrev()
    {
        return this.prev;
    }

    /**
     * Sets the previous square to the specified square
     *
     */
    public void setPrev( Square prev )
    {
        this.prev = prev;
    }

    /**
     * Sets the square's state to the specified state
     *
     */
    public void setState(State s)
    {
        state = s;
    }


    /**
     * Resets this square
     *
     */
    public void reset()
    {
        
    }

    /**
     * toString method
     *
     * @return    string representation of the square
     * _, o, ., x, #, S, E
     */
    public String toString()
    {
        return "" + state;
    }


}

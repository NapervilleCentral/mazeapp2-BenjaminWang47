
/**
 * Represents a single square in the maze.
 *
 * @author gcschmit
 * @version 1 June 2017
 */
public class Square
{

    public static final int SPACE = 0;
    public static final int WALL = 1;
    public static final int START = 2;
    public static final int EXIT = 3;

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
    private int type;
    private Square prev;
    private State state;    // this is required for the GUI to display progress

    /**
     * Constructor for objects of class Square
     * @param row col type
     */


    /**
     * Returns this square's row
     *
     * @return    this square's row
     */


    /**
     * Returns this square's column
     *
     * @return    this square's column
     */


    /**
     * Returns this square's type
     *
     * @return    this square's type
     */


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


    /**
     * Resets this square
     *
     */

    /**
     * toString method
     *
     * @return    string representation of the square
     * _, o, ., x, #, S, E
     */


}

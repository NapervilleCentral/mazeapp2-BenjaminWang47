import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.ArrayList;

/**
 * Stores the logical layout of a maze.
 *
 * @author gcschmit
 * @version 1 June 2017
 */
public class Maze
{
    private Square[][] maze;

    /**
     * Constructor for objects of class Maze
     */
    public Maze()
    {
    }

    /**
     * Loads the maze from the specified file
     *
     * @param  fname  the name of the file containing the maze to be loaded
     * @return    true if the maze was successfully loaded; otherwise, false
     */
    public boolean loadMaze( String fname )
    {
        int numRows = 0;
        int numCols = 0;
        File mazeFile = new File( fname );
        Scanner in = null;

        try
        {

    }

    /**
     * Returns a list of the neighbors of the specified square
     *
     * @param  sq  the square whose neighbors to return
     * @return    a list of the neighbors of the specified square
     */
    public ArrayList<Square> getNeighbors( Square sq )
    {

    }

    /**
     * Returns the start square
     *
     * @return    the start square
     */


    /**
     * Returns the finish square
     *
     * @return    the finish square
     */


    /**
     * Returns the maze back to the initial state after loading.
     *
     */


    /**
     * toString
     *
     * @return    string representation of the maze
     */
    public String toString()
    {
        StringBuilder sb = new StringBuilder();

        for( int row = 0; row < this.maze.length; row++ )
        {
            for( int col = 0; col < this.maze[row].length; col++ )
            {
                sb.append( this.maze[row][col].toString() + " " );
            }

            sb.append( "\n" );
        }

        return new String( sb );
    }

}

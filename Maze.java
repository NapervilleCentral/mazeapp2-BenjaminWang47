import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.io.FileNotFoundException;
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
        try
        {
            Scanner in = new Scanner(mazeFile);
            numRows = in.nextInt();
            numCols = in.nextInt();
        }
        catch(FileNotFoundException s)
        {
            System.out.println("The file inputted could not be found.");
        }

        try
        {
            this.maze = new Square[numRows][numCols];

            for (int row=0; row < numRows; row++) {
                for (int col=0; col < numCols; col++) {
                    maze[row][col] = null;
                }
            }
        }
        catch(Exception NoSuchElementException)
        {
            System.out.println("Could not load the maze.");
            return false;
        }

        return true;
    }

    /**
     * Returns a list of the neighbors of the specified square
     *
     * @param  sq  the square whose neighbors to return
     * @return    a list of the neighbors of the specified square
     */
    public ArrayList<Square> getNeighbors( Square sq )
    {
        ArrayList<Square> neighbors = new ArrayList<>();
        
        if (sq.getRow() - 1 > 0)//North
        {
            neighbors.add(maze[sq.getRow() - 1][sq.getCol()]);
        }
        if (sq.getCol() + 1 < maze[sq.getRow()].length)//East
        {
            neighbors.add(maze[sq.getRow() - 1][sq.getCol()]);
        }
        if (sq.getRow() + 1 > maze.length)//South
        {
            neighbors.add(maze[sq.getRow() - 1][sq.getCol()]);
        }
        if (sq.getCol() - 1 > 0)//West
        {
            neighbors.add(maze[sq.getRow() - 1][sq.getCol()]);
        }
        
        return neighbors;
    }

    /**
     * Returns the start square
     *
     * @return    the start square
     */
    public Square getStart()
    {
        for( int row = 0; row < this.maze.length; row++ )
        {
            for( int col = 0; col < this.maze[row].length; col++ )
            {
                if (this.maze[row][col].getType() == 'S')
                    return this.maze[row][col];
            }
        }
        
        return null;
    }


    /**
     * Returns the finish square
     *
     * @return    the finish square
     */
    public Square getExit()
    {
        for( int row = 0; row < this.maze.length; row++ )
        {
            for( int col = 0; col < this.maze[row].length; col++ )
            {
                if (this.maze[row][col].getType() == 'E')
                    return this.maze[row][col];
            }
        } 
        
        return null;
    }


    /**
     * Returns the maze back to the initial state after loading.
     *
     */
    public void reset()
    {
        for( int row = 0; row < this.maze.length; row++ )
        {
            for( int col = 0; col < this.maze[row].length; col++ )
            {
                this.maze[row][col].resetSquare();
            }
        } 
    }


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

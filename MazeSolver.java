import java.util.ArrayList;

/**
 * Abstract class MazeSolver - write a description of the class here
 *
 * @author gcschmit
 * @version 2 June 2017
 */
public abstract class MazeSolver
{
    // instance variables - replace the example below with your own
    protected Maze maze;
    boolean foundExit;

    /**
     * Constructor
     *
     *  @param maze the maze to solve
     */
    MazeSolver(Maze maze)
    {
        this.maze = maze;
        this.foundExit = false;
        this.makeEmpty();
        this.add(this.maze.getStart());
    }

    /**
     * Create an empty worklist
     *
     */
    public abstract void makeEmpty();

    /**
     * Returns true if the worklist is empty
     *
     *  @return true if the worklist is empty
     */
    public abstract boolean isEmpty();

    /**
     * Adds the specified square to the worklist
     *
     *  @param the square to add to the worklist
     */
    public abstract void add(Square sq);

    /**
     * Returns the next item from the worklist
     *
     *  @return the next item from the worklist
     */
    public abstract Square next();

    /**
     * Returns true if either: A path from the start to the exit has been found; OR
     *      You determine there is no such path (worklist is now empty)
     *
     *  @return if the maze is solved
     */
    public boolean isSolved() {
        if (isEmpty()) {
            return true;
        }
        return foundExit;
    }

    /**
     * Returns either a string of the solution path as a list of coordinates [i,j]
     *      from the start to the exit or a message indicating no such path exists.
     *      If the maze isn't solved, a message is returned indicating such.
     *
     *  @return if the solution path if such a path exists
     */
    public String getPath()
    {
        String path = "";

        if (this.foundExit) {
            MyStack<String> stackPath = new MyStack<String>();
            Square sq = this.maze.getExit();
            
            while(sq != null)
            {
                sq.setState(Square.State.ON_PATH);
                stackPath.push("[" + sq.getRow() + ", " + sq.getCol() + "]");
                sq = sq.getPrev();
            }
            
            while(!stackPath.isEmpty())
            {
                path += stackPath.pop();
            }
        }
        else if(this.isEmpty())
        {
            path = "The maze has no solution.";
        }
        else if (!this.isSolved())
        {
            path = "The maze hasn't been solved yet.";
        }

        return path;
    }

    /**
     * Perform one iteration of the algorithm above (i.e., steps 1 through 5) and
     *      return the Square that was just explored (and null if no such Square exists).
     *
     *  @return the Square that was just explored (and null if no such Square exists)
     */
    public Square step()
    {
        // check if the maze cannot be solved
        Square rectangle;
        if( this.isEmpty() )
        {
            return null;
        }
        else {
            Square sq = this.next();
            if (sq == this.maze.getExit()) {
                System.out.println(this.getPath());
                return sq;
            }
            
            ArrayList<Square> neighbors = this.maze.getNeighbors(sq);
            for (int i = 0; i < neighbors.size(); i++) {
                Square sq1 = neighbors.get(i);
                if (sq1.getState() == Square.State.UNEXPLORED) {
                    this.add(sq1);
                    sq1.setState(Square.State.ON_WORK_LIST);
                }
            }
            
            sq.setState(Square.State.EXPLORED);
            rectangle = sq;
        }
        
        return rectangle;
    }

    /**
     * Repeatedly calls step() until you get to the exit square or the worklist is empty.
     *
     */
    public void solve() {
        while (!foundExit && !this.isEmpty()) {
            step();
        }
    }

}

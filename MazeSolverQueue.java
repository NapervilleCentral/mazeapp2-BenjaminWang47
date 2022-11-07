
/**
 * Write a description of class MazeSolverQueue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MazeSolverQueue extends MazeSolver
{
    public MazeSolverQueue() {
        super(maze);
    }
    
    /**
     * Create an empty worklist
     *
     */
    public void makeEmpty(){}

    /**
     * Returns true if the worklist is empty
     *
     *  @return true if the worklist is empty
     */
    public boolean isEmpty(){}

    /**
     * Adds the specified square to the worklist
     *
     *  @param the square to add to the worklist
     */
    public void add(Square sq){}

    /**
     * Returns the next item from the worklist
     *
     *  @return the next item from the worklist
     */
    public Square next(){}
}


/**
 * Testing the Maze Class
 */
public class MazeTester
{
    public static void main(String args[])
    {
        Maze maze = new Maze();
        maze.loadMaze("maze-1");
        
        System.out.println(maze);
        
        System.out.println(maze.getStart());
        System.out.println(maze.getNeighbors(maze.getStart()));
        
    }
}

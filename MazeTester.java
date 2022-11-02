
/**
 * Testing the Maze Class
 */
public class MazeTester
{
    public static void main(String args[])
    {
        Maze maze = new Maze();
        maze.loadMaze("testmaze.txt");
        
        System.out.println(maze);
        
        System.out.println(maze.getStart());
        
    }
}

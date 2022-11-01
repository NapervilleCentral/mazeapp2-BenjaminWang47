
/**
 * Write a description of class QueueTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QueueTester
{
    public static void main(String[] args)
    {
        MyQueue q = new MyQueue();
        
        q.enqueue("Tammy");
        q.enqueue("Kevin");
        q.enqueue("Ben");
        q.enqueue("Alex");
        
        System.out.println(q);
        
    }
}

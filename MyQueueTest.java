import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.NoSuchElementException;
import java.util.Queue;

/**
 * The test class MyQueueTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MyQueueTest
{
    /**
     * Default constructor for test class MyQueueTest
     */
    public MyQueueTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testEnqueue()
    {
        MyQueue<String> queue = new MyQueue<String>();

        // test pushing one element
        queue.enqueue( "a" );
        assertEquals( queue.front(), "a" );

        // test pushing two elements
        queue.enqueue( "b" );
        assertEquals( queue.front(), "a" );
    }

    @Test
    public void testDequeue()
    {
        MyQueue<String> queue = new MyQueue<String>();

        // test that an exception is thrown
        boolean exceptionThrown = false;
        try
        {
            queue.dequeue();
        }
        catch( NoSuchElementException e )
        {
            exceptionThrown = true;
        }
        assertEquals( exceptionThrown, true );

        // test poping elements
        queue.enqueue( "a" );
        queue.enqueue( "b" );
        queue.enqueue( "c" );
        assertEquals( queue.dequeue(), "a" );
        assertEquals( queue.dequeue(), "b" );
        assertEquals( queue.dequeue(), "c" );
    }

    @Test
    public void testFront()
    {
        MyQueue<String> queue = new MyQueue<String>();

        // test that an exception is thrown
        boolean exceptionThrown = false;
        try
        {
            queue.front();
        }
        catch( NoSuchElementException e )
        {
            exceptionThrown = true;
        }
        assertEquals( exceptionThrown, true );

        // test top elements
        queue.enqueue( "a" );
        queue.enqueue( "b" );
        queue.enqueue( "c" );
        assertEquals( queue.front(), "a" );
        assertEquals( queue.front(), "a" );
    }

    @Test
    public void testSize()
    {
        MyQueue<String> queue = new MyQueue<String>();

        assertEquals( queue.size(), 0 );
        queue.enqueue( "a" );
        queue.enqueue( "b" );
        queue.enqueue( "c" );
        assertEquals( queue.size(), 3 );
    }
    
    @Test
    public void testIsEmpty()
    {
        MyQueue<String> queue = new MyQueue<String>();

        assertEquals( queue.isEmpty(), true );
        queue.enqueue( "a" );
        assertEquals( queue.isEmpty(), false );
    }
    
    @Test
    public void testClear()
    {
        MyQueue<String> queue = new MyQueue<String>();

        queue.enqueue( "a" );
        queue.enqueue( "b" );
        queue.enqueue( "c" );
        queue.clear();
        assertEquals( queue.isEmpty(), true );
    }
}

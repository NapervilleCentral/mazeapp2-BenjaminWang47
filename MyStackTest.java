
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.NoSuchElementException;

/**
 * The test class MyStackTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MyStackTest
{
    /**
     * Default constructor for test class MyStackTest
     */
    public MyStackTest()
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
    public void testPush()
    {
        MyStack<String> stack = new MyStack<String>();

        // test pushing one element
        stack.push( "a" );
        assertEquals( stack.top(), "a" );

        // test pushing two elements
        stack.push( "b" );
        assertEquals( stack.top(), "b" );
    }

    @Test
    public void testPop()
    {
        MyStack<String> stack = new MyStack<String>();

        // test that an exception is thrown
        boolean exceptionThrown = false;
        try
        {
            stack.pop();
        }
        catch( NoSuchElementException e )
        {
            exceptionThrown = true;
        }
        assertEquals( exceptionThrown, true );

        // test poping elements
        stack.push( "a" );
        stack.push( "b" );
        stack.push( "c" );
        assertEquals( stack.pop(), "c" );
        assertEquals( stack.pop(), "b" );
        assertEquals( stack.pop(), "a" );
    }

    @Test
    public void testTop()
    {
        MyStack<String> stack = new MyStack<String>();

        // test that an exception is thrown
        boolean exceptionThrown = false;
        try
        {
            stack.top();
        }
        catch( NoSuchElementException e )
        {
            exceptionThrown = true;
        }
        assertEquals( exceptionThrown, true );

        // test top elements
        stack.push( "a" );
        stack.push( "b" );
        stack.push( "c" );
        assertEquals( stack.top(), "c" );
        assertEquals( stack.top(), "c" );
    }

    @Test
    public void testSize()
    {
        MyStack<String> stack = new MyStack<String>();

        assertEquals( stack.size(), 0 );
        stack.push( "a" );
        stack.push( "b" );
        stack.push( "c" );
        assertEquals( stack.size(), 3 );
    }
    
    @Test
    public void testIsEmpty()
    {
        MyStack<String> stack = new MyStack<String>();

        assertEquals( stack.isEmpty(), true );
        stack.push( "a" );
        assertEquals( stack.isEmpty(), false );
    }
    
    @Test
    public void testClear()
    {
        MyStack<String> stack = new MyStack<String>();

        stack.push( "a" );
        stack.push( "b" );
        stack.push( "c" );
        stack.clear();
        assertEquals( stack.isEmpty(), true );
    }
}

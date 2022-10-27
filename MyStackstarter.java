import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * Implementation of a stack
 *
 * @author
 * @version 1
 */
public class MyStack<T> implements StackADT<T>
{
    private ArrayList<T> stack;


    /**
     * Constructor
     *
     */
    public MyStack()
    {
        this.stack = new ArrayList<T>();
    }


    /**
     * Add an item onto the stack
     * @param item the data item to add (of type T)
     */






    /**
     * Remove the top item from the stack
     * @return the top item in the stack
     * @throws NoSuchElementException if the stack is empty
     */
    public T pop() throws NoSuchElementException
    {

    }

    /**
     * Display the top item from the stack without removing it
     * @return the top item in the stack
     * @throws NoSuchElementException if the stack is empty
     */
    public T top() throws NoSuchElementException
    {

    }

    /**
     * Find how many items are in the stack
     * @return the number of items in the stack
     */





    /**
     * Determine if the stack is empty
     * @return true if the size is 0, false otherwise
     */





    /**
     * Clear out the data structure
     */
    public void clear()
    {
        this.stack.clear();
    }

    public String toString()
    {
        String str = "[";

        str += "]";

        return str;
    }
}

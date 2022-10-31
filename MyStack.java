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
    private T[] buffer;
    private int currentSize;

    /**
     * Constructor
     *
     */
    public MyStack()
    {
        this.stack = new ArrayList<T>();
        final int INITIAL_SIZE = 10;
        buffer = new T[INITIAL_SIZE];
        currentSize = 0;
    }


    /**
     * Add an item onto the stack
     * @param item the data item to add (of type T)
     */
    public void push(T item)
    {
        growBufferIfNecessary();
        currentSize++;
        buffer[currentSize-1] = item;
    }


    /**
    Grows the buffer if the current size equals the buffer's capacity.
    */
    private void growBufferIfNecessary()
    {
         if (currentSize == buffer.length)
           {
                T[] newBuffer = new T[2*buffer.length];
                for (int i = 0; i < buffer.length; i++)
                {
                    newBuffer[i] = buffer[(currentSize + i)%buffer.length];
                }
                buffer = newBuffer;
           }
    }



    /**
     * Remove the top item from the stack
     * @return the top item in the stack
     * @throws NoSuchElementException if the stack is empty
     */
    public T pop() throws NoSuchElementException
    {
         T temp = buffer[currentSize-1];
         buffer[currentSize-1] = null;
         currentSize--;
         shrinkBufferIfNecessary();
         return temp;
    }
    
    /**
     Shrinks the buffer if the current size is less than a
     quarter of the buffer's capacity.
    */
    private void shrinkBufferIfNecessary()
    {
         double ratio = currentSize / (double) buffer.length;
          if (ratio < 0.25 && currentSize > 0)
         {
                T[] newBuffer = new T[buffer.length/2];
                for (int i = 0; i < newBuffer.length; i++)
                {
                    newBuffer[i] = buffer[i];
                }
                buffer = newBuffer;
         }
    }
    
    
    /**
     * Display the top item from the stack without removing it
     * @return the top item in the stack
     * @throws NoSuchElementException if the stack is empty
     */
    public T top() throws NoSuchElementException
    {
        return buffer[currentSize-1];
    }

    /**
     * Find how many items are in the stack
     * @return the number of items in the stack
     */
    public int size()
    {
        return currentSize;
    }

    /**
     * Determine if the stack is empty
     * @return true if the size is 0, false otherwise
     */
    public boolean isEmpty()
    {
        return currentSize == 0;
    }

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

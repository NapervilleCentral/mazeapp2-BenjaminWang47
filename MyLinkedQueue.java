import java.util.NoSuchElementException;
import java.util.LinkedList;
/**
 * Implementation of a queue
 *
 * @author
 * @version 1
 */

public class MyLinkedQueue<T> implements QueueADT<T>
{
    private LinkedList<T> queue;
    protected Node head;
    protected Node tail;
    private int currentSize;
    
    /**
     * Add an item to the queue
     * @param item the data item to add (of type T)
     */
    public void enqueue(T newElement)
    {
        Node newNode = new Node();
        newNode.data = newElement;
        if(tail == null)
        {
            head = newNode;
            tail = newNode;
        }
        
        else
        {
            tail.next = newNode;
            tail = newNode;
        }
        
        currentSize++;
    }

    /**
     * Remove the front item from the queue
     * @return the front item in the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public T dequeue() throws NoSuchElementException
    {
        if(head == null)
        {
            return null;
        }
        Node temp = new Node();
        temp = head;
        head = head.next;
        currentSize--;
        return temp.data;
        
    }

    /**
     * Return the front item in the queue without removing it
     * @return the front item in the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public T front() throws NoSuchElementException
    {
        return head.data;
    }

    /**
     * Find how many items are in the queue
     * @return the number of items in the queue
     */
    public int size()
    {
        return currentSize;
    }

    /**
     * Determine if the queue is empty
     * @return true if the size is 0, false otherwise
     */
    public boolean isEmpty()
    {
        return head == null;
    }

    /**
     * Clear out the data structure
     */
    public void clear()
    {
        this.queue.clear();
    }
    
    protected class Node
    {
        public T data;
        public Node next;
    }

}    

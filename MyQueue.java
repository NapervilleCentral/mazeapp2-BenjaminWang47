import java.util.*;

/**
 * Write a description of class MyQueue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyQueue<T> implements QueueADT<T>
{
    // minimize the size of the node by only maintaining a link to the prev element
    //in the queue
    protected class Node
    {
        private T val;
        private Node prev;

        Node( T val, Node prev )
        {
            this.val = val;
            this.prev = prev;
        }
    };

    // maintain a reference to the head and tail of the queue to optimize both
    //  enqueue and dequeue operations
    private LinkedList<T> queue;
    protected Node head;
    protected Node tail;
    private int currentSize;

    public MyQueue()
    {
        this.head = null;
        this.tail = null;
    }

    /**
     * Add an item to the queue
     * @param item the data item to add (of type T)
     */
    public void enqueue(T newElement)
    {
        Node newNode = new Node(newElement, null);
        // link the new node into the queue\
        if (head == null) {
            head = newNode;
        }
        else {
            tail.prev = newNode;
        }        
        // update the tail of the queue
        tail = newNode;
        currentSize++;
    }

    /**
     * Remove the front item from the queue
     * @return the front item in the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public T dequeue() throws NoSuchElementException
    {
        // throw an exception if the queue is empty
        if(head == null) {
            throw new NoSuchElementException();
        }

        // update the head of the queue
        if (head.prev == null) {
            Node removed = head;
            head = null;
            tail = null;
            return removed.val;
        }

        Node removed = head;
        head = head.prev;

        // update the tail of the queue, if necessary
        if (head == null) {
            tail = null;
        }
        currentSize--;
        return removed.val;
    }

    /**
     * Return the front item in the queue without removing it
     * @return the front item in the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public T front() throws NoSuchElementException
    {
        if (head == null) {
            throw new NoSuchElementException();
        }
        return head.val;
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
        this.head = null;
        this.tail = null;
    }

    public String toString()
    {
        String str = "[";

        for( Node node = this.head; node != null; node = node.prev )
        {
            str += node.val + " ";
        }

        str += "]";

        return str;
    }

}

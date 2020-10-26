/**
 * @Auther Yaaqov Shkifati
 * @Since 10.26.2020
 * @version 1.0
 */
package vipclients;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.io.PrintStream;

/**
 * The Link class is a queue link list data structure.
 * @author yaaqovshkifati
 */
public class Link extends LinkedList {

  private LinkedList first;

    private LinkedList last;
    

    /**
     * The Link constructor initializes the data.
     */
    public List() {
        first = null;
        last = null;
    }
    
    /**
     * The isEmpty method returns if the queue is empty.
     * @return if empty.
     */
    public boolean isEmpty() {
        return first == null;
    }

  
      /**
     * The interLast method is to add the end of the queue.
     * @param obj csv Filename.
     * @throws IOException
     */
    public void insertLast(String obj) throws IOException {

        LinkedList node = new LinkedList(obj);

        if (isEmpty()) {
            first = node;
        } else {
            last.next = node;
        }

        last = node;
    }

     /**
     * The removeFirst method removes the fist item in the queue.
     * @return first data in the queue.
     */
    public String removeFirst() {

        String temp = first.data;

        if (first.next == null) {
            last = null;
        }
        first = first.next;

        return temp;

    }
  
   /**
     * Retrieves, but does not remove, the head of this queue.
     *
     * @return returns null if this queue is empty.
     */
    public String peek(){
        if (isEmpty()) {
            throw new NoSuchElementException("Queue underflow");
        }
        return first.data;
    }
    
     /**
     * The displyList method prints the data to a text file.
     * @throws Exception
     */
    public void displayList() throws Exception {
        
        PrintStream output= new PrintStream("VipList.Txt");
        
        output.println("Song Track Titles:");
        output.println("-------------------------------------------------");

        LinkedList current = first;

        while (current != null) {

            output.println(current.displayLink());

            current = current.next;

        }
    }

}

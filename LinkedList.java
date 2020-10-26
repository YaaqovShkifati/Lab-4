/**
@author Yaaqov Shkifati
@since 10.26.2020
@verison 1.0
*/
package vipclients;

import java.io.IOException;

/**
 * The LinkList class.
 */
public class LinkedList {

    String data;
    LinkedList next;
   
    /**
     * No argument constructor.
     */
    public LinkedList(){
        
    }
    
    /**
     * The LinkedList constructor initializes the data and next pointer.
     * @param object a String.
     * @throws IOException  
     */
    public LinkedList(String object) throws IOException {
        next = null;
        data = object;
    }
    
    /**
     * The displayLink method returns the data.
     * @return data.
     */
    public String displayLink() {
        return data;
    }   

}

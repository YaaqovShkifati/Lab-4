/**
@author Yaaqov Shkifati
@since 10.26.2020
@verison 1.0
*/
package vipclients;

import java.io.IOException;

public class LinkedList {

    String data;
    LinkedList next;
   
    
    public LinkedList(){
        
    }
    

    public LinkedList(String object) throws IOException {
        next = null;
        data = object;
    }
    

    public String displayLink() {
        return data;
    }   

}

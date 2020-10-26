/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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

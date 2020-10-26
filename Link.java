/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vipclients;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.io.PrintStream;

/**
 *
 * @author yaaqovshkifati
 */
public class Link extends LinkedList {

  private LinkedList first;

    private LinkedList last;
    
    private String[] dat= new String[202];


    public void List() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertLast(String obj) throws IOException {

        LinkedList node = new LinkedList(obj);

        if (isEmpty()) {
            first = node;
        } else {
            last.next = node;
        }

        last = node;
    }

    public String removeFirst() {

        String temp = first.data;

        if (first.next == null) {
            last = null;
        }
        first = first.next;

        return temp;

    }
    public String peek(){
        if (isEmpty()) {
            throw new NoSuchElementException("Queue underflow");
        }
        return first.data;
    }
    

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

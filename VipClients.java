/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vipclients;

import java.util.*;
import java.io.*;
import java.util.ArrayList;

/**
 * The vipClient class reads multiple files at time, and stores the sorted list
 * into an queue of an arrayList. Then we merge all the queues in the array list. 
 */
public class VipClients  {

    private String[] fiscal;
    private ArrayList<LinkQueue> weekFile;  
    private LinkQueue quarterQueue;
   
    
      /**
      * The VipClients constructor initializes the link Queue.
      * @throws IOException 
      */
    public VipClients() throws IOException {

        fiscal = new String[]{"week1.csv", "week2.csv", "week3.csv", "week4.csv", "week5.csv", "week6.csv",
            "week7.csv", "week8.csv", "week9.csv", "week10.csv", "week11.csv", "week12.csv"};

        weekFile = new ArrayList<LinkQueue>();
           

        for (int i = 0; i < fiscal.length; i++) {
            LinkQueue data = new LinkQueue(fiscal[i]);
            weekFile.add(data);
        }     
     
    }
    
     /**
     * The LinkQueue class extends the link class, which is also an extention of 
     * the Linked list class. 
     */
    public static class LinkQueue extends Link {
        /**
         *  No argument constructor.
         */
        public LinkQueue(){ }

         /**
         * The the LinkQueue constructor reads a one csv file at a time a stores
         * it into a linked queue.
         * @param filename Weekly song tracks.
         * @throws IOException 
         */
        public LinkQueue(String filename) throws IOException {

            Scanner input = new Scanner(new File(filename), "UTF-8");

            try {
                while (input.hasNextLine()) {

                    String data = input.nextLine();

                    super.insertLast(data);

                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
     /**
     * The merge method mergers all the queues into one queue.
     * @return the quarterQueue.
     * @throws IOException 
     */
    public LinkQueue merge()throws IOException {
       
        quarterQueue= new LinkQueue();
       
       for(int i =0; i < weekFile.size(); i++){
          
            while(!weekFile.get(i).isEmpty()&&!weekFile.get(i+1).isEmpty()){
                
                String left= weekFile.get(i).peek();
                String right= weekFile.get(i+1).peek();
              
                if(left.compareToIgnoreCase(right)< 0){
                    quarterQueue.insertLast(weekFile.get(i).removeFirst());
                }
                else{
                    quarterQueue.insertLast(weekFile.get(i+1).removeFirst());
                }
                while(!weekFile.get(i).isEmpty()){
                    quarterQueue.insertLast(weekFile.get(i).removeFirst());
                }
                while(!weekFile.get(i+1).isEmpty()){
                    quarterQueue.insertLast(weekFile.get(i+1).removeFirst());
                }
           }
        }
        return quarterQueue;
    }
    
    /**
     * Prints the sorted queue.
     * @throws Exception 
     */
    public void print()throws Exception{
              merge().displayList();
    }
      

    public static void main(String[] args) throws Exception {

    VipClients bob=new VipClients();
//   
    bob.print();

    
   

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program4IBag;

import java.util.Scanner;

/**
 *
 * @author Ratna
 */
public class Program4IBag {
    private IBag<String> bag;
    
    public static void run(){
        
     Scanner s = new Scanner(System.in);
     
     //Ask user to select the bag of their choice and
     //get the input from the user
     System.out.print("Which type of bag do you want? sorted/unsorted: ");
     String choice = s.next();
     
     if(choice.equals("sorted")){
        SortedBag<String> bag = new SortedBag<>();
        
        //Number of items user want in the bag
        System.out.print("\nHow many items to put in the bag? ");
        int n = s.nextInt();
        for(int i=0; i<n; i++){
            System.out.print("Enter item "+ (i+1) +": ");
            //Get the next item to be inserted
            bag.add(s.next());
        }
        
       //Allow the user to see if the item is present in the bag
       System.out.print("\nYou can check if something is in the bag.");
       System.out.print("\nCheck for (type done to stop): ");
       String input = s.next();
       while(!input.equals("done")){
           //Check to see if the item is present in the bag and
           //print yes if present or else say no
           if(bag.contains(input)){
               System.out.print("Yes, it's in the bag.");
           }else{
               System.out.print("No, it's not in the bag.");
           }
        //continue till the user types done.
        System.out.print("\nCheck for (type done to stop): ");
        input = s.next();
       }
       
       //Remove items from the bag
       System.out.println("\nLet's remove stuff from the bag:");
       for(int i = 0; i<n; i++){
           System.out.println("Removing item: "+ bag.remove());
       }
     }else //Perform the same functions for unsorted bag
     {
        UnsortedBag<String> bag = new UnsortedBag<>();
        
        //Number of items user want in the bag
        System.out.print("\nHow many items to put in the bag? ");
        int n = s.nextInt();
        for(int i=0; i<n; i++){
            System.out.print("Enter item "+ (i+1) +": ");
            //Get the next item to be inserted
            bag.add(s.next());
        }
        
       //Allow the user to see if the item is present in the bag
       System.out.print("\nYou can check if something is in the bag.");
       System.out.print("\nCheck for (type done to stop): ");
       String input = s.next();
       while(!input.equals("done")){
           //Check to see if the item is present in the bag and
           //print yes if present or else say no
           if(bag.contains(input)){
               System.out.print("Yes, it's in the bag.");
           }else{
               System.out.print("No, it's not in the bag.");
           }
        //continue till the user types done.
        System.out.print("\nCheck for (type done to stop): ");
        input = s.next();
       }
       
       //Remove items from the bag
       System.out.println("\nLet's remove stuff from the bag:");
       for(int i = 0; i<n; i++){
           System.out.println("Removing item: "+ bag.remove());
       }
     }
    
    }
    
    public static void main (String[] args){
        run(); 
    }
    
}

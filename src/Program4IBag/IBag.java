/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program4IBag;

/**
 *
 * @author Ratna
 */
public interface IBag<E> {
    
   /** Add items to the bag
     * @param item */
    
    public void add(E item);
    
    /** Remove items from the bag 
     * @return 
     */
    
    public E remove();
    
    /**Check if the bag contains the item 
     * @param item
     * @return true if item is present
     */
    
    public boolean contains(E item);
    
    /**Check if the bag is empty or not
     * @return true if the bag is empty
     */
    
    public boolean empty();
}

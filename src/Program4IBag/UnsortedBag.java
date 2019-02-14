/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program4IBag;

import java.util.ArrayList;

/**
 *
 * @author Ratna
 */
public class UnsortedBag<E> implements IBag<E>{
    
    private ArrayList<E> data = new ArrayList<>();

     //Add item to Ibag
    @Override
    public void add(E item) {
      data.add(item);
    }
    
    //Remove item from IBag
    @Override
    public E remove() {
        E product = data.get(0);
        data.remove(product);
        return product;
    }
    
    //Check to see if the items is present in IBag
    @Override
    public boolean contains(E item) {
        if((data.contains(item))){
            return true;
        }else
            return false; 
    }
    
    //Check to see if IBag is empty
    @Override
    public boolean empty() {
        return data.isEmpty();
    }
    
}

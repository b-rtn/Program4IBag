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
public class SortedBag<E> implements IBag<E> {
   private ArrayList<E> data = new ArrayList<>(); 

    @Override
    public void add(E item) {
       if(empty()) {
           data.add(item);
       }
       else if(contains(item)) {
           return;
       }
       else {
           data.add(item);
           for (int i = 0; i < data.size(); i++) {
                   for (int j = 0; j < data.size() - i - 1; j++) {
                       if (((String)data.get(j)).compareTo((String)data.get(j + 1))>0) {
                          E value = data.get(j);
                          data.set(j, data.get(j + 1));
                          data.set(j + 1, value);
                       }
                   }
               }
       } 
          }

    @Override
    public E remove() {
         E product = data.get(0);
        data.remove(product);
        return product;
    }

    @Override
    public boolean contains(E item) {
        if((data.contains(item))){
            return true;
        }else
            return false; 
    }

    @Override
    public boolean empty() {
       return data.isEmpty();
    }
}

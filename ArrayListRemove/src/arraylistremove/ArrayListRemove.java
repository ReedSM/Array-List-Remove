/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistremove;

import java.util.ArrayList;

public class ArrayListRemove {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<String> nameList = new ArrayList<String>();  //nameList nl kb keyboard  get the similarities can do other things besides string
        
        nameList.add("James");
        nameList.add("Bob");
        nameList.add("Bill");
        
        for(int index = 0; index < nameList.size(); index++ ){
            
            System.out.println("Index: " + index + " Name: " + nameList.get(index)); // get method
            
        }
        nameList.remove(1);  // expect to remove bob
        System.out.println("The item at index 1 is removed. " + "here are the items now.");
        for(int index = 0; index < nameList.size(); index++){
            System.out.println("Index: " + index + " Name: " + nameList.get(index));  //as items is removed it deductes the index
        }
        
    }
    
}

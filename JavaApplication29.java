/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication29;

import java.util.ArrayList;

/**
 *
 * @author Andorid Developer
 */
public class JavaApplication29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> list=new ArrayList<>();
       list.add("umar");
       list.add("usman");
       list.add("ali");
        System.out.println(list);
        list.add(1, "awais");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
     list.contains(list);
        System.out.println(list);
       list.clear();
        System.out.println(list);
       
      
        
        
        
        
       
    }
    
}

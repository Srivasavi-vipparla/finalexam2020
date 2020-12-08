/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author Sri Vasavi Vipparla
 */
public class SearchElementDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> a1=new ArrayList<>();
        a1.add(10);
        a1.add(11);
        a1.add(15);
        a1.add(31);
        a1.add(2);
        a1.add(7);  
        try{
        System.out.println("Enter elemnt to search :");
        Scanner sc=new Scanner(System.in);
        int e=sc.nextInt();
        SearchElement se=new SearchElement(a1);       
        System.out.println("Element: "+e+" Found at index:"+se.search(e));
        }
       catch(NoSuchElementException ex){
               System.out.println(ex);
               }
    }
    
}

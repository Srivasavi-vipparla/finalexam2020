/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author S540791
 */
public class ThrowsDriver2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InputMismatchException{
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        try{
        System.out.println("Enter a integer value");
        int n=s.nextInt();
        System.out.println("Enter a boolean value:");
        boolean d=s.nextBoolean();
        }
        catch(InputMismatchException ie){
            System.out.println(ie);
        }
        
    }
    
}

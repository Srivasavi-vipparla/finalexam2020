/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author S540791
 */
public class Exception3Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value:");
        int n = sc.nextInt();
        if (n < 0) {
            try {
                throw new NegativeException("n value is less than 0");
            } catch (NegativeException ex) {
                System.out.println(ex);
            }
        } else {
            System.out.println("Square is :" + (n * n));
        }

    }

}

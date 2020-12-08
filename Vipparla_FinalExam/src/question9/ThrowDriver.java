/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author S540791
 */
public class ThrowDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x value:");
        double x = sc.nextInt();
        System.out.print("Enter y value");
        double y = sc.nextInt();
        if (y == 0) {
            try {
                throw new ArithmeticException("y value is not equal to 0");
            } catch (ArithmeticException ex) {
                System.out.println(ex);
            }
        } else {
            System.out.println("Division is :" + (x / y));
        }

    }

}

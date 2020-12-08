/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6.unChecked;

import question6.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author S540791
 */
public class UnCheckedException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc;
        try {
            sc = new Scanner(new File("myfile.txt"));
            int a = sc.nextInt();
            while (true) {

                System.out.println(a);
                a = sc.nextInt();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found Exception");
        
        } catch (java.util.NoSuchElementException ex) {
            System.out.println("No element found to read");
        }

    }

}

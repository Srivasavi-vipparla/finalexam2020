/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author S540791
 */
public class CheckedException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Checked Exception class:");
        Scanner sc;
        try {
            sc = new Scanner(new File("myfile.txt"));
            while (sc.hasNext()) {
                int a = sc.nextInt();
                System.out.println(a);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found Exception");
        }

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author S540791
 */
public class CheckedException2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc;
        
            sc = new Scanner(new File("myfile.txt"));
            while (sc.hasNext()) {
                int a = sc.nextInt();
                System.out.println(a);
            }
        } 

    }


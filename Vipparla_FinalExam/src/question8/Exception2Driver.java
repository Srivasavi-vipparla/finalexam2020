/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author S540791
 */
public class Exception2Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, NotValidException {
        // TODO code application logic here
        ArrayList<Integer> al = new ArrayList<>();
        Scanner sc = new Scanner(new File("myfile.txt"));
        Scanner s = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            al.add(a);
        }
        Exception2 ex = new Exception2();
        int b=0,c=0;
        try {
        System.out.println("Enter b value :");
         b = s.nextInt();
        System.out.println("Enter c value:");
         c = s.nextInt();     
        
            ex.multipleException(al, b, c);
        } catch (ArithmeticException | IndexOutOfBoundsException | NotValidException ex1) {
            System.out.println(ex1);
        }
        try {

            System.out.println("Do you want to add element to the list and\n and invoke"
                    + "multipleExceptions() method");
            boolean d = s.nextBoolean();
            if (d == true) {
                al.add(24);
                ex.multipleException(al, b, c);
            }
            System.out.println("Done !!");
        } catch (Exception ex2) {
            System.out.println(ex2);
        }

    }

}

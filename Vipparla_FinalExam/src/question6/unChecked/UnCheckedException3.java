/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6.unChecked;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author S540791
 */
public class UnCheckedException3 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        Scanner sc = new Scanner(new File("myfile.txt"));
        ArrayList<Integer> a1 = new ArrayList<>();
        while (sc.hasNext()) {
            int a = sc.nextInt();
            a1.add(a);
        }
        try {
            System.out.print("Enter the Index to print the value:");
            int n = s.nextInt();
            System.out.println("Value is :" + a1.get(n));
        } catch (java.lang.Exception ex) {
            System.out.println(ex);
        }

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

import java.util.Scanner;

/**
 *
 * @author S540791
 */
public class RandomArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int randomArr[] = new int[100];
        for (int i = 0; i < randomArr.length; i++) {
            randomArr[i] = (int) (Math.random() * 100);
        }
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the Index to display value:");
            int index = sc.nextInt();
            System.out.println("value is :"+randomArr[index]);
        } catch (ArrayIndexOutOfBoundsException exp) {
            System.out.println("Out of Bounds");

        }
    }

}

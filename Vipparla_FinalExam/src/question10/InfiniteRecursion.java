/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

import java.util.Scanner;

/**
 *
 * @author Sri Vasavi Vipparla
 */
public class InfiniteRecursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Enter n :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        try{
        System.out.println(infiniteRec(n));
        }
        catch(java.lang.StackOverflowError ex){
            System.out.println("infinite recursion"+ex);
        }
    }

    private static String infiniteRec(int n) {
        if (true) {
            return "infinite recursion" + "\n" + infiniteRec(n + 1);
        } else {
            return "";
        }

    }

}

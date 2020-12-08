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
public class DirectSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n value:");
        int n=sc.nextInt();   
        System.out.println("Sum of "+n+" digits from 1 to "+ n +" is:"+Sum(n));
    }
    private static int Sum(int n){
        if(n>1)
            return n+ Sum(n-1);
        else
            return 1;
    }
    
}

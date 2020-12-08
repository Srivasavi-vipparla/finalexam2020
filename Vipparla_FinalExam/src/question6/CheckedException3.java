/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

/**
 *
 * @author S540791
 */
public class CheckedException3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        try {
            Thread.sleep(578);
        } catch (InterruptedException ie) {
            System.out.println(ie);
        }
        System.out.println("thread slept");
    }

}

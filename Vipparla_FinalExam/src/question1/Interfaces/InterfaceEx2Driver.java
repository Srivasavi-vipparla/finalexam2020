/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1.Interfaces;

/**
 *
 * @author S540791
 */
public class InterfaceEx2Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        InterfaceEx2b ex=new InterfaceEx2b(2,6);
        System.out.println("Multiplication is :"+ex.Multiply());
        ex.display();
        ex.print();
    }
    
}

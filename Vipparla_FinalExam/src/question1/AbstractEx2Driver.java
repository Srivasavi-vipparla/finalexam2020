/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

/**
 *
 * @author S540791
 */
public class AbstractEx2Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AbstractEx2b ex = new AbstractEx2b();
        ex.getValue(8);
        AbstractEx2a ex1 = new AbstractEx2b();
        ex1.print();
        ex1.getValue(10);
    }
    
}

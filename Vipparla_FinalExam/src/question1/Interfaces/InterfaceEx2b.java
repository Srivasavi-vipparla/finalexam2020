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
public class InterfaceEx2b extends InterfaceEx2a implements InterfaceEx2 {

    public InterfaceEx2b(int x, int y) {
        super(x, y);
    }

    @Override
    public void print() {
        System.out.println("I am print() in InterfaceEx2b class");
        System.out.println("calling default print() in InterfaceEx2");
        super.print(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void display() {
        System.out.println("Value of X is :"+getX()+"Y is :"+getY());
    }
    
}

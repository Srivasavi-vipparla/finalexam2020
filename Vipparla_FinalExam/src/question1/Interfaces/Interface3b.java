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
public class Interface3b implements Interface3a,InterfaceEx3{

    @Override
    public void print() {
        System.out.println("I am print() declared in Interface3a and implementing in Interface3b");
    }

    @Override
    public void display() {
        System.out.println("I am display() declared in InterfaceEx3 and implementing in Interface3b");
    }
    
}

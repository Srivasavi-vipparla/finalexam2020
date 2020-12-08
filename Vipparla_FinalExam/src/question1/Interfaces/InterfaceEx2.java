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
public interface InterfaceEx2 {
    default void print(){
        System.out.println("Hello .. I am default method in InterfaceEx2 class");
    }
    public abstract void display();
}

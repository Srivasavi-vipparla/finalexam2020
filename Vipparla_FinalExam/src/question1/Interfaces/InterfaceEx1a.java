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
public class InterfaceEx1a implements InterfaceEx1 {

    private int x;

    public InterfaceEx1a(int x) {
        this.x = x;
    }

    @Override
    public int sum() {
        return Z + x;
    }

    @Override
    public int multiply() {
        return Z * x;
    }

    @Override
    public int subtract() {
        return Z - x;
    }

    public void displayResults() {
        System.out.println("Sum of :" + Z + ", " + x + " is :" + sum() + "\n"
                + "Multiplication of :" + Z + ", " + x + " is :" + multiply() + "\n"
                + "Subtraction of :" + Z + ", " + x + " is :" + subtract());
    }

}

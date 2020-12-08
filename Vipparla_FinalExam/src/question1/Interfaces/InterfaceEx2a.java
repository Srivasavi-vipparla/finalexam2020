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
public abstract class InterfaceEx2a implements InterfaceEx2 {

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    private int x, y;

    public InterfaceEx2a(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int Multiply() {
        return x * y;
    }    
}

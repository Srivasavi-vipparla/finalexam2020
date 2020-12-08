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
public abstract class AbstractEx1 {
    private int val;

    public AbstractEx1(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }
    public String valSquare(){
        return "Square Value of X is :"+(getVal()*getVal());
    }
    public abstract void display();
    
}

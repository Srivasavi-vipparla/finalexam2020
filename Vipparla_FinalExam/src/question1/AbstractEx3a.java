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
public class AbstractEx3a extends AbstractEx3 {

    private int z;

    public AbstractEx3a(int z) {
        this.z = z;
    }

    @Override
    public int sum() {
        return z + z;
    }

    @Override
    public int multiply() {
        return z * z;

    }

}

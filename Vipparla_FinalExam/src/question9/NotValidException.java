/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

/**
 *
 * @author S540791
 */
public class NotValidException extends Exception {

    /**
     * Creates a new instance of <code>NotValidException</code> without detail
     * message.
     */
    public NotValidException() {
    }

    /**
     * Constructs an instance of <code>NotValidException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NotValidException(String msg) {
        super(msg);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author S540791
 */
public class ComparableCircle extends Circle implements Comparable{

    public ComparableCircle(double r) {
        super(r);
    }
      @Override
    public int compareTo(Object arg0) {
       Circle c=(Circle) arg0;
       return Double.compare(getArea(),c.getArea());
   
}
}

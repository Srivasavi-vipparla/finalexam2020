/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author S540791
 */
public class ComparableCircleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Double> al = new ArrayList<>();
        ComparableCircle c1 = new ComparableCircle(7);
        ComparableCircle c2 = new ComparableCircle(8);
        ComparableCircle c3 = new ComparableCircle(10);
        ComparableCircle c4 = new ComparableCircle(6);
        ComparableCircle c5 = new ComparableCircle(5);
        al.add(c1.getArea());
        al.add(c2.getArea());
        al.add(c3.getArea());
        al.add(c4.getArea());
        al.add(c5.getArea());
        System.out.println("Before sorting the area:");
        for (Double al1 : al) {
            System.out.println(al1);
        }
        Collections.sort(al);
        System.out.println("After sorting the area:");
        for (Double al1 : al) {
            System.out.println(al1);
        }
        if (c1.compareTo(c2) < 0) {
            System.out.println("c2 is the larger instance");
        } else if (c1.compareTo(c2) > 0) {
            System.out.println("c1 is larger instance :");
        } else {
            System.out.println("Both are equal");
        }

    }

}

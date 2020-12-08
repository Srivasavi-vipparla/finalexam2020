/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author Sri Vasavi Vipparla
 */
public class PersonDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person h = new Person("Madhavi", "Vipparla", 35);
        System.out.println(h.getPersonDetails());
        Person e = new Engineer("CSE", "Software Developer", "Virtusa", "Sri vasavi", "Vipparla", 23);
        System.out.println(e.getPersonDetails());
        Teacher t = new Teacher("C", "SIUE", 12000, "Dr", "Lakshmi", "teja", 29);
        System.out.println(t.getPersonDetails());
        Person p1 = new Teacher("Database", "UHCL", 11000, "Dr", "Rahul", "Krishna", 31);
        System.out.println(p1.getPersonDetails());

    }

}

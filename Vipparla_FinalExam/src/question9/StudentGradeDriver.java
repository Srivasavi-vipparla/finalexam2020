/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

import java.util.Scanner;

/**
 *
 * @author S540791
 */
public class StudentGradeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student marks:");
        int n = sc.nextInt();
        try {
            StudentGrade sg = new StudentGrade(n);
            if (sg.getMarks() < 0 || sg.getMarks() > 100) {
                throw new NotValidException("Invalid Marks");
            }
            if (sg.getMarks() >= 90 && sg.getMarks() <= 100) {
                System.out.println("Result is :A Grade");
            } else if (sg.getMarks() < 90 && sg.getMarks() >= 80) {
                System.out.println("Result is :B Grade");
            } else if (sg.getMarks() < 80 && sg.getMarks() >= 70) {
                System.out.println("Result is :C Grade");
            } else {
                System.out.println("Result is :Fail");
            }

        } catch (NotValidException ex) {
            System.out.println(ex);
        }
    }
}

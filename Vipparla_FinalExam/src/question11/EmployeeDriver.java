/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Sri Vasavi Vipparla
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        Employee empobj1 = new Employee(83, "Sri", 2561.9);
        employeeList.add(empobj1);
        Employee empobj2 = new Employee(25, "Vasavi", 7438.8);
        employeeList.add(empobj2);
        Employee empobj3 = new Employee(61, "Lakshmi", 8325.6);
        employeeList.add(empobj3);
        Employee empobj4 = new Employee(74, "Teja", 6743.8);
        employeeList.add(empobj4);
        Employee empobj5 = new Employee(38, "Madhavi", 4389.4);
        employeeList.add(empobj5);
        Employee empobj6 = new Employee(99, "Srinu", 8764.8);
        employeeList.add(empobj6);
        System.out.println("Displaying original Employee List Elements(before sorting):");
        for (Employee employeeList1 : employeeList) {
            System.out.println(employeeList1);
        }
        Collections.sort(employeeList);
        System.out.println("Sorted the list by using empId(Natural Ordering):");
        for (Employee employeeList1 : employeeList) {
            System.out.println(employeeList1);
        }
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                if (e1.getEmpSalary() < e2.getEmpSalary()) {
                    return -1;
                }
                if (e1.getEmpSalary() > e1.getEmpSalary()) {
                    return 1;
                } else {
                    return 0;
                }
            }

        });
        System.out.println("Sorting the Employee details by Salary:");
        for (Employee employeeList1 : employeeList) {
            System.out.println(employeeList1);
        }

        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                if (e1.getEmpName().compareTo(e2.getEmpName()) == 0) {
                    return e1.getEmpName().compareTo(e2.getEmpName());
                } else {
                    return e1.getEmpName().compareTo(e2.getEmpName());
                }
            }
        });
        System.out.println("Sorting the Employee details by name:");
        for (Employee employeeList1 : employeeList) {
            System.out.println(employeeList1);
        }

    }

}

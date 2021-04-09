/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hrapp;

/**
 *
 * @author Deepak
 */
public class HRApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("HRAPP Starts");

        Employee emp1 = new Employee(1, "Deepak", 199.9);
        Employee emp2 = new Employee(2, "Manoj", 299.9);

        Department dep = new Department("Education");
        dep.addEmps(emp1);
        dep.addEmps(emp2);
        dep.addEmps(new Employee(3, "Sathwik", 5999.9));

        Employee[] emps = dep.getEmployees();

        for (Employee emp : emps) {
            System.out.println("Emp " + emp);
            //System.out.println("Emp " + emp2);
        }

        System.out.println("Total " + dep.getTotalSalary());
        System.out.println("Average Salary " + dep.getAverageSalary());
        
        System.out.println("Emp " + dep.getEmployeeByID(2));
    }

}

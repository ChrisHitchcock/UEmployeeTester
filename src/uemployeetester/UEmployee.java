/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uemployeetester;

/**
 * This class creates an Employee.
 * @author chhit5249
 */
public class UEmployee {
    private String name;
    private double salary;
    
    /**
     * This user constructs the employee object
     * @param n Employee name
     * @param s Employee salary
     */
    public UEmployee(String n, double s)
    {
        name = n;
        salary = s;
    }

    /**
     * This program returns the name.
     * @return name - Employee's name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * This program returns the salary.
     * @return salary - Employee's salary
     */
    public double getSalary()
    {
        return salary;
    }
    
    /**
     * This program creates a string for output.
     * @return output - Details in string format.
     */
    public String toString()
    {
        String output = "Employee Name: "+name+"\nEmployee Salary: $"+salary;
        return output;
    }
}


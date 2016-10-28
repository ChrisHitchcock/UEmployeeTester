/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uemployeetester;

/**
 *
 * @author chhit5249
 */
public class UEmployee {
    private String name;
    private double salary;
    
    public UEmployee(String n, double s)
    {
        name = n;
        salary = s;
    }
    
    public String viewName()
    {
        String output = "Employee Name: "+name;
        return output;
    }
    
    public String viewSal()
    {
        String output = "Employee Salary: $"+salary;
        return output;
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getSalary()
    {
        return salary;
    }
    
    public String viewDetails()
    {
        String output = "Employee Name: "+name+"\nEmployee Salary: $"+salary;
        return output;
    }
}


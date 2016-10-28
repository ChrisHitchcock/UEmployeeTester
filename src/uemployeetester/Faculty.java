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
public class Faculty extends UEmployee {
    private String department;
    
    public Faculty (String n, double s, String d)
    {
        super(n, s);
        department = d;
    }
    
    public String toString()
    {
        String output = "Employee Name: " + super.getName()
                + "\nEmployee Salary: $" + super.getSalary()
                + "\nEmployee Department: " + department;
        return output;
    }
    
}

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
public class Staff extends UEmployee {
    private String job;
    
    public Staff(String n, double s, String j)
    {
        super(n, s);
        job = j;
    }
    
    public String toString()
    {
        String output = "";
        return output;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uemployeetester;

/**
 * This program tests the UEmployee class and those that inherit it.
 * @author chhit5249
 */
public class UEmployeeTester {

    /**
     * Everything happens here.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UEmployee MrKaune = new UEmployee("Mr. Kaune", 10000);
        Faculty MrKaune2 = new Faculty("Mr. Kaune", 10000, "Computers");
        Staff MrKaune3 = new Staff("Mr. Kaune", 10000, "Computer Studies Teacher");
        System.out.println(MrKaune.toString()+"\n-----------------------------------");
        System.out.println(MrKaune2.toString()+"\n-----------------------------------");
        System.out.println(MrKaune3.toString()+"\n-----------------------------------");
    }
    
}

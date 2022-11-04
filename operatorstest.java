/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author veerc
 */
public class operatorstest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=5, b=8, c;
        //System.out.println(a++);
        //a++ means a = a + 1
        //increase the value after exucution
        
        //System.out.println(a);
        
        // System.out.println(++a);
        //increase the value before exucution
        
        c = a++ + b -a;
        //System.out.println(c);
        
        System.out.println("a++ +b - a is "+(a++ +b-a));
        System.out.println("++a +b - a is "+(++a +b-a));
        System.out.println("value of c is "+c);
        
        boolean d;
        
        d= a > b*a;
        System.out.println(d);
        
        
    }
    
}

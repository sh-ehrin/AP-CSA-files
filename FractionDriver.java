/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ShehrinHabib
 */
public class FractionDriver {
    public static void main(String [] args){
        Fraction f1 = new Fraction();
        System.out.println(f1);
        
        Fraction f2 = new Fraction(1,2);
        System.out.println(f2);
        
        Fraction f3 = new Fraction(5,0);
        System.out.println(f3);
        
        Fraction f4 = new Fraction(3,1);
        System.out.println(f4);
        
        Fraction f5 = new Fraction(0,3);
        System.out.println(f5);
        
        //cannot access in a different file because it has private access
        //System.out.println(f2.num);
        
        int n3 = f3.getNum();
        int d1 = f1.getDenom();
        
        System.out.println(n3 + " " + d1);
    }
}

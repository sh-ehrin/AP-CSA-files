/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LearningRecursion;

/**
 *
 * @author ShehrinHabib
 */
public class LearningRecursion {
    public static void main(String [] args){
        System.out.println(factRec(4));
    }
    
    public static int factRec(int n){
        if (n==0){
            return 1;
        }
        else 
            return n * factRec(n-1);
    }
}

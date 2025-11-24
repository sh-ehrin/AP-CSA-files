/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ShehrinHabib
 */
public class HabibLoops {
    public static void main(String [] args){
        System.out.println(mystery(1034));
        
        int r = 0; 
        int sum = 0;
        
        while (r<=100){
            if (r%2 == 1){
                sum +=r;
            }
            r++;
        }
        System.out.println(sum);
        
    }
    
    public static int mystery(int num){
        int x = num; 
        while (x>0){
            if (x/10 % 2 ==0){
                return x;
            }
            x=x/10;
        }
        return x;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ShehrinHabib
 */
public class learningSorts {
    public static void main(String [] args){
        
    }
    
    public static void selectionSort(int[]x){
        int minPos;
        int y = 0;
    }
    
    public static void insertionSort(int[] a){
        int i, j, current;
        
        for (i = 1; i < a.length; i++){
            current = a[i];
            j=i; //index of the beginning of the unsorted part
            
            while ((j>0)&&(a[j-1] > current)){//comparisons
                a[j] = a[j-1];
                j = j - 1;
            }
            a[j] = current; //insert that current #
            //end of outer loop
        }
    }
}

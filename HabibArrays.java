
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ShehrinHabib
 */
public class HabibArrays {
    public static void main(String [] args){
        int[] twothree = new int[0];

        System.out.println(double23(twothree));
        System.out.println(sameFirstLast(twothree));
        
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        
        LearningArray printArray = new LearningArray();
        
        printArray.printArrayInt(reverse3(a));
        
        int[] b = {0, 2, 8, 9};
        
        printArray.printArrayInt(swapEnds(b));
        
        printArray.printArrayInt(rotateLeft3(b));
        
        printArray.printArrayInt(makeMiddle(b));
        
    }
    
    public static boolean double23(int[] nums){
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 2){
                count2++;
            }
            else if (nums[i] == 3){
                count3++;
            }
        }
        if (count2 == 2){
            return true;
        }
        else if (count3 == 2){
            return true;
        }
        else return false;
    }
    
    public static boolean sameFirstLast(int[] nums){
        int count = 0;
        boolean end = false;
        for (int i = 0; i < nums.length; i++){
            count ++;
        }
        if (count > 1 && nums[0] == nums[nums.length-1]){
            end = true;
        }
        return end;
    }
    
    public static boolean commonEnd(int[] a, int[] b){
        if (a[0] == b[0] || a[a.length-1] == b[b.length-1]){
            return true;
        }
        else
            return false;
    }
    
    public static int[] biggerTwo(int[] a, int[] b){
        if (a[0] + a[1] >= b[0] + b[1]){
            return a;
        }
        else {
            return b;
        }
    }
    
    public static int[] reverse3(int[] nums){
        int[] reverse = new int[3];
        int j = 0;
        for (int i = 2; i >= 0; i--){
            reverse[j] = nums[i];
            j++;
        }
        return reverse;
    }
    
    public static int[] swapEnds(int[] nums){
        int[] swapped = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            swapped[i] = nums[i];
        }
        swapped[0] = nums[nums.length-1];
        swapped[swapped.length-1] = nums[0];
        
        return swapped;
    }
    
    public static int[] rotateLeft3(int[] nums){
        // 0 , 1, 2
        // 1, 2, 0
        
        int[] rotated = new int[nums.length];
        
        for (int i = 0; i < nums.length-1; i++){
            rotated[i] = nums[i+1];
        }
        rotated[nums.length-1] = nums[0];
        
        return rotated;
    }
    
    public static int[] makeMiddle(int[] nums){
        int[] two = new int[2];
        int first = nums[(nums.length-1)/2];
        int second = nums[((nums.length-1)/2)+1];
        
        two[0] = first;
        two[1] = second;
        
        return two;
    }
}

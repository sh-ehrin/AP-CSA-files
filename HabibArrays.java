
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
        
        int[] a = new int[4];
        a[0] = 0;
        a[1] = 2;
        a[2] = 4;
        a[3] = 4;
        
        LearningArray printArray = new LearningArray();
        
        printArray.printArrayInt(reverse3(a));
        
        int[] b = {0, 3, 5, 6, 7};
        
        printArray.printArrayInt(swapEnds(b));
        
        printArray.printArrayInt(rotateLeft3(b));
        
        printArray.printArrayInt(makeMiddle(b));
        
        System.out.println(countEvens(a));
        
	System.out.println(only14(a));

        System.out.println(unlucky13(a));
        
        System.out.println(either24(a));
        
        System.out.println(tripleUp(b));
        
        printArray.printArrayInt(shiftLeftNew(b));
        
        printArray.printArrayInt(shiftLeftModify(b));
        
        String [] words = {"hey", "bye", "hello", "BOO"};
        
        System.out.println(smallestLength(words));
        
        System.out.println(lastString(words));
        
        System.out.println(startsWith("he", words));
    }
    
    public static int startsWith(String str, String[] words){
        int count = 0;
        
        for (int i = 0; i < words.length; i++){
            if (words[i].substring(0, str.length()).equals(str)){
                count++;
            }
        }
        
        return count;
    }
    
    public static int smallestLength(String[] strs){
        int answer = strs[0].length();
        
        for (int i = 0; i < strs.length; i++){
            if (answer >= strs[i].length()){
                answer = strs[i].length();
            }
        }
        
        return answer;
    }
    
    public static String lastString(String[] words){
        String holder = "";
        
        for (int i = 0; i < words.length-1; i++){
            if (words[i].compareTo(words[i+1]) >= 0){
                holder = words[i];
                words[i] = words[i+1];
                words[i+1] = holder;
            }
        }
        
        return words[words.length-1];
    }
    
    public static int[] shiftLeftNew(int[] nums){
        int [] answer = new int[nums.length];
        int holder = 0;
        nums[0] = holder;
        
        for (int i = 0; i < nums.length-1; i++){
            answer[i] = nums[i+1];
        }
        answer[nums.length-1] = holder;
        
        return answer;
    }
    
    public static int[] shiftLeftModify(int[] nums){
        int holder = 0;
        nums[0] = holder;
        
        for (int i = 0; i < nums.length-1; i++){
            nums[i] = nums[i+1];
        }
        nums[nums.length-1] = holder;
        
        return nums;
    }
    
    public static boolean tripleUp(int[] nums){
        boolean result = false;
        for (int i = 0; i < nums.length-2; i++){
            if (nums[i+1] == nums[i] + 1 && nums[i+2] == nums[i] + 2){
                result = true;
                return true;
            }
        }
        return result;
    }
    
    public static boolean either24(int[] nums){
        boolean result2 = false;
        boolean result4 = false;
        
        for (int i = 0; i < nums.length-1; i++){
            if(nums[i] == 2 && nums[i+1] == 2){
                result2 = true;
            }
            if(nums[i] == 4 && nums[i+1] == 4){
                result4 = true;
            }
        }
        
        if (result2 && result4){
            return false;
        }
        else if (result2 || result4){
            return true;
        }
        else {
            return false;
        }
    }
    
    public static boolean only14(int [] nums){
        boolean result = true;
        
        for (int i =0; i < nums.length; i++){
            if (nums[i] != 1 && nums[i] != 4){
                result = false;
            }
        }
        return result;
    }
    
    public static boolean unlucky13(int[] nums){
        boolean result = false;
        
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 1){
                if (nums[i+1] == 3){
                    result = true;
                }
            }
        }
        return result;
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
    
    public static int countEvens(int[] nums){
        int counter = 0;
        for (int i =0; i < nums.length; i++){
            if (nums[i]%2 == 0){
                counter++;
            }
        }
        return counter;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap;

/**
 *
 * @author mirah
 */
public class HabibProj5 {
    public static void main(String [] args){
        String[] words = {"hola", "word", "night"};
        int[] nums = {1, 2, 3, 4, 5, 8, 9, 10, 2, 7};
        
        System.out.println(comesBefore(words, "xenomorph"));
        
        System.out.println(maxAdjDist(nums));
        printArrayInt(noAdjInc(nums));
        
        String[] strs = {"No", "this", "is", "better"};
        System.out.println(countStringsWithE(strs));
        
        printArray(noMoreEvilEsPLEASE(strs));
        
        double[] list = {5.0, 2.2, 3.8, 9.1, 6.3, 7.6, 8.9, 0.4, 4.5};
        
        printArrayDouble(randomlyRemoveElement(list));
        printArrayDouble(randomlyRemoveNElements(list, 5));
        
        String[] wordList = {"green", "eggs", "and", "ham"};
        System.out.println(totalLetters(wordList));
        System.out.println(basicGapWidth(wordList, 20));
        System.out.println(leftoverSpaces(wordList, 20));
        System.out.println(format(wordList, 20));
    }
    
        public static void printArrayDouble(double[] list){
        for (int i = 0; i < list.length; i++){
            if(i != list.length-1)
                System.out.print(list[i] + ", ");
            else
                System.out.println(list[i]);
        }
    }
    
    public static void printArrayInt(int[] list){
        for (int i = 0; i < list.length; i++){
            if(i != list.length-1)
                System.out.print(list[i] + ", ");
            else
                System.out.println(list[i]);
        }
    }
    public static void printArray(String[] list){ //METHOD OVERLOADING!! CHANGING PARAMETERS BUT SAME METHOD NAME!
        for (int i = 0; i < list.length; i++){
            if(i != list.length-1)
                System.out.print(list[i] + ", ");
            else
                System.out.println(list[i]);
        }
    }
    
    public static boolean comesBefore(String[] words, String str){
        for (int i = 0; i < words.length; i++){
            if (words[i].compareTo(str) > 0){
                return false;
            }
        }
        
        return true;
    }
    
    public static int[] noAdjInc(int[] nums){
        
        //check w ms.lee
        for (int i = 0; i < nums.length-2; i++){
            if(nums[i+1] == nums[i] + 1 && nums[i+2] == nums[i] + 2){
                for(int j = i; j < i+3; j++){
                    nums[j] = -99;
                }
            }
        }
        return nums;
    }
    
    public static int maxAdjDist(int[] nums){
        int[] dist = new int[nums.length-1];
        
        for (int i = 0; i < nums.length-1; i++){
            dist[i] = Math.abs(nums[i+1] - nums[i]);
        }
        
        int max = dist[0];
        for (int i = 0; i < dist.length; i++){
            if (dist[i] > max){
                max = dist[i];
            }
        }
        return max;
    }
    
    public static int countStringsWithE(String[] strs){
        int count = 0;
        
        for(int i = 0; i < strs.length; i++){
            if (strs[i].indexOf("E") > -1){
                count++;
            }
        }
        
        return count;
    }
    
    public static String[] noMoreEvilEsPLEASE(String[] strs){
        String[] GoodWords = new String[strs.length-countStringsWithE(strs)];
        
        for (int i = 0; i < strs.length; i++){
            if (strs[i].indexOf("E") == -1){
                GoodWords[i] = strs[i];
            }
        }
        return GoodWords;
    }
    
    public static double[] randomlyRemoveElement(double[] nums){
        //go over this with Ms.lee
        double[] result = new double[nums.length-1];
        
        int index = (int)(Math.random()*nums.length);
        
        for (int i = 0; i < index; i++){
            result[i] = nums[i];
        }
        for (int j = index; j < result.length; j++){
            result[j] = nums[j+1];
        }
        return result;
    }
    
    public static double[] randomlyRemoveNElements(double[] nums, int n){
        double[] temp = nums;
        for (int i = 0; i < n; i++){
            temp = randomlyRemoveElement(temp);
        }
        return temp;
    }
    
    public static int totalLetters(String[] wordList){
        int count = 0;
        
        for (int i = 0; i < wordList.length; i++){
            count += wordList[i].length();
        }
        
        return count;
    }
    
    public static int basicGapWidth(String[] wordList, int formattedLen){
        int spaces = formattedLen - totalLetters(wordList);
        
        int width = (spaces - (spaces%(wordList.length-1)))/(wordList.length-1);
        return width;
    }
    
    public static int leftoverSpaces(String[] wordList, int formattedLen){
        int leftover = (formattedLen - totalLetters(wordList) - basicGapWidth(wordList, formattedLen)*(wordList.length-1));
        return leftover;
    }
    
    public static String format(String[] wordList, int formattedLen){
        String formattedString = "";
        int leftover = leftoverSpaces(wordList, formattedLen);
        int basic = basicGapWidth(wordList, formattedLen);
        
        for (int i = 0; i < wordList.length; i++){
            formattedString += wordList[i];
            
            if (i < wordList.length - 1){
                for (int j = 0; j < basic; j++){
                    formattedString += " ";
                }
                if (leftover > 0){
                    formattedString += " ";
                    leftover--;
                }
            }
        }
        
        return formattedString;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ShehrinHabib
 */
public class MethodsWithLoops {
    public static void main(String [] args){
        MethodsWithLoops LoopMethod = new MethodsWithLoops();
        System.out.println(LoopMethod.catDog("catdogcatdogcatdogcatdogdog"));
        System.out.println(LoopMethod.countTriple("8333yyyyaaaa"));
        System.out.println(gHappy("xxggygguggxx"));
    }
    
    public boolean catDog(String str){
        int cat = 0;
        int dog = 0;
        boolean result = false;
        for (int i = 0; i < str.length()-2; i++){
            if (str.substring(i, i+3).equals("cat")){
                cat++;
            }
            if (str.substring(i, i+3).equals("dog")){
                dog++;
            }
        }
        if (cat == dog){
            result = true;
        }
        return result;    
    }
    
    public int countTriple(String str){
        int tripleCount = 0;
        String triple = "";
        for (int i = 0; i < str.length()-2; i++){
            char c = str.charAt(i);
            triple = "" + c + c + c;
            if (str.substring(i, i+3).equals(triple)){
                tripleCount++;
            }
        }
        return tripleCount;  
    }
    
    public static boolean gHappy(String str){
        boolean answer = false;
        for (int i = 0; i < str.length(); i++){
            String blank = "" + str.charAt(i);
            if (blank.equals("g")){
                if (i > 0 && str.charAt(i - 1) == 'g'){
                    answer = true;
                }
                else if (i < str.length() - 1 && str.charAt(i+1) == 'g'){
                    answer = true;
                }
                else if (!(i > 0 && str.charAt(i - 1) == 'g') && !(i < str.length() - 1 && str.charAt(i+1) == 'g')){
                    answer = false;
                }
            }
        }
        return answer;
    }
    
}

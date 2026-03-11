

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mirah
 */
public class MethodsWithLoops {
    public static void main(String [] args){
        MethodsWithLoops Loop = new MethodsWithLoops();
        System.out.println(gHappy("ggjkhfksjfhksadkgg"));
        System.out.println(repeatChar("bef"));
        System.out.println(removeSubstring("Goodbye", 2, 4));
        System.out.println(removeFirst("lollapalooza", "o"));
        System.out.println(removeAll("aaaaaaaaaabbbbbbbbb", "b"));
        System.out.println(getNthOccurrence(5, 'a', "abracadabra"));
        System.out.println(sameEnds("abXX"));
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
    
    public static boolean repeatChar(String str){
       int times = 0;
        //loop through each letter
        for (int i = 0; i < str.length(); i++){
            for (int j = 0; j < str.length(); j++){
                if (str.charAt(j) == str.charAt(i)){
                    times++;
                }
            }
        }
        if (times > str.length()){
            return true;
        }
        else
            return false;
    }
    
    public static String removeSubstring(String str, int a, int b){
        String begin = "";
        String end = "";
        
        begin = str.substring(0, a);
        end  = str.substring(b);
        
        return begin + end;
    }
    
    public static String removeFirst(String str1, String str2){
        String answer = "";
        if (str1.indexOf(str2) == -1){
            return str1;
        }
        else {
            int start = str1.indexOf(str2);
            answer = removeSubstring(str1, start, start + str2.length());
        }
        return answer;
    }
    
    public static String removeAll(String str1, String str2){
        String answer = str1; 
        for (int i = 0; i < str1.length() - str2.length(); i++){
            if (answer.indexOf(str2) == -1){
            return answer;
            }
            else if (answer.indexOf(str2) >= 0){
                answer = removeFirst(answer, str2);
            }
        }
        return answer;
    }
    
    public static int getNthOccurrence(int n, char find, String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == find){
                count++;
                if (count == n){
                    return i;
                }
            }
        }
        return -1;
    }
    
    public static String sameEnds(String str){
        int maxlength = str.length()/2;
        for (int i = maxlength; i > 0; i--){
            String begin = str.substring(0, i);
            String end = str.substring(str.length() - i);
            
            if (begin.equals(end)){
                return begin;
            }
        }
        return "No match";
    }
    
    public static char displayAorB(){
        int odds = (int)(Math.random()*4);
        if (odds == 0){
            return 'A';
        }
        else{
            return 'B';
        }
    }
    
    public static String removeRandomChar(String str){
        int index = (int)(Math.random()*str.length());
        return str.substring(0, index) + str.substring(index + 1);
    }
}
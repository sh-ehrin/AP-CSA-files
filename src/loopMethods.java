/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ShehrinHabib
 */
public class loopMethods {
    public static void main(String[] args) {
        loopMethods Method = new loopMethods();
        System.out.println(Method.stringTimes("Hi", 5));
        System.out.println(Method.frontTimes("Ay", 6));
        System.out.println(Method.repeatEnd("Hello", 2));
        System.out.println(Method.stringSplosion("Code"));
        System.out.println(Method.doubleChar("Hey"));
        System.out.println(Method.altPairs("Chocolate"));
        System.out.println(Method.stringBits("Greetings"));
        
    }

    public String stringTimes(String str, int n){
        String result = "";
        for (int i = 0; i < n; i++)
        {
            result+=str;
        }
        return result;
    }
    
    public String frontTimes(String str, int n)
    {
        String result = "";
        if (str.length() >= 3){
            String front = str.substring(0, 3);
            for (int i = 0; i < n; i++){
                result += front;
            }
        }
        else {
            for (int i = 0; i < n; i++){
                result += str;
            }
        }
        return result;
    }
    
    public String repeatEnd(String str, int n){
        //get last n chars
        //for loop
        String result = "";
        if (n >= str.length()){
            for (int i=0; i < n; i++)
            {
            result += str;
            }
        }
        else{
            String last = str.substring(str.length()-n);
            for (int i=0; i < n; i++)
            {
                result += last;
            }
        }
        return result;
    }
    
    public String stringSplosion(String str){
        int len = str.length();
        String result = "";
        int tracker = 1;
        
        for (int i = 0; i < len; i++){
            result += str.substring(0, tracker);
            tracker++;
        }
        return result;
    }
    
    public String doubleChar(String str){
        String result = "";
        
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            result += "" + c + c;
        }
        return result;
    }
    
    public String stringBits(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
                    if (i%2 == 0){
                        result += "" + c;
                    }
        }
        return result;
    }
    
    public String altPairs(String str){
        String result = "";
        
        for (int i = 0; i < str.length()-1; i+=4){
            result += str.substring(i, i+2);
        }
        return result;
    }
}

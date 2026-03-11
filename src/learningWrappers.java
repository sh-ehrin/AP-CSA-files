/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author mirah
 */
public class LearningWrappers {
    public static void main(String [] args){
        System.out.println(order("ram", "cat"));
        System.out.println(evilE("bean"));
    }
    
    public static int dateFashion(int you, int date){
        //my style 8+ OR datestyle 8+ = yes
        //if my style or datestyle 2- = no
        //else, result maybe
        if (you >= 8 || date >= 8){
            return 2;
        }
        else if (you <= 2 || date <= 2){
            return 0;
        }
        else {
            return 1;
        }
    }
    
    public static String order(String str1, String str2){
        if (str1.compareTo(str2) == 0){
            return str1 + str2;
        }
        else if(str1.compareTo(str2) > 0){
            return str2 + str1;
        }
        else{
            return str1 + str2;
        }
    }
    
    public static boolean squirrelPlay(int temp, boolean isSummer){
        if(temp >= 60 && temp <= 90){
            return true;
        }
        else if (isSummer && temp <= 100 && temp >= 60){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static boolean funnyHatParty(int funnyHats, boolean isWeekend){
        if(funnyHats >= 40 && funnyHats <= 60){
            return true;
        }
        else if (isWeekend && funnyHats >= 40){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static String evilE(String str){
        int loc = str.indexOf('E');
        String left = "";
        String right = "";
        if (loc == -1){
            return str;
        }
        if (loc > 0 && loc < str.length()){
            left = " " + str.substring(0, loc -1);
            right = str.substring(loc + 2) + " ";
        }
        else if (loc == 0){
            left = " ";
            right = str.substring(loc + 2);
        }
        else if (loc == str.length()){
            left = str.substring(0, loc -1);
            right = " ";
        }
        
        if (loc != 0 && str.charAt(loc - 1) == 'e'){
            return left + "eE" + right;
        }
        else if (loc != str.length() && str.charAt(loc + 1) == 'e'){
            return left + "Ee" + right;
        }
        else if (loc != 0 && loc != str.length() && (str.charAt(loc + 1) == 'E' || str.charAt(loc - 1) == 'E')){
            return left + "EE" + right;
        }
        else if(loc > -1){
            return left + " E " + right;
        }
        else{
            return str;
        }
    }
}

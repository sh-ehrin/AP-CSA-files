/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author mirah
 */
public class HabibProj2 {
    public static void main(String [] args){
        System.out.println(annoyingChar("alo", 'l'));
    }
    public static int minOrMax(int a, int b, int c, boolean max){
        int answer = 0;
        if (max == true){
            if(a >= b && a >= c){ //a is max
                answer = a;
            }
            else if (b >= a && b >= c){ //b is max
                answer = b;
            } 
            else if (c >= a && c >= b){ //c is max
                answer = c;
            }
        }
        else {
            if (a <= b && a <= c){ //a is min
                answer = a;
            }
            else if (b <= a && b <= c){ //b is min
                answer = b;
            } 
            else if (c <= a && c <= b){ //c is min
                answer = c;
            }
        }
        return answer;
    }
    
    public static double calcRawGrade(double projAvg, double testAvg){
        double projGrade = projAvg * 0.35; // average projects
        double testGrade = testAvg * 0.65; //average tests
        return projGrade + testGrade; //raw grade
    }
    
    public static int calcRCardGrade(double raw){
        //final grade int
        int RCardGrade = (int)raw;
        //grade cannot be > 100
        if (RCardGrade > 100){
            RCardGrade = 100;
        }
        //if grade is > 90, round to nearest whole #
        else if (raw > 90){
            int decimal = (int)(raw * 10) % 10; //find out decimal part
            if (decimal >=5){
                RCardGrade = (int) raw + 1; //round up
            }
            else {
                RCardGrade = (int)raw;
            } //round down}
        }
        //if grade is < 90, it must be a multiple of 5 (%) EXCEPT 88
        else if (RCardGrade < 90 && RCardGrade != 88 && RCardGrade >= 55){
            RCardGrade = (RCardGrade - (RCardGrade%5));
        }
        //no grade lower than 55
        else if (RCardGrade <= 55){
            RCardGrade = 55;
        }
        return RCardGrade;
    }
    
    public static int nextFloor(int current, int button1, int button2){
        //QUESTION: can we assume each floor is different?
        int firstLoc = current;
        int distance1 = current - button1;
        int distance2 = current - button2;
        //if going in same direction;
        if (distance1 > 0 && distance2 > 0 || distance1 < 0 && distance2 < 0){
            if (Math.abs(distance1) <= Math.abs(distance2)){
                firstLoc = button1;
            }
            else {
                firstLoc = button2;
            }
        }
        //top not true means opposite directions
        else {
            firstLoc = button1;
        }
        return firstLoc;
    }
    
    public static String annoyingChar(String str, char c){
        int Clocation = str.indexOf(c);
        //if char is not in the string, return og str
        if (Clocation == -1 || Clocation == str.length()-1){ // c doesn't exist OR it is the last letter
            return str;
        }
        else { // c DOES exist
            char neighbor = str.charAt(Clocation + 1);
            String begin = str.substring(0, Clocation+1);
            String end = str.substring(Clocation + 2);
            
            if (Character.isUpperCase(c) && Character.isLowerCase(neighbor)){ //c is Upper and neighbor is lower
                char neighbor2 = Character.toUpperCase(neighbor);
                return begin + neighbor2 + end;
            }
            else if (Character.isLowerCase(c) && Character.isUpperCase(neighbor)){ // c is lower and neighbor is upper
                char neighbor2 = Character.toLowerCase(neighbor);
                return begin + neighbor2 + end;
            }
            
            else if (Character.isUpperCase(c) && Character.isUpperCase(neighbor)){ //SAME UPPER CASE
                return str;
            }
            else return str; // SAME LOWER CASE
        }
    }

}

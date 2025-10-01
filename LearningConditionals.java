/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ShehrinHabib
 */
public class LearningConditionals {

    public static void main(String[] args) {
//        if (3 > 5) {
//            System.out.println("5 is bigger");
//            System.out.println("I'm hungry");
//        }
//        else System.out.println("I'm sleepy");
//        
//        int age = 5;
//        if(age >= 67)
//            System.out.println("You're a senior :D");
//        else if (age > 13)
//            System.out.println("You're a teenager");
//        else 
//            System.out.println("You're a babyy!");

        //Question 7
//        int grade = 100;
//        if (grade >= 90 ){
//            if (grade >=97){
//                System.out.println("You got an A+ WOWZA");
//            }
//            else if (grade >=94){
//                System.out.println("You got an A!!");
//            }
//            else System.out.println("You got an A-!!");
//        }
//        else if (grade >= 80){
//            System.out.println("You got a B.");
//        }
//        else if (grade >= 70){
//            System.out.println("You got a C.");
//        }
//        else if (grade >= 65){
//            System.out.println("You got a D.");}
//        else System.out.println("YOU FAILED!");        
//        
        //Question 8
        String s = "razor";
        char firstletter = s.charAt(0);
        char lastletter = s.charAt(s.length()-1);
        if (firstletter == lastletter){
            String cutstring = s.substring(1,s.length()-1);
            System.out.println(cutstring);
        }
        else System.out.println(s);
        }
    }


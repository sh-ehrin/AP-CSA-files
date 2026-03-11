/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author mirah
 */
import javax.swing.JOptionPane;

public class Cw2IfStatements {
    public static void main(String [] args){
        String word1 = JOptionPane.showInputDialog("enter a word");
        String word2 = JOptionPane.showInputDialog("enter a second word");
        char first = word1.charAt(0);
        char last = word2.charAt(word2.length()-1);
        
        if (word1.length() % 2 == 0 && word2.length() % 2 == 0)
        {
           String firsthalf = word1.substring(0, word1.length()/2);
           String secondhalf = word2.substring(word2.length()/2, word2.length());
            System.out.println(firsthalf + secondhalf);
        }
        else if (word1.length() % 2 == 1 && word2.length() % 2 == 1){
            System.out.println(word1+word2);
        }
        else {
            System.out.println(first + "" + last);
        }
//          String word3 = JOptionPane.showInputDialog("enter a word with \"a\" and \"b\"");
//          int locationOfB = word3.indexOf("b");
//          int locationOfA = word3.indexOf("a");
//          int check = Math.abs(locationOfA - locationOfB);
//          
//          if(check == 2 && locationOfA > locationOfB){
//              char middle = word3.charAt(locationOfA - 1);
//              System.out.println("" + middle + middle + middle);
//          }
//          else if (check == 2 && locationOfB > locationOfA){
//              char middle = word3.charAt(locationOfB - 1);
//              System.out.println("" + middle + middle + middle);
//          }
//          else System.out.println(word3);
//          
    }
}

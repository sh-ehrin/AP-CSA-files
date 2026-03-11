

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;

public class LearningConditionals {

    public static void main(String[] args) {
        int age;
        String input = JOptionPane.showInputDialog("Please enter your age");
        age = Integer.parseInt(input);
        System.out.println("Your age is " + age + " years old");
        if (age > 35) {
            System.out.println("You're old...");
        } else if (age > 12 && age < 20){
            System.out.println("You are a teenager...!");
        }
        else System.out.println("You're a babyyy");

    }
}

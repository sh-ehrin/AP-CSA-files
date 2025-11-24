/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ShehrinHabib
 */
public class LearningOperators {
    public static void main(String []args)
    {
        int a, b, c;
        a = 49;
        b = 31;
        c = 10;
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        int d, sub, mult, add;
        double div;
        sub = b-a;
        d = c*(sub);
        mult = c*b;
        div = (double)b/c;
        add = c+a;
        
        System.out.println(d);
        System.out.println(sub);
        System.out.println(mult);
        System.out.println(div);
        System.out.println(add);
        
        String color = "purple", food = "fried chicken sandwich";
        String newFood = (color + " " + food);
        String animal = "otter";
        System.out.println(animal + " eating a " + newFood);
        
        String newColor = "Rainbow";
        double six = 6.0;
        String dubbleColor = (newColor + " " + six);
        System.out.println(dubbleColor);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author mirah
 */
public class CastingPrimitives {

    public static void main(String[] args) {
        int x = 9;
        double y = 1.5;
        int z = 2;

        int a = x + z; //11
        int b = (int) y + x; //10
        int c = x / z; //4
        double e = x / y; // 6.0
        double f = (double) (x / z); //4.5
        double g = (double) x / z; //4.5
        double m = a + b + c + e + f + g;

        System.out.println(m);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

    }
}

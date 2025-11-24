/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ShehrinHabib
 */
public class HabibStringMethods {

    public static void main(String[] args) {

        // 1 BeginToEnd
        String word = "Hello";
        char letter = word.charAt(0);
        String rest = word.substring(1);

        System.out.println(rest + letter);

        //2 EndToBegin
        String comp = "Computer";
        int length = comp.length();
        char ltr = comp.charAt(length - 1);
        String camp = comp.substring(0, length - 1);
        String endtobegin = (ltr + camp);
        System.out.println(endtobegin);

        //3 SwitchBeginEnd
        String third = "classroom";
        int leng = third.length();
        char c1 = third.charAt(0);
        char c2 = third.charAt(leng-1);
        String switchbegin = third.substring( 1, leng-1);
        String end = c2 + switchbegin + c1;
        System.out.println(end);
        
        //4 ExtraEnds
        String fourth = "Hello";
        int num = fourth.length();
        String cut = fourth.substring(num-2);
        System.out.println(cut+cut+cut);
        
        //5 MiddleTwo
        String fifth = "classroom";
        int lengg = fifth.length();
        char a = fifth.charAt(lengg/2);
        char b = fifth.charAt(lengg/2 + 1);
        String middle = " " + a + b;
        System.out.println(middle);
        
        //6 Right2
        String sixth = "Hello";
        int len = sixth.length();
        String crop = sixth.substring(len-2);
        String first = sixth.substring(0, len-2);
        String last = crop + first;
        System.out.println(last);
    }

}

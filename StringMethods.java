/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ShehrinHabib
 */
public class StringMethods {
    public static void main(String[] args) {
        String tvShow = ("One Piece Live Action");
String movie = ("Spider-Man: Across the Spider-Verse");
int length;
int position;
char letter;
String tmp;
 
length = tvShow.length( );
 // length = 21
 System.out.println (length);
 
letter = tvShow.charAt(4); 
        System.out.println(letter);
// letter = P
 
letter = tvShow.charAt(8);
System.out.println(letter);
// letter = e
 
position = tvShow.indexOf("ece");
// position = 6
 System.out.println(position);
 
tmp = tvShow.substring(7);
// tmp = “ce Live Action”
System.out.println(tmp);

tmp = tvShow.substring(6, 10);
// tmp = ece L
 System.out.println(tmp);
 
length = movie.length( );
// length = 35
 System.out.println(length);
 
letter = movie.charAt(0);
// letter = S
 System.out.println(letter);
 
letter = movie.charAt(13);
// letter = c
 System.out.println(letter);
 
position = movie.indexOf("the");
// position = 19
 System.out.println(position);
 
tmp = movie.substring(10);
// tmp = “ Across the Spider-Verse”
 System.out.println(tmp);
 
tmp = movie.substring(8, 15);
// tmp = “n: Acro”
System.out.println(tmp);

    }
    
}

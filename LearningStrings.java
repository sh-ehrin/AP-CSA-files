/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ShehrinHabib
 */
public class LearningStrings {

    public static void main(String[] args) {
        //we will test the String methods on the given String variables below...
        String movie = "K-pop Demon Hunters";
        String str1 = "Hello";
        String str2 = "Please Help!!!";
    //-----------------------------------------
    /*
    1) public int length()
    returnType: returns a whole number (integer)
    methodName: length
    parameters: none (empty parenthesis)
    Explanation:
             */
    //Write code that calls the length() method
    int len1 = movie.length();
    System.out.println("The length of " + movie + " is " + len1);
    int len2 = str1.length();
    System.out.println("The length of " + str1 + " is " + len2);
    int len3 = str2.length();
    System.out.println("The length of " + str2 + " is " + len3);
    
    //-----------------------------------------
    /*
    2) public int indexOf(String anotherString)
    returnType: int
    methodName: indexOf
    parameters: String anotherString
    Explanation: this means "what is the index of _?" OR "Where is _?"
             */
    //Write code that calls the indexOf() method
    //-----------------------------------------
    int index1 = movie.indexOf("K");
    System.out.println("The index of K is " + index1);
    /*
    3) public char charAt (int index)
    returnType: char
    methodName: charAt
    parameters: int index
    Explanation:finds the character at the index of a String
             */
    //Write code that calls the charAt() method
    char c1 = movie.charAt(1);
    System.out.println("The character at position 1 of " + movie + " is " + c1);
    
    char c2 = movie.charAt(10);
    System.out.println("The character at position 10 of " + movie + " is " + c2);
    
    char c3 = movie.charAt(6);
    System.out.println("The character at position 6 of " + movie + " is " + c3);
    /*
    4) public String substring(int beginIndex)
    returnType: String
    methodName: substring
    parameters: int beginIndex
    Explanation: Creating a String from a certain portion of a String
             */
    //Write code that calls the substring(int) method
    String s1 = movie.substring(18);
    System.out.println("The substring starting index 18 in " + movie + " is " + s1);
    //-----------------------------------------
    /*
    5) public String substring(int beginIndex, int endIndex)
    returnType: String
    methodName: substring
    parameters: in beginIndex, int endIndex
    Explanation: substring starts from the beginIndex and ends right before endIndex
             */
    //Write code that calls the substring(int,int) method
    String s2 = movie.substring(6, 11);
    System.out.println("The substring starting at 6 and ending a character before 11 is " + s2);
    
    String s3 = movie.substring(12, 19);
    System.out.println("The substring starting at 12 and ending a character before 19 is " + s3);
    
    //Please Help!!!
    int index6 = str2.indexOf("H");
    int index7 = str2.indexOf("!");
    String s4 = str2.substring(index6, index7+1);
    System.out.println(s4);
    
    String s5 = str2.substring(str2.indexOf("P"), str2.indexOf("e")+1);
    System.out.println(s5);
    }
}

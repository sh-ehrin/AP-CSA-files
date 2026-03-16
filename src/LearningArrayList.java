import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ShehrinHabib
 */

public class LearningArrayList {
    public static void main(String[] args){
//1. Declare and instantiate an ArrayList named roster that can only hold references to String objects.
ArrayList<String> roster = new ArrayList<String>(); //empty box


//2. add the following names to the ArrayList in the following order Billy, Ilya, Sofia, and Xavier.
System.out.println(roster.add("Shehrin")); // add into list and boolean
roster.add("Mari");
roster.add("Blossom");
roster.add("Fatimah");
roster.add("Wanyun");
roster.add("Fiona");
roster.add("Alex");
roster.add("Ethan");
roster.add("Vincent Z");
roster.add("Jackson");
roster.add("Ms. Lee");

System.out.println(roster);


//3. add the name Danny into the correct position so the list is still in alphabetical order
roster.add(7, "Vincent E"); //all objects after the index shift to the right
System.out.println(roster);




//4. Change the name Danny to the name Diane.
String govName = roster.set(7, "YUNG VINCE"); //replacing with a new string, storing old string in govName (ex: old usernames counted in instagram: "username changed __# of times)
        System.out.println(roster);
        System.out.println(govName);



//5. Let’s say Ilya wants to drop the class, remove him from the list. 
//And add him to a new list of dropped students.
String temp = roster.remove(10); //removing the object by index
System.out.println(roster);

ArrayList<String> Jackson = new ArrayList<String>(); //new arraylist Jackson
//roster.add("Jackson"); //new str, duplicate Jackson with different reference address
Jackson.add(temp); //same reference as removed string
//STRINGS ARE IMMUTABLE, A NEW STRING (variable holding the string address) IS ALWAYS CREATED WHEN A STRING IS "MODIFIED"
System.out.println(Jackson);


//6. Let’s say Xavier drops off the face of the earth.  
//Remove him from the list and do not add him to the new list.
roster.remove("Ms. Lee");
System.out.println(roster);



//7. get the Last letter of the first student in roster.





//8. get the first letter of the last student in roster.






//9. Display the first 3 letters of all the names in roster.

    }
}

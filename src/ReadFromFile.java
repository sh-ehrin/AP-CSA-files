//three imports needed to read from file

import java.util.Scanner; //scans file
import java.io.File; //reads files
import java.io.FileNotFoundException; //crash exception if file does not exist
import java.io.IOException;

public class ReadFromFile { //data collections not needed for frq, they are only multiple choice

    public static void main(String[] args) throws FileNotFoundException //(ON AP EXAM!!!)
    {
        //try{
        Scanner file = new Scanner(new File("Input.txt")); //open a File object, open a scanner object constructed of a File object
        while(file.hasNext()){
            int num = file.nextInt();
            System.out.println(num);
        }
        displayDateInfo("03/25/2026");
//        int counter = file.nextInt();
//        System.out.println(counter);
//        file.nextLine();
//
//        for (int i = 0; i < counter; i++) {
//            //double num = file.nextDouble();
//            //System.out.println(num);
//            //System.out.printf("%.3f\n", num); //f for formatting
//
//            //            String word = file.next();
//            //            System.out.println(word);
//            String word = file.nextLine();
//            System.out.println(word);
//        }
//        //}
////        catch (FileNotFoundException e){ //'try and catch says to 'try out the code, if it does not find the file, u can make a custom error message (throws FileNotFoundException is a default message), useful for debugging.
////            System.out.println("did not find file");
////        }
////        catch(IOException e){ //can have multiple; useful for being specific with errors
////            System.out.println(" :( ");
////        }
    }
    
    public static void displayDateInfo(String date){
        //"03/25/2026"
        //delimitor is a seperation or a symbol to separate something
        String[] arr = date.split("/"); //create array based on the String
        System.out.println("The month is: " + arr[0] + "\nThe day is: " + arr[1] + "\nThe year is: "+ arr[2]);
    }
}

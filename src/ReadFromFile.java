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
        while (file.hasNext()) {
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

        String[] repeatingDataSmall = {
            "Jean:Grey:UID027:Tier1:2025-02-23:EU",
            "Emily:Suzuki:UID028:Tier2:2025-09-14:NA",
            "Thomas:Tanaka:UID088:Tier2:2025-10-27:EU",
            "Charles:Xavier:UID027:Tier2:2025-07-01:NA",
            "Gwen:Stacy:UID027:Tier3:2025-01-14:NA",
            "Chen:Muller:UID001:Tier2:2025-04-18:EU",
            "Erik:Magnus:UID004:Tier2:2025-03-24:AS",
            "Emily:Smith:UID007:Tier3:2025-10-11:NA",
            "Bruce:Wayne:UID027:Tier3:2025-06-03:EU",
            "Lex:Luther:UID004:Tier2:2025-06-18:NA",
            "Peter:Parker:UID027:Tier3:2025-10-25:EU"
        };

        LearningArray print = new LearningArray();

        print.printArray(getNamesWithNonUniqueIDs(repeatingDataSmall));

    }

    public static void displayDateInfo(String date) {
        //"03/25/2026"
        //delimitor is a seperation or a symbol to separate something
        String[] arr = date.split("/"); //create array based on the String
        System.out.println("The month is: " + arr[0] + "\nThe day is: " + arr[1] + "\nThe year is: " + arr[2]);
    }

    public static double findSmallest(String strNums) {

        String[] nums = strNums.split(", ");
        double[] dub = new double[nums.length];

        for (int i = 0; i < nums.length; i++) {
            dub[i] = Double.parseDouble(nums[i]);
        }

        double min = dub[0];

        for (int i = 0; i < dub.length; i++) {
            if (dub[i] < min) {
                min = dub[i];
            }
        }
        return min;
    }

    public static String[] getNamesWithNonUniqueIDs(String[] allUsers) {
        String curr = "";
        String[] arr = new String[allUsers.length];
        String names = "";

        for (int i = 0; i < allUsers.length; i++) {
            boolean found = false;
            curr = arr[i];
            String[] currInfo = curr.split(":");
            for (int j = i + 1; j < allUsers.length - 1; j++) {
                String next = arr[j];
                String[] nextInfo = next.split(":");
                if (curr == next) {
                    found = true;
                    names += currInfo[1] + currInfo[0] + ", " + nextInfo[1] + nextInfo[0] + ", ";
                }
            }
        }
        return names.split(", ");
    }
    
    public static int countLines(String filename){
        Scanner file = new Scanner(new File(filename));
        try{
            
        }
    }
}

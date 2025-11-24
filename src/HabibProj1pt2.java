package ap.csa.pkg25.pkg26;

/**
 * Title: Project 1 Part 2
 *
 * Description: Introduction to Writing Programs using the String methods 
 *
 * @author Shehrin H.
 */
public class HabibProj1pt2 {
    public static void main(String [] args){
        //PART 2
        String date = "December 1, 2023";
        String month, day, year;
        
        //determine and print the year
        int datelength = date.length();
        year = date.substring(datelength-4, datelength);
        System.out.println(year);
        
        //determine and print the day
        String MonthDay = date.substring(0, datelength-6);
        int space = MonthDay.indexOf(" ");
        day = MonthDay.substring(space+1, MonthDay.length());
        System.out.println(day);
        
        //determine and print month
        month = MonthDay.substring(0, space);
        System.out.println(month);
    }
}

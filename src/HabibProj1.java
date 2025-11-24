package ap.csa.pkg25.pkg26;
import javax.swing.JOptionPane;

/**
 * Title: Project 1 Part 1
 *
 * Description: Introduction to Writing Programs using the String methods 
 *
 * @author Shehrin H.
 */

public class HabibProj1 {
    public static void main(String [] args){
        //declaration statements
        String url;
        int positionOfColon;
        String protocol;
        String restOfURL;
        String domainName;
        String fileName;
        int positionOfSlash;
        int fileNameLength;
        char firstLetter;
        char lastLetter;
        
        //prompt the user for a URL
        url = JOptionPane.showInputDialog("Please enter a URL");
        System.out.println(url);
        
        //extract and print the protocol
        positionOfColon = url.indexOf(":");
        System.out.println(positionOfColon);
        protocol = url.substring(0, positionOfColon);
        System.out.println(protocol);
        
        //extract and print the domain name
        restOfURL = url.substring(positionOfColon + 7, url.length());
        System.out.println(restOfURL);
        positionOfSlash = restOfURL.indexOf("/");
        System.out.println(positionOfSlash);
        domainName = restOfURL.substring(0, positionOfSlash);
        System.out.println(domainName);
        
        //extract and print the filename
        fileName = restOfURL.substring(positionOfSlash+1, restOfURL.length());
        System.out.println(fileName);
        
        //determine and print the number of characters in the filename
        fileNameLength = fileName.length();
        System.out.println(fileNameLength);
        
        //determine and print the first and last character of the filename
        firstLetter = fileName.charAt(0);
        lastLetter = fileName.charAt(fileNameLength-1);
        System.out.println(firstLetter + "\n" + lastLetter);
        
    }
    
}

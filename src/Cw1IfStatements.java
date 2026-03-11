/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author mirah
 */
public class Cw1IfStatements {
    public static void  main(String [] args){
//        String s = "rear";
//        char firstletter = s.charAt(0);
//        char lastletter = s.charAt(s.length()-1);
//        
//        if (firstletter  == lastletter){
//        String cutstring = s.substring(1, s.length()-1);
//            System.out.println(cutstring);
//        }
//            else System.out.println(s);



//          String word = "cats";
//          int len = word.length();
//          if (len % 2 == 0){
//              String firsthalf = word.substring(0, len/2);
//              String secondhalf = word.substring(len/2, len);
//              System.out.println(firsthalf + " " + secondhalf);
//          }
//          else {
//              String firsthalf = word.substring(0, len/2);
//              String secondhalf = word.substring((len/2+1),len);
//              char mid = word.charAt((len/2));
//              System.out.println(firsthalf + " " + mid + " " + secondhalf);
//          }


int x = 5;
int y = 3;
int z = 4;

if(x > y)
{
	x = y + 3; //x=6
	if(z != 5)
	{
		z = 6 + x; //z=12
	}
	else
	{
		y = x - 5;
	}
}

System.out.println(x);
System.out.println(y);
System.out.println(z);

          }
    }


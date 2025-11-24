/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ShehrinHabib
 */
public class OperatorsPractice {
    public static void main(String[] args)
    {
        //4a)
//Code:		
int num1 = 3, num2 = 2;
double sum = num1 + num2;
System.out.println(sum);	//5	


//4b)
//Code:
int numA = 3;
double numB = 4.2;
int numC = (int) (numA + numB);
System.out.println(numC);  //7	error cast numB to an int


//4c)	
//Code:	
int num3 = 3, num4 = 0;
double sum2 = num4 + num3;		
System.out.println(sum2); //error, num4 was not assigned a value



//State the output of each code segment. If an error would occur, state the type of error and try to explain why.

//4d)	Code:	
String numM = "14";
String numN = "32";

int numO = 4;
int numP = 5;

double numQ = 3;
double numR = 2;

int totalA = numO - numP;
System.out.println(totalA); //-1

double totalB = numQ + numP*2;
System.out.println(totalB); //13

String totalC = numR + numP + numN;
System.out.println(totalC); //732


int totalD = (int) (numP + numR);
System.out.println(totalD); //7 error, cast numR to an int

String totalE = numQ + numO + numM;
System.out.println(totalE); //714

String totalF = numN + numO + numP;
System.out.println(totalF); //329

int totalG = numP/numO;
System.out.println(totalG); //1

double totalH = numP/numO;
System.out.println(totalH); //1.25

int i = -8;
int j = 3;

int k = i/j;
System.out.println(k); // -2

int m = 5 + i/j;
System.out.println(m); //2

    }
}

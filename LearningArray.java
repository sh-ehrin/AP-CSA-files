public class LearningArray {
    //WHEN A METHOD IS NON-STATIC, CALL IT ON A NEW OBJECT, WHEN IT IS STATIC CALL IT ON THE CLASS
    public static void main(String [] args){
        //declare an array to store the grades of an exam
        int[] grades = new int[8];
        //can write int grades[] = new int[10]

        //declare an array to store the names of students
        String[] names = new String[4];

        //instantiate the grades array so that it can hold 10 elements.
        


        //instantiate the array of student names so that it can hold 4 elements. 


        /*
        Notes :
        The general syntax to declare and instantiate an array is…

        WRITE CODE HERE


        If you happen to know all the elements, then you can declare and instantiate an array like this…

        WRITE CODE HERE    //This must be done in one line.  

        Feel free to copy and paste screenshots of my final drawings into this section. 
        */
        //declare and instantiate a String array and an int array using the second approach.
        String[] classes = {"AP Calc AB", "AP Computer Science A", "Government"};

        //assign 4 test scores to the grades array
        grades[0] = 76;
        grades[1] = 100;
        grades[2] = 98;
        grades[3] = 200;
        grades[4] = 200;
        grades[5] = 200;
        grades[6] = 200;
        //grades[10] DOES NOT WORK!

        //fill in the array with the student names
        names[0] = "shehrin";
        names[1] = "mari";
        names[2] = "Blossom";
        names[3] = "Ms. Lee";


        //print the element at index 3 from the grades array
        System.out.println(grades[3]);

        //Find the sum of the grades at 0 and 2 and print it.


        //Print the length of the grades array.
        System.out.println(grades.length); //GREEN TELLS YOU ITS FINAL, CONSTANT (CANNOT CHANGE IN VALUE)

        //Get the length of the third name in students



        //swap the name at index 1 with the name at index 2.
        String temp = names[0];
        names[0] = names[2];
        names[2] = temp; 
        //names[2] = names[0]; -> LOST ONE VALUE
        System.out.println(grades); //address where is it stored in HEAP memory
        
        printArray(names);
        
        int [] array = new int[5];
	array[0] = 0;
        array[1] = 1;
        array[2] = 2;
        array[3] = 3;
        array[4] = 4;
        printArrayInt(array);
        
        printArrayInt(grades);
        firstLast1(grades);
        printArrayInt(grades);
        System.out.println(arrSum(grades));
        System.out.println(findAverage(grades));
        System.out.println(findMax(grades));
        System.out.println(sequentialSearch(grades, 98));
    }
    
    public static void printArrayInt(int[] list){
        for (int i = 0; i < list.length; i++){
            if(i != list.length-1)
                System.out.print(list[i] + ", ");
            else
                System.out.println(list[i]);
        }
    }
    //WHEN A METHOD IS NON-STATIC, CALL IT ON A NEW OBJECT, WHEN IT IS STATIC CALL IT ON THE CLASS
    public static void printArray(String[] list){ //METHOD OVERLOADING!! CHANGING PARAMETERS BUT SAME METHOD NAME!
        for (int i = 0; i < list.length; i++){
            if(i != list.length-1)
                System.out.print(list[i] + ", ");
            else
                System.out.println(list[i]);
        }
    }
    
    public static void firstLast1(int[] arr){
        arr[0] = -1;
        arr[arr.length-1] = -1;
    }
    
    public static int arrSum(int[] arr){
        int sum = 0;
        
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    
    public static double findAverage(int[] g){
        double avg = 0.0;
        for (int i =0; i < g.length; i++){
            avg += g[i];
        }
        return avg/g.length;
    }
    
    public static int findMax(int[] g){
        int max = g[0];
        
        for (int i = 0; i < g.length; i++){
            if (g[i] > max){
                max = g[i];
            }
        }
        return max;
    }
    
    public static int sequentialSearch(int[] g, int find){
        for (int i=0; i < g.length; i++){
            if (find == g[i]){
                return i;
            }
        }
        return -1;
    }


}

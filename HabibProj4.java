public class HabibProj4 {
    public static void main(String [] args){
        System.out.println(iCJava("none here"));
        
    }
    
    public static boolean iCJava(String input){
        //find length
        int len = input.length();
        int counter = 0;
        //loop around length of variable
        for (int i = 0; i <= len-4; i++){
            if (input.substring(i, i+4).compareTo("java") == 0){ //see if substring.equals "java"
                counter++;
            }
        }
        if (counter % 2 == 0 && counter != 0){ //true if counter is even AND java exists in the string
            return true;
        }
        else return false;
        
    }
    
    public static boolean differentNeighbors(String input){
        return true;
    }
}


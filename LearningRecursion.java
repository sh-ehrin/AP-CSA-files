public class LearningRecursion {
    public static void main(String [] args){
        System.out.println(factLoop(8));
        System.out.println(reverse("abcde"));
    }
    
    public static int factLoop(int n){
        int prod = 1;
        for (int i = 1; i <= n; i ++){
            prod*= i;
        }
        
        return prod;
    }
    
    public static int factRec(int n){
        if (n==0){
            return 1;
        }
        else 
            return n * factRec(n-1);
    }
    
    public static String reverse(String str){
        if (str.length() == 1){
            return str;
        }
        else {
            return str.charAt(str.length()-1) + reverse(str.substring(0, str.length()-1));
        }
    }
}


public class ImplementingMethods {

    public static void main(String[] args) {
        System.out.println(loneTeen(13, 99));
        System.out.println(loneTeen(21, 19));
        System.out.println(loneTeen(13, 13) + "\n");

        System.out.println(makes10(9, 10));
        System.out.println(makes10(9, 9));
        System.out.println(makes10(1, 9) + "\n");

        System.out.println(in1020(12, 99));
        System.out.println(in1020(21, 12));
        System.out.println(in1020(8, 99) + "\n");

        System.out.println(missingChar("kitten", 1));
        System.out.println(missingChar("kitten", 0));
        System.out.println(missingChar("kitten", 4) + "\n");
        
        System.out.println(removeChar("KITTEN", 'K', true));
        System.out.println(removeChar("KITTEN", 'K', false));
        System.out.println(removeChar("KITTEN", 'T', true) + "\n");
        
        System.out.println(close10(8,13));
        System.out.println(close10(13,8));
        System.out.println(close10(13,7) + "\n");
        
        System.out.println(notString("candy"));
        System.out.println(notString("x"));
        System.out.println(notString("not bad") + "\n");
        
        String str = "not bad";
        System.out.println(str.compareTo("not "));

    }

    public static boolean in1020(int a, int b) {
        boolean output;
        if (a >= 10 && a <= 20) {
            output = true;
        } else if (b >= 10 && b <= 20) {
            output = true;
        } else {
            output = false;
        }
        return output;
    }

    public static boolean makes10(int a, int b) {
        boolean output;
        if (a == 10 || b == 10) {
            output = true;
        } else if (b + a == 10) {
            output = true;
        } else {
            output = false;
        }
        return output;
    }

    public static boolean loneTeen(int a, int b) {
        boolean output;
        if (a >= 13 && a <= 19) {
            output = true;
            if (b >= 13 && b <= 19) {
                output = false;
            } else {
                output = true;
            }
        } else if (b >= 13 && b <= 19) {
            output = true;
        } else {
            output = false;
        }
        return output;
    }

    public static String missingChar(String str, int n) {
        String cut1 = str.substring(0, n);
        String cut2 = str.substring(n + 1);
        return cut1 + cut2;
    }

    public static String removeChar(String str, char c, boolean remove) {
        String final0 = str;
        if (remove == true){
            final0 = missingChar("KITTEN", str.indexOf(c));
        }
        return final0;
    }
    
    public static int close10(int a, int b) {
        int distancea = Math.abs(a-10);
        int distanceb = Math.abs(b-10);
        int answer;
        if (distancea > distanceb){
            answer = b;
        }
        else if (distancea == distanceb){
            answer = 0;
        }
        else {
            answer = a;
        }
        return answer;
    }
    
//    public static int kindaSum(int num) {
//        
//    }
    
    public static String notString(String str){
        String ans = str;
        if (str.compareTo("not ") > 0){
            ans = "not " + str;
        }
        else if (str.indexOf("not ")==-1){
            ans = str;
        }
        return ans;
    }

}

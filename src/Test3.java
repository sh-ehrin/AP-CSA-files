/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author mirah
 */
public class Test3 {
    public static void main(String [] args){
        System.out.println(SurfaceArea(2,4));
        System.out.println(displayAorB());
        System.out.println(removeRandomChar("compsci"));
        
        
    }
    public static Double SurfaceArea(int radius, Integer height){
        Double answer; 
        
        answer = 2*Math.PI*Math.pow(radius, 2) + 2*Math.PI*radius*height;
        
        return answer;
                
    }
    
    public static String displayAorB(){
        int odds = (int)(Math.random()*4+1);
        String result = "";
        
        if (odds == 1){
            result = "A";
        }
        else if (odds > 1){
            result = "B";
        }
        return result;
    }
    
    public static String removeRandomChar(String str){
        int randomindex = (int)(Math.random()*str.length());
        String result = "";
        
        result = str.substring(0, randomindex) + str.substring(randomindex+1);
        
        return result;
    }
}

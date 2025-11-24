public class learningWrappers {

    public static void main(String[] args) {
        
        System.out.println(equivalent(0.5,0.5));
        //Write code that will declare and instantiate various Integer objects
        Integer i1 = new Integer(5);
        Integer i2 = new Integer(-123);
        Integer i4 = new Integer(5);
        Integer i3 = 82; //NO >:( Dont do this  
        
        //write code that will call the intValue() method on one or more of the Integer objects that you declared/instantiated above
        int prim1 = i1.intValue(); //non-static method
        int prim2 = i2.intValue();
        
        //write code that will call the equals() method on one or more of the Integer objects that you declared/instantiated above
        boolean b1 = i1.equals(i2);
        boolean b2 = i1.equals(i4);
        System.out.println(b2);
        
        String word = "Hello";
        boolean b3 = i1.equals(word); //will still compile because it's an object
        System.out.println(b3);
        
        //write code that will call the toString() method on one or more of the Integer objects that you declared/instantiated above
        String s1 = i1.toString();
        System.out.println(s1 + 5); //String 5, not int 5
        System.out.println(s1.length());
        
        String s2 = i2.toString();
        System.out.println(s2.length()); //-123
        
        //Write code that will declare and instantiate various Double objects
        Double d1 = new Double(2.0);
        Double d2 = new Double(3.14);
        Double d3 = 4.5; //NOOOO >:( DONT DO THIS
    }
    
    public static Integer sum(Integer num1, Integer num2){
        Integer answer = num1.intValue()+ num2.intValue();
        return answer;
    }
    
    public static Double equivalent(Double d1, Double d2){
        
        if (d1.equals(d2)){
            return new Double(d1.doubleValue() * d2.doubleValue());
        }
        else{
            return new Double(Math.abs(d1.doubleValue() - d2.doubleValue()));
        }
    }

}

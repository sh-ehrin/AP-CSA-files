public class Fraction {
    
    //Step 1: instance variables, define
    private int num; //encapsulation
    private int denom; // data hiding, restricting access from other files
    
    // Step 2: (constructors in general)
    //default constructor
    //defaults are: 0, null, false
    public Fraction(){ //green = fixed value
        num = 1;
        denom = 1;
    }
    
    //parameterized constructor
    public Fraction(int num, int denom){
//        if(denom <= 0){
//            this.num = 1;
//            this.denom = 1;  //is there another way to do this?
//        }
//        
        this.num = num; //this class' instance variables are set to the parameters' variables
        this.denom = denom;
    }
    
    public Fraction(int num){
        this.num = num;
        denom = 2;
    }
    
    //Step 3: toString method
    public String toString(){ //toString method will ALWAYS be overwritten when you systemout
            if (denom == 0){
                return "undefined";
            }
            else if (num == 0){
                return "0";
            }
            else if (denom == 1){
                return num + "";
            }
            else{
                return num + "/" + denom;
            }    
        }
    
    //Step 4: write getters(accessors, allowing other files access to this info) and setters(allowing other files to change this info)
    //getters (accessors)
    public int getNum(){
        return num;
    }
    public int getDenom(){
        return denom;
    }
    
    //setters (mutators)
    private void setNum(int num){
        this.num = num;
    }
    private void setDenom(int denom){
        this.denom = denom;
    }
    
    public static void main(String [] args){
        Fraction f2 = new Fraction(1,2);
        System.out.println(f2.denom);
    }
    
    //Step 5: Interesting methods specific to this class,
    //collect coins, jumping, punch
    //for fractions, add, multiply, divide, subtract
    
    public Fraction multiply(Fraction that){
        return new Fraction(this.num*that.num, this.denom*that.denom);
    }
    
    public Fraction divide(Fraction f2){
        Fraction flipped = new Fraction (f2.denom, f2.num);
        return this.multiply(flipped);
    }
    
    public Fraction add(Fraction f2){
        if (this.denom == f2.denom){
            return new Fraction (this.num + f2.num, this.denom);
        }
        Fraction f3 = new Fraction(this.num*f2.denom, this.denom*f2.denom);
        Fraction f4 = new Fraction(f2.num*this.denom, f2.denom*this.denom);
        
        return new Fraction(f3.num+f4.num, this.denom*f2.denom);
    }
    
    public int gcf(){
        if 
    }
    
//    public Fractions(int n, int d){
//        num = n; //this classes set to parameters
//        denom = d;
//    }    
}

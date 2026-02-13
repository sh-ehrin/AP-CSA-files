public class Fractions {
    
    //instance variables, define
    private int num; //encapsulation
    private int denom; // data hiding, restricting access from other files
    
    //default constructor
    public Fractions(){ //green = fixed value
        num = 1;
        denom = 1;
    }
    
    //parameterized constructor
    public Fractions(int num, int denom){
        if(denom == 0){
            this.num = 1;
            this.denom = 1;  //is there another way to do this?
        }
        
        this.num = num; //this class' instance variables are set to the parameters' variables
        this.denom = denom;
    }
    
//    public Fractions(int n, int d){
//        num = n;
//        denom = d;
//    }
    
}

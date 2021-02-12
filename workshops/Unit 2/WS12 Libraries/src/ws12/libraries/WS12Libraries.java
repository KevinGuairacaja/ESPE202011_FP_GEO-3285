package ws12.libraries;

public class WS12Libraries {

    public static void main(String[] args) {
        
        float squareRoot = 0.0f;
        float number = 0.0f;
        float power = 0.0f;
        float base = 0.0f;
        float exponent = 0.0f;
        float absoluteValue = 0.0f;
                        
        number = 9;
        squareRoot = (float)Math.sqrt(number);
        System.out.println("The square root of --> "+number+" is --> "+squareRoot);
        
        number = 49;
        squareRoot = (float)Math.sqrt(number);
        System.out.println("The square root of --> "+number+" is --> "+squareRoot);
        
        number = 5;
        squareRoot = (float)Math.sqrt(number);
        System.out.println("The square root of --> "+number+" is --> "+squareRoot);
        
        base = 3;
        exponent = 2;
        power = (float)Math.pow(base,exponent);
        System.out.println("The power of --> "+base+" elevate to --> "+exponent+
                " is equal to --> "+power);
        
        power = computePower(base , exponent);
        System.out.println("The power of --> "+base+" elevate to --> "+exponent+
                " is equal to --> "+power);
        
        base = 2;
        exponent = 4;
        power = (float)Math.pow(base,exponent);
        System.out.println("The power of --> "+base+" elevate to --> "+exponent+
                " is equal to --> "+power);
        
        base = 78;
        exponent = 5;
        power = (float)Math.pow(base,exponent);
        System.out.println("The power of --> "+base+" elevate to --> "+exponent+
                " is equal to --> "+power);
        
        number = -6;
        absoluteValue = computeAbsoluteValue(number);
        System.out.println("The Absolute Value of " +number+ " is equal to --> "
        +absoluteValue);                
        
        number = 10;
        absoluteValue = computeAbsoluteValue(number);
        System.out.println("The Absolute Value of " +number+ " is equal to --> "
        +absoluteValue);                
        
    }
    
    public static float computePower(float base ,float exponent){
        float power;
        power = 1.0f;
        for(int i=1; i <=(int)exponent ; i++){
            power = power * base;
        }
        return power;
    }
    
    public static float computeAbsoluteValue(float number){
        if(number < 0){
            return -number;            
        }else{
        return number;
        }
    }                       
        
}

package utils;

public class BasicOperation {

    public static float addTwoNumbers(float addend1, float addend2){
        float sum = 0;
        sum = addend1 + addend2;
        return sum;
    }
    
    public static float subtractTwoNumbers(float minuend, float subtrahend){
        float subtract = 0;
        subtract = minuend - subtrahend;
        return subtract;
    }
    
    public static float multiplyTwoNumbers(float multiply, float multiplicand){
        float product = 0;
        product = multiply * multiplicand;
        return product;
    }
    
    public static float divideTwoNumbers(float divisor, float dividend){
        float quotient = 0;
        quotient = divisor / dividend;
        return quotient;
    }
}

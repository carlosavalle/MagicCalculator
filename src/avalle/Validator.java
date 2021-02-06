package avalle;

public class Validator {

    // will validate Denominator
    public static Boolean validateDenominator (int denominator){
        boolean result =false;
        if(denominator !=0){
            result = true;
        }
        return result;

    }
}

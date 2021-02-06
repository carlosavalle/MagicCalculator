package avalle;

import java.util.ArrayList;

public class Calculator {
  private ArrayList<Calculation> memory;

  // will create the array
    public Calculator() {
        this.memory = new ArrayList<Calculation>();
    }


// will return the array
    public ArrayList<Calculation> getMemory() {
        return memory;
    }


    // will save the object into the array
    public void addToMemory(Calculation calculation){
        memory.add(calculation);
    }
    // will receive an object and it will do a sum returning the result
    public static int doSum (Calculation calc){
        return calc.getNum1() + calc.getNum2();
    }
    // will receive an object and it will do a Subtraction returning the result
    public static int doSubstraction (Calculation calc){
        return calc.getNum1() - calc.getNum2();
    }
    // will receive an object and it will do a Multiplication returning the result
    public static int doMultiplication (Calculation calc){
        return calc.getNum1() * calc.getNum2();
    }
// will receive an object and it will do a Division returning the result
    public static int doDivision(Calculation calc) throws ArithmeticException{
        int division ;
        // will check if denominator !=0
        if (calc.getNum2() !=0) {
            division=  calc.getNum1() / calc.getNum2();
        }else{
            //if not will throw exception
            throw (new ArithmeticException());
        }
        return division;
    }
}

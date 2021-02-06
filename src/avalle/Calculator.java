package avalle;

import java.util.ArrayList;

public class Calculator {
  private ArrayList<Calculation> memory;

    public Calculator() {
        this.memory = new ArrayList<Calculation>();
    }



    public ArrayList<Calculation> getMemory() {
        return memory;
    }

    public void setMemory(ArrayList<Calculation> memory) {
        this.memory = memory;
    }
    public void addToMemory(Calculation calculation){
        memory.add(calculation);
    }
    public static int doSum (Calculation calc){
        return calc.getNum1() + calc.getNum2();
    }
    public static int doSubstraction (Calculation calc){
        return calc.getNum1() - calc.getNum2();
    }
    public static int doMultiplication (Calculation calc){
        return calc.getNum1() * calc.getNum2();
    }

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

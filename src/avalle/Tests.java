package avalle;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class Tests {

    @Test
    @DisplayName("Test 1 - Test Sum AssertEquals")
    void testSumAssertEquals(){
       Calculation calculation = new Calculation();
        calculation.setNum1(1);
        calculation.setNum2(2);
        calculation.setResult(Calculator.doSum(calculation));
        assertEquals(3,calculation.getResult(),"It should return a 3");

    }

    @Test
    @DisplayName("Test 2 - Test Subtraction AssertTrue")
    void testSubtractionAssertTrue(){
        Calculation calculation = new Calculation();
        calculation.setNum1(2);
        calculation.setNum2(1);
        calculation.setResult(Calculator.doSubstraction(calculation));
        assertEquals(1,calculation.getResult(),"It should return a 1");

    }
    @Test
    @DisplayName("Test 3 - test Division Denominator assertFalse")
    void testDivisionDenominatorAssertFalse(){
        Calculation calculation = new Calculation();
        calculation.setNum1(2);
        calculation.setNum2(0);
        assertFalse(Validator.validateDenominator(calculation.getNum2()),"It should return false");

    }

    @Test
    @DisplayName("Test 4 - test the Memory Array assertArrayEquals")
    void testMemoryArrayAssertArrayEquals(){
        Calculator calculator = new Calculator();
        Calculation calculation1 = new Calculation();

        calculation1.setNum1(2);
        calculation1.setNum2(0);
        calculation1.setResult(Calculator.doSum(calculation1));
        calculator.addToMemory(calculation1);


        Calculation calculation2 = new Calculation();
        calculation2.setNum1(4);
        calculation2.setNum2(4);
        calculation2.setResult(Calculator.doSum(calculation2));
        calculator.addToMemory(calculation2);

        ArrayList<Calculation> localList= new ArrayList<Calculation>();

        localList.add(calculation1);
        calculation2.setNum2(9);
        localList.add(calculation2);

        assertArrayEquals(localList.toArray(), calculator.getMemory().toArray(),"It should be equals");


    }

    @Test
    @DisplayName("Test 5 - test the Memory Array is created assertNotNull")
    void testMemoryAssertNotNull(){
        Calculator calculator = new Calculator();
        assertNotNull(calculator.getMemory(), "It should be not null");

    }
}

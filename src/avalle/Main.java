package avalle;


import java.util.InputMismatchException;
import java.util.Scanner;

import static avalle.Calculator.*;

public class Main {

    public static void main(String[] args) {

        int  operation = 0;
        Boolean loop = true;
        // creates a new calculator object
        Calculator calculator = new Calculator();

        while (loop) {
            try {

                // creates a new calculation object
                Calculation calculation = new Calculation();

                Scanner input = new Scanner( System.in );

                //displays the differents calculator options
                System.out.println("1- SUM");
                System.out.println("2- SUBTRACTION");
                System.out.println("3- MULTIPLICATION");
                System.out.println("4- DIVISION");
                System.out.println("5- Check previous results");
                System.out.println("6- End");
                System.out.println("Select a option\n");

                // asks the user for the options.
                operation = input.nextInt();

                // if the user select any math operation, it will prompt for the numbers
                if( operation < 5 ) {

                    System.out.print("Enter the first number: \n");
                    //store the first number
                    calculation.setNum1(input.nextInt());

                    System.out.print("Enter the second number: \n");
                    //store the second number
                    calculation.setNum2(input.nextInt());


                }
                // will execute the operation according with the user request
                switch (operation){
                    case 1:
                        calculation.setType(" + ");
                       calculation.setResult(doSum(calculation));
                       break;
                    case 2:
                        calculation.setType(" - ");
                        calculation.setResult( doSubstraction(calculation));
                        break;
                    case 3:
                        calculation.setType(" * ");
                        calculation.setResult(doMultiplication(calculation));
                        break;
                    case 4:

                        //will validate the denominator != 0
                        if  (Validator.validateDenominator(calculation.getNum2())){
                            // will store the divison
                            calculation.setType(" / ");
                            calculation.setResult(doDivision(calculation));
                        }else {
                            System.out.printf("Enter a valid denominator\n");
                        }
                        break;
                    case 5:
                        showResults(calculator);
                        System.out.println();
                        break;
                    case 6:
                        loop = false;
                        break;

                    default:
                        System.out.println("Enter a valid option");

                }
                // it will save into the array and will show the result
               if(operation >= 1 && operation <=4){
                    calculator.addToMemory(calculation);
                   System.out.println("The result is: " + calculation.getResult());
                   System.out.println();
                   System.out.println();


               }

            // will catch any error
            }catch (InputMismatchException ime) {
                System.out.println("Please, enter a valid number \n");
            } catch (ArithmeticException e) {
                System.out.println("It is not possible to division by zero \n");
            } catch (Exception e){
                System.out.println(e);
            }


            }
        }
        // will display the results in the array.
    static void showResults(Calculator calculator){
     if(calculator.getMemory().size()>0) {
         System.out.println("Results \n");
         for (Calculation c : calculator.getMemory()) {
             System.out.println(c.getNum1() + c.getType() + c.getNum2() + " = " + c.getResult());
         }
     }else{
         System.out.println("No data available");
     }
    }
    }



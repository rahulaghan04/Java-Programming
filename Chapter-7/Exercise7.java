package com.Rahulaghan;

class InvalidInputException extends Exception{
    @Override
    public String toString() {
        return "Cannot add 8 and 9";
    }
    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
class CannotDivideByZeroException extends Exception{
    @Override
    public String toString() {
        return "Cannot Divide by Zero.";
    }
    @Override
    public String getMessage() {
        return "super.getMessage()";
    }
}
class MaxInputException extends Exception{
    @Override
    public String toString() {
        return "Cannot Give input greater than 100000.";
    }
    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
class MaxMultiplyInputException extends Exception{
    @Override
    public String toString() {
        return "Cannot multiply if input has greater than 7000.";
    }
    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
class Calculator{
    double add(double a, double b) throws InvalidInputException, MaxInputException{
        if(a > 100000 || b > 100000){
            throw new MaxInputException();
        }
        if(a == 8 || b == 9){
            throw new InvalidInputException();
        }
        return a + b;
    }
    double subtract(double a, double b) throws MaxInputException{
        if(a > 100000 || b > 100000){
            throw new MaxInputException();
        }
        return a - b;
    }
    double multiply(double a, double b) throws MaxInputException, MaxMultiplyInputException{
        if(a > 100000 || b > 100000){
            throw new MaxInputException();
        }
        else if (a > 7000 || b > 7000) {
            throw new MaxMultiplyInputException();
        }
        return a * b;
    }
    double divide(double a, double b) throws CannotDivideByZeroException, MaxInputException{
        if(a > 100000 || b > 100000) {
            throw new MaxInputException();
        }
        if (b == 0) {
            throw new CannotDivideByZeroException();
        }
        return a / b;
    }
}
public class Exercise7 {
    public static void main(String[] args) throws InvalidInputException, CannotDivideByZeroException, MaxInputException, MaxMultiplyInputException{
        /*Exercise 6: You have to create a custom calculator with following operations:
        1. + -> Addition
        2. - -> Subtraction
        3. * -> Multiplication
        4. / -> Division
        which throws the following exceptions:
        1. Invalid input Exception ex: 8 & 9
        2. Cannot divide by 0 Exception
        3. Max Input Exception if any of the inputs is greater than 100000
        4. Max Multiplier Reached Exception - Don't allow any multiplication
           input to be greater than 7000.
         */

        Calculator calculator = new Calculator();
        //calculator.add(8,9);
        //calculator.subtract(23.56,67.89);
        //calculator.divide(800000,23);
        //calculator.multiply(34555, 5678);
        System.out.println(calculator.subtract(23.45, 13.4567));
    }
}

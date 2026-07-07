package Session1.Exercise4;
import java.util.Scanner;
public class CLI_Calculator {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the first number = ");
        double firstNumber = myScanner.nextDouble();
        System.out.println("Enter operator +, -, *, / : ");
        String operator = myScanner.next();
        System.out.println("Enter the second number = ");
        double secondNumber = myScanner.nextDouble();

        if(operator.equals("+")){
         double result = firstNumber + secondNumber;
         System.out.println("Result = "+ result);
        }
        else if(operator.equals("-")){
            double result = firstNumber - secondNumber;
            System.out.println("Result = "+ result);
        }
        else if(operator.equals("*")){
            double result = firstNumber * secondNumber;
            System.out.println("Result = "+ result);
        }
        else if(operator.equals("/")){
            if(secondNumber == 0){
                System.err.println("It is impossible to divide a number by 0");
            }
            else{
                double result = firstNumber / secondNumber;
                System.out.println("Result = "+ result);
            }
        }
        else{
            System.err.println("Try to use a valid operator");
        }
        myScanner.close();
    }
}

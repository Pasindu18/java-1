import java.text.ListFormat.Style;
import java.util.Scanner;

public class Calculator {

    public static double add(double a, double b){
        return a + b;
    }

    public static double subtract(double a, double b){

        return a - b;
    }
    public static double multiply(double a, double b){

        return a * b;
    }
    public static double divide(double a, double b){

        if (b == 0){
            System.out.println("Error .Devision by zero");
            return 0;
        }
        return a / b;
    }

     
    public static void main(String[] args){
        System.out.println("Wellcome to my Simple Calculator");

       /*  double num1 =10;
        double num2 = 20;

        System.out.println("Addition:" + add(num1, num2));
        System.out.println("Substraction:" + subtract(num1, num2));
        System.out.println("Multiplication:" + multiply(num1, num2));
        System.out.println("Division:" + divide(num1, num2)); */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number :");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the operation :");
        char operator = scanner.next().charAt(0);

        System.out.println("Enter the secomnd number :");
        double num2 = scanner.nextDouble();

        double result = 0;

        switch (operator) {
            case '+':
                result = add(num1, num2);
                
                break;
            case '-':
                result = subtract(num1, num2);    
        
                break;

            case '*':
               result = multiply(num1, num2);
               
               break;

            case '/':
               result = divide(num1, num2);
               
               break;

             default:
             
             System.out.println("Invalid Operator");
             return;
        }

        System.out.println("Result : " + result);

        
    }

}

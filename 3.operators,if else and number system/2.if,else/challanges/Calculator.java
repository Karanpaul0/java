
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Welcome to my Calculator");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number:- ");
        int num1 = input.nextInt();
        System.out.print("ENter the second number:- ");
        int num2 = input.nextInt();
        System.out.print("Enter the operator(+,-,*,/):- ");
        String operator = input.next();
        if (operator.equals("+")) {
            System.out.println("The addition of " + num1 + "+" + num2 + " = " + (num1 + num2));
        } else if (operator.equals("-")) {
            System.out.println("The substtrsction of " + num1 + "-" + num2 + " = " + (num1 - num2));
        } else if (operator.equals("*")) {
            System.out.println("The multiplication of " + num1 + "X" + num2 + " = " + (num1 * num2));
        } else if (operator.equals("/")) {
            System.out.println("The dividion of " + num1 + "/" + num2 + " = " + (num1 / num2));
        } else {
            System.out.print("Invalid Operator");
        }

    }
}

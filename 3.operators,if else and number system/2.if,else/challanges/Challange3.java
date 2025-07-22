
import java.util.Scanner;

public class Challange3 {

    public static void main(String[] args) {
        System.out.println("Welcome to finding the greatest of three numbers");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number:- ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number:- ");
        int num2 = input.nextInt();
        System.out.print("Enter Third number:- ");
        int num3 = input.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.print("The greatest number is " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.print("The greatest number is " + num2);
        } else {
            System.out.print("The greatest number is " + num3);
        }

    }

}

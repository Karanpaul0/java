
import java.util.Scanner;

public class Addition {

    int num1, num2;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:- ");
        num1 = sc.nextInt();
        System.out.print("Enter the second number:- ");
        num2 = sc.nextInt();
    }

    void putData() {
        System.out.println("The addition of two given number is:- " + (num1 + num2));
    }
}

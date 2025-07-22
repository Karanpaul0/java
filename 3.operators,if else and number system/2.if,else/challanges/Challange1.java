
import java.util.Scanner;

public class Challange1 {

    public static void main(String[] args) {
        System.out.println("Welcome to number's World");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your integer:- ");
        int num = input.nextInt();
        if (num < 0) {
            System.out.println("The given number is Negative");
        } else if (num > 0) {
            System.out.println("The given number is Positive");
        } else {
            System.out.print("The given number is Zero");
        }
    }
}

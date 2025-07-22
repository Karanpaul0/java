
import java.util.Scanner;


public class Challange2 {

    public static void main(String[] args) {
        System.out.println("Welcome to Number World");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int num=input.nextInt();
        if(num%2==0){
            System.out.println("The given number is Even number");
        }else {
            System.out.print("The given number id Odd number");
        }
    }
}
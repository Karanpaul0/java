
import java.util.Scanner;

public class Challange1{
    public static void main(String[] args){
        System.out.println("Welcome to our calculator");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter first number:- ");
        int firstNum=input.nextInt();
        System.out.print("Enter second number:- ");
        int secondNum=input.nextInt();
        System.out.println("The addition of given numbers is:- " +(firstNum+secondNum));
        System.out.println("The subtraction of given numbers is:- "+(firstNum-secondNum));
        System.out.println("The multiplication of given numbers is:- " + (firstNum*secondNum));
        System.out.println("The devision of given numbers is:- " + (firstNum/secondNum));
        System.out.print("The reminder of given numbers is:- "+ (firstNum%secondNum));
    }
}
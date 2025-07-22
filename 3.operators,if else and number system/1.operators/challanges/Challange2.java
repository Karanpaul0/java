
import java.util.Scanner;

public class Challange2{
    public static void main(String[] args){
        System.out.println("Welcome to our calculator");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter first number:- ");
        Double firstNum=input.nextDouble();
        System.out.print("Enter second number:- ");
        double secondNum=input.nextDouble();
        System.out.println("The addition of given numbers is:- " +(firstNum+secondNum));
        System.out.println("The subtraction of given numbers is:- "+(firstNum-secondNum));
        System.out.println("The multiplication of given numbers is:- " + (firstNum*secondNum));
        System.out.println("The devision of given numbers is:- " + (firstNum/secondNum));
        System.out.print("The reminder of given numbers is:- "+ (firstNum%secondNum));
    }
}

import java.util.Scanner;

public class Challange3{
    public static void main(String[] args){
        System.out.println("Welcome to perimeter calculator");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter length of a:- ");
        double a=input.nextDouble();
        System.out.print("Enter length of b:- ");
        double b=input.nextDouble();
        System.out.print("Enter length of c:- ");
        double c=input.nextDouble();
        System.out.print("Enter length of d:- ");
        double d=input.nextDouble();
        System.out.print("The perimeter of the rectangle is:- "+(a+b+c+d) +"cm");
    }
}
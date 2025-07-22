
import java.util.Scanner;

public class Challange6 {

    public static void main(String[] args) {
        System.out.println("Welcome to our Compound interest calculator");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Principle amount:- ");
        double principle = input.nextDouble();
        System.out.print("Enter the Rate of Interest:- ");
        double rate = input.nextDouble();
        System.out.print("Enter the Time period:- ");
        double time=input.nextDouble();
        double myComp=principle *Math.pow((1+rate/100),time);
        System.out.print("your compound interest is:- "+ myComp);

    }
}

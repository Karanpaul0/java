
import java.util.Scanner;

public class Challange7 {

    public static void main(String[] args) {
        System.out.println("Welcome to our degree converter");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter TEmpeture in Ferhenheit:- ");
        double myFer = input.nextDouble();
        double myCel = (myFer - 32) * 5 / 9;
        System.out.print("Temperature in celcius is:- " + myCel + "°c");

    }
}

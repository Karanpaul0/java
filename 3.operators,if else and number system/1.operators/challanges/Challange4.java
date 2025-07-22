
import java.util.Scanner;


public class Challange4 {

    public static void main(String[] args) {
        System.out.println("Welcome to Area of traingle calculator");
        Scanner input=new Scanner(System.in);
        System.out.print("Enetr the Base of the Triangle:- ");
        double Base=input.nextDouble();
        System.out.print("Enter the Height of the Triangle:- ");
        double Height=input.nextDouble();

        System.out.print("The Area of Triangle is:- "+ (0.5*Base*Height) +"cm");
    }
}
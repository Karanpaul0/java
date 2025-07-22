
import java.util.Scanner;

public class Challange4{
    public static void main(String[] args) {
        System.out.println("WELCOME");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a year:- ");
        long year=input.nextLong();
        if (year%400==0) {
            System.out.println("The given year is a Leap year");
        } else if(year%100==0) {
            System.out.print("The given year is not a Leap year");
        }
    }
}
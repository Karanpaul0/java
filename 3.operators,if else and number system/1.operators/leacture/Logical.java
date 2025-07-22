
import java.util.Scanner;

public class Logical {

    public static void main(String[] args) {
        System.out.println("Welcome to ticket discount portal");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your age:-");
        int age=input.nextInt();
        System.out.print("Are you a Female? (true/false):-");
        boolean isFemale=input.nextBoolean();
        if(age <5){
            System.out.println("You got 75% Discount");
        }else if(isFemale){
            System.out.println("You got 50% Discount");
        }else if(age>60 && !isFemale){
            System.out.println("You got 25% Discount");
        }else {
            System.out.print("Sorry,You are not eligible for any type of Discounts");
        }

    }
}

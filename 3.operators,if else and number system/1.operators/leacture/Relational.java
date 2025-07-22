
import java.util.Scanner;

public class Relational{
    public static void main(String[] args){
        System.out.println("Welcome to licence portal");
        Scanner input=new Scanner(System.in);
        System.out.print("enter your age:- ");
        int age=input.nextInt();
        if(age>=18){
            System.out.print("Your eligible for driving licence");
        }else{
            System.out.print("Your not eligible for driving licence");
        }
    }
}
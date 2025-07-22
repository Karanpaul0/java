
import java.util.Scanner;

public class Challange5{
    public static void main(String[] args){
        System.out.println("Welcome to simple interest calculator");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter principal amount in Rs:- ");
        int Principal=input.nextInt();
        System.out.print("Enter Time in years:- ");
        float Time=input.nextFloat();
        System.out.print("Enter Rate of interest in %:- ");
        float Rate=input.nextFloat();
        System.out.print("The Simple Interest is:- "+ (Principal*Time*Rate)/100 +"Rs");
    }
}
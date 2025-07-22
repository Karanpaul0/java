
import java.util.Scanner;

public class Return{
    public static void main(String[] argd){
        greeting();
        int num1=inpNum();
        int num2=inpNum();
        System.out.println("The sum of give two number is:- "+ (num1+num2));

    }
    public static void greeting(){
        System.out.println("WELCOME TO MY CALCULATOR");
    }
    public static int inpNum(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int number=input.nextInt();
        return number;
    }
}
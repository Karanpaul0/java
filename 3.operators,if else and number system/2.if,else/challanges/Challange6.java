
import java.util.Scanner;
public class Challange6 {

    public static void main(String[] args) {
        System.out.println("WELCOME");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter yiur age:- ");
        int age=input.nextInt();
        if (age<13){
            System.out.print("You are a Child");
        }else if(age<=20 && age>13){
            System.out.print("You are a Teenager");
        }else if(age<=60 && age>20){
            System.out.print("You are an Adult");
        }else{
            System.out.print("You are a senior citizen");
        }

    }
}

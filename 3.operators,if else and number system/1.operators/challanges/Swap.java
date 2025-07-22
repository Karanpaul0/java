import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a=input.nextInt();
        System.out.print("Enter the second number:- ");
        int b=input.nextInt();
        int c=a;
        a=b;
        b=c;
        System.out.println("the value of a is: "+a);
        System.out.println("the value of b is: "+b);
    }
}
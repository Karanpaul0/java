
import java.util.Scanner;

public class Shorthand {

    public static void main(String[] args) {
        int a = 3;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x1 = input.nextInt();
        // a = a + x1 -> a += x1
        a += x1;
        System.out.println(a);
        System.out.print("Enter a number: ");
        int x2 = input.nextInt();
        a += x2;
        System.out.println(a);
        System.out.print("Enter a number: ");
        int x3 = input.nextInt();
        a += x3;
        System.out.println(a);
        System.out.print("Enter a number: ");
        int x4 = input.nextInt();
        a += x4;
        System.out.println(a);

    }
}

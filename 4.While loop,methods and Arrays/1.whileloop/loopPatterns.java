
import java.util.Scanner;

public class loopPatterns {

    public static void main(String[] args) {
        pattern();
    }

    public static void pattern() {
        Scanner sc = new Scanner(System.in);
        int rows = 0;
        System.out.print("Enter the number of rows you want:- ");
        int rowsCount = sc.nextInt();
        while (rows <= rowsCount) {
            System.out.print("k");
            int i = 1;
            while (i <= rows) {
                System.out.print(" k");
                i++;
            }
            System.out.println();
            rows++;
        }
    }
}

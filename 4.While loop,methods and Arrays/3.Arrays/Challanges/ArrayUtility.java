
import java.util.Scanner;

public class ArrayUtility {

    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements countt:- ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Enter the element " + (i + 1) + " : ");
            numbers[i] = sc.nextInt();
            i++;
        }
        return numbers;
    }

    public static void printArray(int[] numArray) {
        int i = 0;
        while (i < numArray.length) {
            System.out.print(numArray[i] + " ");
            i++;
        }
        System.out.println();
    }

    public static int[][] input2DArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements of rows:- ");
        int rows = sc.nextInt();
        System.out.print("Enter the elements of columns:- ");
        int columns = sc.nextInt();
        int[][] numArr = new int[rows][columns];
        int i = 0;
        while (i < rows) {
            int j = 0;
            while (j < columns) {
                System.out.print("Enter the element of row " + (i + 1) + " , " + "column " + (j+1) + ":- ");
                numArr[i][j] = sc.nextInt();
                j++;
            }

            i++;
        }
        return numArr;
    }
}

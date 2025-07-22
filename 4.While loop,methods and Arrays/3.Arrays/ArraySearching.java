
import java.util.Scanner;

public class ArraySearching {

    public static void main(String[] args) {
        System.out.println("WELCOME TO ARRAY SEARCHING");
        int[] myArr = {10, 20, 30, 40, 50, 60, 7, 70, 80, 90};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number you want to find:- ");
        int num = sc.nextInt();
        boolean isFound = isFound(myArr, num);
        if (isFound) {
            System.out.print("your number is found in the given array");
        } else {
            System.out.print("your number is not found in the given array");
        }
    }

    public static boolean isFound(int[] myArr, int num) {
        int index=0;
        while(index<=myArr.length){
            if(myArr[index]==num){
                return true;
            }
            index++;
        }
        return false;
    }

}


import java.util.Scanner;

public class whilelloop {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number  ");
        int num=input.nextInt();
        System.out.print("Enter a number  ");
        long endNum=input.nextLong();
        while(num<=endNum){
            System.out.println("ok");
            num+=1;
        }
    }
}
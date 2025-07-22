
import java.util.Scanner;

public class Challange2{
    public static void main(String[] args) {
     System.out.println("Welcome");
     int[] nums=ArrayUtility.inputArray();
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the number:- ");
     int num=sc.nextInt();
     int noOfOcurrence=noOfOcurrence(nums, num);
     System.out.print("No. of ocurrence of your number is:- " + noOfOcurrence);

    }
    public static int noOfOcurrence(int[] nums,int num){
        int i=0;
        int sum=0;
        while(i<nums.length){
            if(nums[i]==num){
                sum+=1;
            }
            i++;
        }
        return sum;
    }
}
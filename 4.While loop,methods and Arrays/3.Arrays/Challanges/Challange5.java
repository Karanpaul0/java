
import java.util.Scanner;

public class Challange5{
    public static void main(String[] args) {
     System.out.println("Welcome");
     Scanner sc=new Scanner(System.in);
     int[] numArr=ArrayUtility.inputArray();
     System.out.print("Enter the number you want to delete:- ");
     int deleteNum=sc.nextInt();
     int[] newArr=elementDelete(numArr, deleteNum);
     System.out.println("Here is your new Array");
     ArrayUtility.printArray(newArr);
    }


    public static int noOfOcc(int[] numArr,int deleteNum){
        int i=0;
        int occ=0;
        while(i<numArr.length){
            if(numArr[i]==deleteNum){
                occ++;
            }
            i++;
        }
        return occ;
    }


    public static int[] elementDelete(int[] numArr, int deleteNum){
        int occ=noOfOcc(numArr, deleteNum);
        if(occ==0){
            return numArr;
        }
        int newSize=numArr.length-occ;
        int[] newArr=new int[newSize];



        int i=0,j=0;
        while(i<numArr.length){
             if(numArr[i]!=deleteNum){
                newArr[j]=numArr[i];
                j++;
             }
            i++;
        }




        return newArr;
    }
}

import java.util.Scanner;


public class Challange5 {

    public static void main(String[] args) {
        System.out.println("WELCOME TO THE MARKS CALCULATOR \n \n");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your Total obtained marks:- ");
        float marks=input.nextFloat();
        System.out.print("Enter your Total marks:- ");
        int tMarks=input.nextInt();
        float percent=(marks/tMarks)*100;
        System.out.println("your percentage is:- "+percent + "%");
        if(percent >=90) {
            System.out.print("Your grade is A");
        }else if(percent>=75 && percent<90){
            System.out.print("Your grade is B");
        }else if (percent>=60 && percent<75){
            System.out.print("Your grade is C");
        }else if (percent>=30 && percent<60){
            System.out.print("Your grade is D");
        }else {
            System.out.print("Unfortunately your failed");
        }
    }
}

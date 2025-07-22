

public class Challange3{
    public static void main(String[] args){
        System.out.print("WELCOME");
        int[] array=ArrayUtility.inputArray();
        int maximum=maximum(array);
        System.out.println("The maximum value in the given list is:- "+maximum);
        int minimum=minimum(array);
        System.out.println("The minimum value in the given list is:- "+minimum);
    }
    public static int maximum(int[] array){
        int i=0;
        int max=0;
        while(i<array.length){
            if(array[i]>max){
                max=array[i];
            }
            i++;
        }
        return max;
    }
    public static int minimum(int[] array){
        int i=0;
        int min=array[1];
        while(i<array.length){
            if(array[i]<min){
                min=array[i];
            }
            i++;
        }
        return min;
    }
}
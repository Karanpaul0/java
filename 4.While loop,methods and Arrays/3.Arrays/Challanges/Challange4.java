

public class Challange4{
    public static void main(String[] args) {
     System.out.println("WELCOME");
     int[] array=ArrayUtility.inputArray();
     boolean increasing=increasing(array);
     boolean decreasing=decreasing(array);
     if(increasing || decreasing){
        System.out.print("your given list is sorted");
     }else{
        System.out.print("your given list is not sorted");
     }
    }
    public static boolean increasing(int[] array){
        int i=1;
        while(i<array.length){
            if(array[i]<=array[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean decreasing(int[] array){
         int i=1;
        while(i<array.length){
            if(array[i]>=array[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
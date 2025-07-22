

public class Challange10{
    public static void main(String[] args){
        System.out.println("Welcome to sum and average of 2D array");
        int[][] myArr=ArrayUtility.input2DArray();
        long sumArr=arraySum(myArr);
        double avgArr=arrayAvg(myArr);
        System.out.println("Sum of the given 2D Array is:- " + sumArr);
        System.out.println("Average of the given 2D Array is:- " + avgArr);
    }
    public static long arraySum(int[][] myArr){
        int i=0;
        long sum=0;
        while(i<myArr.length){
            int j=0;
            while(j<myArr[i].length){
                sum+=myArr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
    public static double arrayAvg(int[][] myArr){
        double count=0;
        int i=0;
        while (i<myArr.length){
            int j=0;
            while(j<myArr[i].length){
                count+=1;
                j++;
            }
            i++;
        }
        return arraySum(myArr)/count;
    }
}
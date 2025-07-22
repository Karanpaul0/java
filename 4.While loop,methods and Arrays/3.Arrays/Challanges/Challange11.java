public class Challange11{
    public static void main(String[] args){
        System.out.println("Welcome to Array diognal sum");
        System.out.println("The rows nd The column has to be same");
        int[][] myArr=ArrayUtility.input2DArray();
        long sumOfDiiognals=diognalSum(myArr);
        System.out.print("Sum of the diognals is:- "+ sumOfDiiognals);
    }
    public static long diognalSum(int[][] myArr){
        long leftDiognal=leftDiognal(myArr);
        long rightDiognal=rightDiognal(myArr);
        long sum=leftDiognal+rightDiognal;
        if(myArr.length%2!=0){
            int ind=myArr.length/2;
            sum-=myArr[ind][ind];
        }
        return sum;
    }



    public static long leftDiognal(int[][] myArr){
        int i=0;
        long sum=0;
        while(i<myArr.length){
            sum+=myArr[i][i];
            i++;
        }
        return sum;
    }



    public static long rightDiognal(int[][] myArr){
        int i=0;
        long sum=0;
        while(i<myArr.length){
            int col=myArr.length-1-i;
            sum+=myArr[i][col];
            i++;
            
        }
        return sum;
    } 
}
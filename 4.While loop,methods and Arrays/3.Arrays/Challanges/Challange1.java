

public class Challange1 {

    public static void main(String[] args) {
        System.out.println("WELCOME ");
        int[] nums=ArrayUtility.inputArray();
        long average=average(nums);
        System.out.println("The sum of all elements is:- "+ average);
        double avg=average/nums.length;
        System.out.print("The average of the elements is "+ avg);
    }
    public static long average(int[] nums){
        int sum=0;
        int i=0;
        while(i<nums.length){
            sum+=nums[i];
            i++;
        }
        return sum;
    }
}

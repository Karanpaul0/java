
public class Array {

    public static void main(String[] args) {
        int[] myint = new int[5];
        myint[0] = 2;
        myint[1] = 3;
        myint[2] = 4;
        myint[3] = 5;
        myint[4] = 6;
        System.out.println(myint[0]);
        System.out.println(myint[1]);
        System.out.println(myint[2]);
        System.out.println(myint[3]);
        System.out.println(myint[4]);


// -----------------------------------------------------------


        int[]myNewint={2,3,4,5,6};
        System.out.println(myNewint[0]);
        System.out.println(myNewint[1]);
        System.out.println(myNewint[2]);
        System.out.println(myNewint[3]);
        System.out.println(myNewint[4]);





// ------------------------------------------------------


        int[] myArr={1,2,3,4,5,6};
        int index=0;
        while(index<= myArr.length){
            System.out.println(myArr[index]);
            index++;
        }


    }
}

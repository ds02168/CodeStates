package JAVA_Recursive;

import java.util.Arrays;

public class arrSumExample {
//    public static int arrSum(int[] arr){
//        int sum = 0;
//        for(int num: arr)
//            sum += num;
//        return sum;
//    }

    public static int arrSum(int[] arr){
        if(arr.length==0) return 0;

//        //System.arraycopy()
//        int head = arr[0];
//        int[] tail = new int[arr.length-1];
//        System.arraycopy(arr,1,tail,0,tail.length);
//        return head + arrSum(tail);

//        //Arrays.copyOfRange()
//        int head = arr[0];
//        int[] tail = Arrays.copyOfRange(arr,1,arr.length);
//        return head + arrSum(tail);

        //스트림
        int head = arr[0];
        int [] tail = Arrays.stream(arr).skip(1).toArray();
        return head + arrSum(tail);
    }
    public static void main(String[] args) {
        int[] arr = new int[] {10,3,6,2};
        System.out.println(arrSum(new int[0]));
    }
}

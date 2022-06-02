package JAVA_Algorithm;

import java.util.Arrays;

public class DynamicCoins {
    public static void main(String[] args) {
        int n = 3;//동전 갯수
        int m  = 7; //액수

        int[] arr = new int[n]; //동전 리스트
        arr[0] = 2;
        arr[1] = 3;
        arr[2] = 5;
        int[] d = new int[m + 1]; //금액 리스트
        Arrays.fill(d,10001); //10001개로 초기화

        //다이나믹 프로그래밍
        d[0] =  0;
        for(int i = 0; i < n; i++){
            for(int j = arr[i];j<=m;j++){
                d[j] = Math.min(d[j],d[j-arr[i]] + 1);
                //현재 동전 갯수 vs 이전 동전 + 1 중 작은 수
            }
        }

        System.out.println(d[m]);
    }
}

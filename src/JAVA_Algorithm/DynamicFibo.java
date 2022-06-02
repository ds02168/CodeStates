package JAVA_Algorithm;

public class DynamicFibo {
    public static long[] d = new long[100]; //메모이제이션

    public static void main(String[] args) {
        d[1] = 1;
        d[2] = 1;
        int n = 50; //50번째 피보나치 수를 계산

        for(int i =3; i <= n; i++)
            d[i] = d[i-1] + d[i-2];
        System.out.println(d[n]);
    }
}

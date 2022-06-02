package JAVA_Algorithm;

public class DynamicToOne {
    public static int[] d = new int[30001];

    public static void main(String[] args) {
        int x = 26; //목표 값
        for(int i=2;i<=x;i++){
            d[i] = d[i-1]  + 1; //더하기
            if(i%2 == 0) //2로 나누어진다면
                d[i] = Math.min(d[i],d[i/2] + 1); //더하기랑 이전값 곱하기중 작은 것
            if(i%3 == 0) //3로 나누어진다면
                d[i] = Math.min(d[i],d[i/3] + 1); //더하기랑 이전값 곱하기중 작은 것
            if(i%5 == 0) //5로 나누어진다면
                d[i] = Math.min(d[i],d[i/5] + 1); //더하기랑 이전값 곱하기중 작은 것
        }

        System.out.println(d[x]);
    }
}

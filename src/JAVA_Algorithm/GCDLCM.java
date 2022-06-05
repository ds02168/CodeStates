package JAVA_Algorithm;

public class GCDLCM {
    public static int GCD(int a,int b){
        int n = 1;
        while(b != 0){
            n = a % b;
            a = b;
            b = n;
        }
        return a;
    }

    public static int LCM(int a, int b){
        return a * b / GCD(a,b);
    }

    public static void main(String[] args) {
        System.out.println("최대 공약수(GCD) : " + GCD(24,30));
        System.out.println("최소 공배수(LCM) : " + LCM(24,30));
    }
}

package JAVA_Algorithm;

/*
 * 출처 : https://www.youtube.com/watch?v=2zjoKjt97vQ
 * 매 초마다 3이라는 숫자가 존재하는지 모두 확인합니다.
 * */
//완전 탐색(Brute-Force)
public class ThreeInTime {
    public static boolean check(int h,int m,int s){
        //시간의 1의자리 or 분의 10의자리 or 분의 1의자리 or 초의 10의자리 or 초의 1의자리 중 3이있다면
        if(h % 10 == 3 || m /10 ==3||m%10==3||s/10==3||s%10==3) return true;
        return false;
    }
    public static void main(String[] args) {
        int h = 1;
        int cnt = 0;
        for(int i=0;i<=h;i++)
            for(int j=0;j<60;j++)
                for(int k=0;k<60;k++)
                    if(check(i,j,k)) cnt++; //매 초마다 확인

        System.out.println(cnt);
    }
}

package JAVA_Algorithm;

/*
* 출처 : https://www.youtube.com/watch?v=2zjoKjt97vQ
* 임의의 수 n이 1까지 나누고 빼기 연산을 최소한으로 하는데 빼기 보다는 나누기가 더 적은 수의
* 연산횟수를 보장하므로 가능한 많이 나눗셈을 수행하는 선택이 최선의 선택임을 보장합니다.
* */
//Greedy
public class ToOne {
    public static void main(String[] args) {
        int n = 25;
        int k = 3;
        int result = 0;

        while(true){
            int target = (n/k)*k; //가장 가까운 나눗셈이 가능한 수
            result += (n - target); //몇번을 빼야하는지 추가
            n = target; //몇번 뺏다고 가정

            if(n < k) break; //더이상 나눌 수 없음

            result += 1; //1회 추가
            n /= k; //나누기
        }

        result += (n-1); //더이상 나눌수 없을 때 1까지의 빼기
        System.out.println(result);
    }
}

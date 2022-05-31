package JAVA_Algorithm;

/*
 * 출처 : https://www.youtube.com/watch?v=2zjoKjt97vQ
 * 동전 액수는 모두 배수의 관계이므로 큰 액수의 동전부터 나머지 연산을 수행하는것이
 * 최선의 선택이고 최종 계산 결과 최선의 선택 일부분임을 보장합니다.
 * */

//Greedy
public class CoinChange {
    public static void main(String[] args) {
        int n = 1260; //거슬러 줄 돈
        int cnt = 0; //동전 갯수
        int[] coinTypes = {500,100,50,10}; //동전 액수

        for(int i = 0; i < coinTypes.length;i++){
            cnt += n / coinTypes[i]; //동전 갯수 추가
            n %= coinTypes[i]; //잔액
        } //동전간 배수이기 때문에 부분중 최선이 전체의 최선으로 이어질 수 있음
        System.out.println(cnt); //출력
    }
}

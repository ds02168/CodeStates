package JAVA_Algorithm;

/*
* 출처 : https://www.youtube.com/watch?v=2zjoKjt97vQ
* 1이하인 피연산자가 있을땐 더하기 두 피연산자 모두 2이상이면 곱하는 것이 더 큰 수를 보장하므로
* 현재상태에서의 최선의 선택이 최종결과에서의 최선의 선택을 보장합니다.
* */
//Greedy
public class PowOrPlus {
    public static void main(String[] args) {
        String str = "02984"; //숫자 문자열

        long result = str.charAt(0) -'0'; //여태까지의 연산결과
        for(int i=1;i<str.length();i++){
            int num = str.charAt(i) -'0'; //다가올 피 연산자
            if(num <= 1 || result <= 1) //피연산자 둘중 하나라도 1이하이면
                result += num; //더하기
            else //피연산자 두개 모두 2이상이면
                result *= num; //곱하기
        }

        System.out.println(result); //결과 반환
    }
}

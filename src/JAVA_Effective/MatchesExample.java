package JAVA_Effective;

import java.util.Arrays;

public class MatchesExample {
    public static void main(String[] args) {
        int[] intArr = {2,4,6};
        boolean result = Arrays.stream(intArr).allMatch(a->a%2==0);
        System.out.println("모두 2의 배수 : " +result);

        result = Arrays.stream(intArr).anyMatch(a->a%3==0);
        System.out.println("한개이상 3의 배수 : " + result);

        result = Arrays.stream(intArr).noneMatch(a->a%3==0);
        System.out.println("어떤것도 3의 배수 아님 : " + result);
    }
}

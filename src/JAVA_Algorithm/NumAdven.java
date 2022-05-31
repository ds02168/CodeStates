package JAVA_Algorithm;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 출처 : https://www.youtube.com/watch?v=2zjoKjt97vQ
 * 모험가를 공포도(요구되는 최소 파티 인원수)를 오름차순으로 정렬하여 현재 그룹인원수와
 * 해당 파티원의 공포도를 비교하는 것이 최대한 많은 파티를 구성하는 최선의 선택임을 보장합니다.
 * */
//Greedy
public class NumAdven {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(2);

        Collections.sort(arrayList);

        int result = 0; //총 파티의 수
        int count = 0; //현재 파티의 모험가수
        for(int i=0;i<arrayList.size();i++){
            count += 1; //현재 모험가 추가
            if(count >= arrayList.get(i)){ //현재 모험가의 공포도보다 파티 인원수가 더 많으면
                result++; //파티 추가
                count = 0; //그룹 0명 초기화
            }
        }
        System.out.println(result);
    }
}

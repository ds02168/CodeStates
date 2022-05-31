package JAVA_Algorithm;

public class KingsKnight {
    public static void main(String[] args) {
        int row = 0;
        int col = 0;

        int[] dx = {-2,-1,1,2,2,1,-1,-2}; //col 이동
        int[] dy = {-1,-2,-2,-1,1,2,2,1}; //row 이동

        int result = 0;
        for(int i=0;i<8;i++){
            int nextRow = row + dy[i]; //row 이동
            int nextCol = col + dx[i]; //col 이동
            //8x8 이차원 배열안에 다음 위치가 존재하면 +1개
            if(nextRow >= 0 && nextRow <= 7 && nextCol >= 0 && nextCol <= 7)
                result++;
        }
        System.out.println(result);
    }
}

package JAVA_Algorithm;

public class AntWarrior {
    public static int[] d = new int[100];
    public static void main(String[] args) {
        int n = 4;
        int[] arr = new int[]{1,3,1,5};
        d[0] = arr[0]; //0번재는 0번재
        d[1] = Math.max(arr[0],arr[1]); //1번째는 0번째와 1번째 중 큰것
        for(int i =2;i <n; i++){
            d[i] = Math.max(d[i-1],d[i-2] + arr[i]); //An = MAX(An-1, An-2 + An)
        }
        System.out.println(d[n-1]);
    }
}

package JAVA_Algorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class CombinationRecursive {

    public static void combination(ArrayList<String[]> result, String[] data, boolean[] visited, int depth, int n, int r){
        if(r == 0){
            print(result,data,visited,n);
            return;
        }

        for(int i = depth; i < n; i++){
            visited[i] = true;
            combination(result,data,visited,i+1,n,r-1);
            visited[i] = false;
        }
    }

    public static void print(ArrayList<String[]> result, String[] data, boolean[] visited, int n){
        ArrayList<String> input = new ArrayList<>();
        for(int i=0;i<n;i++)
            if(visited[i]) input.add(data[i]);
        result.add(input.toArray(new String[0]));
    }

    public static void main(String[] args) {
        ArrayList<String[]> result = new ArrayList<>();
        combination(result,new String[]{"A","B","C","D","E"},new boolean[]{false,false,false,false,false},0,5,3);

        for(int i=0;i<result.size();i++)
            System.out.println(Arrays.toString(result.get(i)));
    }
}

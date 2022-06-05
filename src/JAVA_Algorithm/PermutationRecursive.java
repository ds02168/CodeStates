package JAVA_Algorithm;


import java.util.ArrayList;
import java.util.Arrays;

public class PermutationRecursive {
    public static void permutation(ArrayList<String[]> result, String[] data, int depth, int n, int r){
        if(depth ==  r){
            print(result,data,r);
            return;
        }
        for(int i=depth;i<n;i++) {
            swap(data,depth,i);
            permutation(result,data,depth+1,n,r);
            swap(data,depth,i);
        }
    }

    public static void swap(String[] data, int depth, int i){
        String temp = data[depth];
        data[depth] = data[i];
        data[i] = temp;
    }

    public static void print(ArrayList<String[]> result, String[] data, int r){
        String[] input = new String[r];
        for(int i=0;i<r;i++) input[i] = data[i];
        result.add(input);
    }
    public static void main(String[] args) {
        ArrayList<String[]> result = new ArrayList<>();
        permutation(result,new String[]{"A","B","C","D","E"},0,5,3);
        for(int i=0;i<result.size();i++)
            System.out.println(Arrays.toString(result.get(i)));
    }
}

package JAVA_Algorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class PermutationExample {
    public static void main(String[] args) {
        String[] alpha = new String[]{"A","B","C","D","E"};
        ArrayList<String[]> result = new ArrayList<>();

        for(int i =0;i<alpha.length;i++)
            for(int j=0;j<alpha.length;j++)
                for(int k=0;k<alpha.length;k++){
                    if(i==j||i==k||j==k) continue;
                    result.add(new String[]{alpha[i],alpha[j],alpha[k]});
                }

        for(int i=0;i< result.size();i++)
            System.out.println(Arrays.toString(result.get(i)));
    }
}

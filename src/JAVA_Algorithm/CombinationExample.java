package JAVA_Algorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class CombinationExample {
    public static void main(String[] args) {
        String[] alpha = new String[]{"A","B","C","D","E"};
        ArrayList<String[]> result = new ArrayList<>();

        for(int i=0;i<alpha.length;i++)
            for(int j=i+1;j<alpha.length;j++)
                for(int k=j+1;k<alpha.length;k++)
                    result.add(new String[]{alpha[i],alpha[j],alpha[k]});

        for(int i=0;i< result.size();i++)
            System.out.println(Arrays.toString(result.get(i)));
    }
}

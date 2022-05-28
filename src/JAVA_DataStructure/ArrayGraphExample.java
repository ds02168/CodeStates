package JAVA_DataStructure;
import java.util.*;

class ArrayGraph{
    private int[][] graph;

    public void setGraph(int size){
        graph = new int[size][size];

        for(int i = 0;i<size;i++){
            for(int j=0;j<size;j++){
                graph[i][j] = 0;
            }
        }
    }

    public int[][] getGraph(){
        return graph;
    }

    public void addEdge(int from, int to){
        if(from >= graph.length || to >= graph.length) return ;
        graph[from][to] = 1;
    }
    public boolean hasEdge(int from, int to){
        if(from >= graph.length || to >= graph.length) return false;
        return graph[from][to] == 1;
    }
    public void removeEdge(int from,int to){
        if(from >= graph.length || to >= graph.length) return;
        graph[from][to] = 0;
    }
}

public class ArrayGraphExample {
    public static void main(String[] args) {
        ArrayGraph adjMatrix = new ArrayGraph();
        adjMatrix.setGraph(3);
        System.out.println(Arrays.deepToString(adjMatrix.getGraph()));


        adjMatrix.addEdge(0,1);
        adjMatrix.addEdge(0,2);
        adjMatrix.addEdge(1,2);

        boolean zeroToOneEdgeExists = adjMatrix.hasEdge(0,1);
        System.out.println(zeroToOneEdgeExists);
        zeroToOneEdgeExists = adjMatrix.hasEdge(0,2);
        System.out.println(zeroToOneEdgeExists);
        boolean oneToZeroEdgeExists = adjMatrix.hasEdge(1,0);
        System.out.println(oneToZeroEdgeExists);
    }
}

package JAVA_DataStructure;

import java.util.*;

class ListGraph{
    private ArrayList<ArrayList<Integer>> graph;

    public ListGraph(){
        graph = new ArrayList<>();
    }
    public void setGraph(int size){
        for(int i=0;i<size;i++)
            graph.add(new ArrayList<>());
    }

    public ArrayList<ArrayList<Integer>> getGraph(){
        return graph;
    }

    public void addEdge(int from, int to){
        if(from < 0 || to < 0 || from >= graph.size() || to >= graph.size()) return;

        graph.get(from).add(to);
        graph.get(to).add(from);
    }
    public boolean hasEdge(int from, int to){
        if(from < 0 || to < 0 || from >= graph.size() || to >= graph.size()) return false;
        return graph.get(from).contains(to);
    }
    public void removeEdge(int from, int to){
        if(from < 0 || to < 0 || from >= graph.size() || to >= graph.size()) return;

        if(graph.get(from).contains(to)) graph.get(from).remove((Integer)to);
        if(graph.get(to).contains(from)) graph.get(to).remove((Integer)from);
    }
}

public class ListGraphExample {
    public static void main(String[] args) {
        ListGraph adjList = new ListGraph();
        adjList.setGraph(3);

        adjList.addEdge(0,1);
        System.out.println(adjList.hasEdge(0,1));

        adjList.removeEdge(0,1);
        System.out.println(adjList.hasEdge(0,1));
    }
}

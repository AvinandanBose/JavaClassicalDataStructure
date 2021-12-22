package com.company;

import java.util.ArrayList;

class Edge{
    int startVertex;
    int endVertex;
    public Edge(int start, int end){
        this.startVertex = start;
        this.endVertex = end;
    }
}
public class DirGraph {
    public static void main(String[]args){
        int vertex = 5;
        int[][]matrix = new int[vertex+1][vertex+1];
        ArrayList<Edge> edgeList = new ArrayList<Edge>();
        edgeList.add(new Edge(1,4));
        edgeList.add(new Edge(4,2));
        edgeList.add(new Edge(2,5));
        edgeList.add(new Edge(3,5));
        edgeList.add(new Edge(3,1));
        edgeList.add(new Edge(3,4));

        for(int i = 0;i<edgeList.size();i++){
            Edge currentEdge = edgeList.get(i);
            int startVertex = currentEdge.startVertex;
            int endVertex = currentEdge.endVertex;
            matrix[startVertex][endVertex] =1;
        }
        for(int i=0;i<=vertex;i++){
            for (int j=1;j<=vertex;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}

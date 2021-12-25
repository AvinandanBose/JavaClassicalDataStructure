import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Edge {
    int src, dest;

    Edge(int src, int dest) {
        this.src = src;
        this.dest = dest;
    }
}

 class DirectedGraph {
    List<List<Integer>> adj = new ArrayList<>();

    public DirectedGraph(List<Edge> edges) {
        int initVertex = 0;
        for (Edge e : edges) {
            initVertex = Integer.max(initVertex, Integer.max(e.src, e.dest));
        }


        for (int i = 0; i <= initVertex; i++) {
            adj.add(i, new ArrayList<>());
        }

        for (Edge currentEdge : edges) {

            adj.get(currentEdge.src).add(currentEdge.dest);

        }
    }

    public static void printGraph(DirectedGraph graph) {
        int count = 0;
        int n = graph.adj.size();

        while (count < n) {
            for (int dest : graph.adj.get(count)) {
                System.out.print("(" + count + " ——> " + dest + ")\t");
            }
            System.out.println();
            count++;
        }
    }
     public static void main(String[] args) {

         List<Edge> edges = Arrays.asList(new Edge(1, 4), new Edge(4, 2),
                 new Edge(2, 5), new Edge(3, 5), new Edge(3, 1),
                 new Edge(3, 4));


         DirectedGraph graph = new DirectedGraph(edges);


         DirectedGraph.printGraph(graph);
     }
}






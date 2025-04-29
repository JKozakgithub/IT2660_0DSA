class Main {
  public static void main(String[] args) {
    String[] vertices = {"Liberal Arts", "Student Services", "Health Careers and Services", "Health Technologies Center", "Recreation Center", "Technology Learning Center", "Business & Technology", "Theatre"};

    int[][] edges = {
      {0,7},
      {0,1},
      {7,0},
      {7,6},
      {1,3},
      {1,5},
      {1,4},
      {6,7},
      {6,5},
      {6,1},
      {4,2},
      {4,3},
      {4,1},
      {4,5},
      {5,1},
      {3,2},
      {2,3},
      {2,4},
      {2,1},
      {2,5}
    };

    Graph<String> graph = new UnweightedGraph<>(vertices, edges);
    UnweightedGraph<String>.SearchTree dfs = graph.dfs(graph.getIndex("Business & Technology")); // Get a dfs starting at the Business and Technology Building. Change this is you called it something different in your vertices!

    java.util.List<Integer> searchOrders = dfs.getSearchOrder();
    System.out.println(dfs.getNumberOfVerticesFound() + " vertices are searched in this DFS order:");
    for (int i = 0; i < searchOrders.size(); i++)
      System.out.print(graph.getVertex(searchOrders.get(i)) + " ");
    System.out.println();

    for (int i = 0; i < searchOrders.size(); i++)
      if (dfs.getParent(i) != -1)
        System.out.println("parent of " + graph.getVertex(i) +
          " is " + graph.getVertex(dfs.getParent(i)));

    graph.printPath(3);
    graph.printPath(1);
    graph.printPath(4);
    graph.printTree();
  }
}

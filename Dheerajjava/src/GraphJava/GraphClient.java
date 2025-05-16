package GraphJava;

import java.util.HashMap;

public class GraphClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Graph graph = new Graph();
graph.addVertex("A");
graph.addVertex("B");
graph.addVertex("C");
graph.addVertex("D");
graph.addVertex("E");
graph.addVertex("F");
graph.addVertex("G");
graph.addEdge("A","B",2);
graph.addEdge("A","D",3);
graph.addEdge("B","C",1);
graph.addEdge("C","D",8);
graph.addEdge("D","E",9);
graph.addEdge("E","F",11);
graph.addEdge("E","G",19);
graph.addEdge("F","G",34);

graph.Display();
//System.out.println(graph.numEdges());
//System.out.println(graph.numVertex());
//graph.removeEdge("B", "C");
graph.removeEdge("D", "E");
//graph.Display();
//graph.removeVertex("A");
//graph.Display();
//
System.out.println(graph.hasPath("A","F",new HashMap()));
System.out.println("__________________");
graph.bfs("A", "F");
System.out.println("__________________");
graph.dfs("A", "F");
System.out.println("__________________");
graph.bft();
System.out.println("__________________");
graph.dft();
System.out.println("__________________");
System.out.println(graph.isCyclic());
System.out.println("__________________");
System.out.println(graph.isConnected());
System.out.println("__________________");
System.out.println(graph.isTree());
System.out.println("__________________");
graph.addVertex("H");
System.out.println(graph.getCC());

	}

}

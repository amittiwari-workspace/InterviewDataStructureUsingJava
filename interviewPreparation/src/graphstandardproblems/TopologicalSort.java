package graphstandardproblems;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*Applicable for Directed Acyclic Graph*/
public class TopologicalSort {

	private static boolean isDirectedGraph=true;
	private boolean[] visited;
	private Stack recursionStack=new Stack<Integer>();
	
	public TopologicalSort(int vertices) {
		super();
		visited=new boolean[vertices];
	}

	void topSortUtil(int index,Graph graph)
	{
		visited[index]=true;
		Iterator<Integer> adjList=graph.getEdgeAdjList(index);
		
		while(adjList.hasNext())
		{
			int item=adjList.next();
			if(!visited[item])
				{
					topSortUtil(item, graph);
				}
		}
		
		recursionStack.push(new Integer(index));
	}

	void topSort(Graph graph)
	{
			for(int i=0;i<graph.getVertices();i++)
			{
				if(!visited[i])topSortUtil(i,graph);
			}
			
			while(recursionStack.empty()==false)
			{
				System.out.println(" "+recursionStack.pop());
			}
	}
	
	public static void main(String[] args) {
		
		/* Creating a graph and initializing it */
		int vertices=4;
		Graph graph=new Graph(vertices,isDirectedGraph);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(2, 1);
		graph.addEdge(1, 3); 
		graph.addEdge(2, 3);	
		TopologicalSort topSort=new TopologicalSort(vertices);
		topSort.topSort(graph);
	}
}

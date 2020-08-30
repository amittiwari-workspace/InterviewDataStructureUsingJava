package graphstandardproblems;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class CycleInDirectedGraph {

	private static boolean isDirectedGraph=true;
	private boolean[] visited;
	private boolean setvisited[];
	
	public CycleInDirectedGraph(int vertices) {
		super();
		visited=new boolean[vertices];
		setvisited=new boolean[vertices];
	}

	boolean checkForCycle(int index,Graph graph)
	{
		if(setvisited[index]) return true;
		
		if(visited[index]) return false;
		
		visited[index]=true;
		setvisited[index]=true;
		
		
		Iterator<Integer> itr=graph.getEdgeAdjList(index);
		
		while(itr.hasNext())
		{
			int item=itr.next();
			if(checkForCycle(item, graph))
				return true;
		}
		
		setvisited[index]=false;
		return false;
	}

	boolean isCyclic(Graph graph)
	{
			for(int i=0;i<graph.getVertices();i++)
			{
				if(checkForCycle(i,graph))return true;
			}
	 return false;
	}
	
	public static void main(String[] args) {
		
		/* Creating a graph and initializing it */
		int vertices=4;
		Graph graph=new Graph(vertices,isDirectedGraph);
		graph.addEdge(1, 0);
		graph.addEdge(0, 2);
		graph.addEdge(2, 1);
		graph.addEdge(1, 3); 
		graph.addEdge(2, 3);	
		CycleInDirectedGraph traversal=new CycleInDirectedGraph(vertices);
		System.out.println(traversal.isCyclic(graph));

	}

}

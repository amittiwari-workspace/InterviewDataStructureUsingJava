package graphstandardproblems;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class GraphDFSTraversal {

	private static boolean isDirectedGraph=false;
	private boolean[] visited;
	
	public GraphDFSTraversal(int vertices) {
		super();
		visited=new boolean[vertices];
	}

	void DFSUtil(int index,Graph graph)
	{
		visited[index]=true;
		System.out.println(" "+index);
		
		Iterator<Integer> itr=graph.getEdgeAdjList(index);
		
		while(itr.hasNext())
		{
			int item=itr.next();
			if(!visited[item])
				{
					DFSUtil(item,graph);
				}
		}
	}

	private void DFS(Graph graph,int startIndex)
	{
		if(graph==null) return;
		else
		{
			for(int i=0;i<graph.getVertices();i++)
			{
				if(!visited[i])DFSUtil(i,graph);
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		/* Creating a graph and initializing it */
		int vertices=4;
		Graph graph=new Graph(vertices,false);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(2, 1);
		graph.addEdge(1, 3);
		graph.addEdge(2, 3);	
		GraphDFSTraversal traversal=new GraphDFSTraversal(vertices);
		traversal.DFS(graph, 0);

	}

}

package graphstandardproblems;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class GraphBFSTraversal {

	private static boolean isDirectedGraph=false;
	private boolean[] visited;
	
	public GraphBFSTraversal(int vertices) {
		super();
		visited=new boolean[vertices];
	}


	private void BFS(Graph graph,int startIndex)
	{
		if(graph==null) return;
		else
		{
			Queue<Integer> queue = new LinkedList<Integer>();
			
			queue.add(startIndex);
			visited[startIndex]=true;
			
			LinkedList<Integer>[] adj=graph.getEdges();
			
			while(!queue.isEmpty())
			{
				int vertex=queue.poll();
				System.out.println(" "+vertex);
				
				
				Iterator<Integer> itr=adj[vertex].listIterator();
				
				while(itr.hasNext())
				{
					int item=itr.next();
					if(!visited[item])
					{
						visited[item]=true;
						queue.add(item);
					}
				}
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
		GraphBFSTraversal traversal=new GraphBFSTraversal(vertices);
		traversal.BFS(graph,0);

	}

}

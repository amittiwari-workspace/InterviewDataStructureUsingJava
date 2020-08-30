package graphstandardproblems;

import java.util.LinkedList;
import java.util.ListIterator;

public class Graph {
	
	private int vertices;
	private LinkedList<Integer> edges[];
	private boolean isDirectedGraph;
	
	public Graph(int vertices,boolean isDirectedGraph) {
	
		super();
		this.vertices = vertices;
		this.edges=new LinkedList[vertices];
		this.isDirectedGraph=isDirectedGraph;
		
		for(int index=0;index<vertices;index++)
		{
			edges[index]=new LinkedList<Integer>();
		}
	}

	public int getVertices() {
		return vertices;
	}

	public void setVertices(int vertices) {
		this.vertices = vertices;
	}

	public LinkedList<Integer>[] getEdges() {
		return edges;
	}

	public ListIterator<Integer> getEdgeAdjList(int index) {
		return edges[index].listIterator();
	}
	public void setEdges(LinkedList<Integer>[] edges) {
		this.edges = edges;
	}
	
	public void addEdge(int start,int end)
	{
		edges[start].add(end);
		if(!isDirectedGraph)edges[end].add(start);
	}
}

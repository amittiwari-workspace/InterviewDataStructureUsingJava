package graphstandardproblems;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class GraphGenerics<T> {
	
	private List<Edges<T>> allEdges;
	private Map<Long, Vertex<T>> allVertex;
	boolean isDirected=false;
	
	public GraphGenerics(boolean isDirected) {
		allEdges=new ArrayList<Edges<T>>();
		allVertex=new HashMap<Long, Vertex<T>>();
		this.isDirected=isDirected;
		
	}
	public GraphGenerics(List<Edges<T>> allEdges, Map<Long,Vertex<T>> allVertex, boolean isDirected) {
		super();
		this.allEdges = allEdges;
		this.allVertex = allVertex;
		this.isDirected = isDirected;
	}
	
	public List<Edges<T>> getAllEdges() {
		return allEdges;
	}
	public void setAllEdges(List<Edges<T>> allEdges) {
		this.allEdges = allEdges;
	}
	public Map<Long, Vertex<T>> getAllVertex() {
		return allVertex;
	}
	
	public Collection<Vertex<T>> getAllVertexList() {
		return allVertex.values();
	}
	public void setAllVertex(Map<Long, Vertex<T>> allVertex) {
		this.allVertex = allVertex;
	}
	 
	public boolean isDirected() {
		return isDirected;
	}
	public void setDirected(boolean isDirected) {
		this.isDirected = isDirected;
	}
	public void addEdge(long id1,long id2,int edgeValue,boolean isDirected)
	{
		Vertex<T> vertex1=null;
		Vertex<T> vertex2=null;	
		if(allVertex.containsKey(id1))
		{
			vertex1=allVertex.get(id1);
		}
		else
		{
			vertex1=new Vertex<T>(id1);
			allVertex.put(id1,vertex1);
		}
		
		if(allVertex.containsKey(id2))
		{
			vertex2=allVertex.get(id2);
		}
		else
		{
			vertex2=new Vertex<T>(id2);
			allVertex.put(id2,vertex2);
		}

		Edges<T> edge=new Edges<T>(vertex1, vertex2, edgeValue, isDirected);
		
		allEdges.add(edge);
		
		vertex1.addAdjacentVertex(edge, vertex2);
		
		if(!isDirected)
		{
			vertex2.addAdjacentVertex(edge, vertex1);
		}	
		
	}
	static class Vertex<T>
	{
		private long id;
		private T vertexName;
		List<Edges<T>> edges=new ArrayList<Edges<T>>();
		List<Vertex<T>> adjacentVertex=new ArrayList<Vertex<T>>();
		
		
		public Vertex(long id) {
			super();
			this.id = id;
		}

		public Vertex(long id, T vertexName, List<Edges<T>> edges, List<Vertex<T>> adjacentVertex) {
			super();
			this.id = id;
			this.vertexName = vertexName;
			this.edges = edges;
			this.adjacentVertex = adjacentVertex;
		}
		
		
		public void addAdjacentVertex(Edges<T> e ,Vertex<T> v)
		{
			edges.add(e);
			adjacentVertex.add(v);
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public T getVertexName() {
			return vertexName;
		}

		public void setVertexName(T vertexName) {
			this.vertexName = vertexName;
		}

		public List<Edges<T>> getEdges() {
			return edges;
		}

		public void setEdges(List<Edges<T>> edges) {
			this.edges = edges;
		}

		public List<Vertex<T>> getAdjacentVertex() {
			return adjacentVertex;
		}

		public void setAdjacentVertex(List<Vertex<T>> adjacentVertex) {
			this.adjacentVertex = adjacentVertex;
		}	
		
	}
	static class Edges<T>
	{
		private Vertex<T> vertex1;
		private Vertex<T> vertex2;
		 int value;
		 boolean isDirectedGraph;
		
		public Edges(Vertex<T> vertex1, Vertex<T> vertex2, int value, boolean isDirectedGraph) {
			super();
			this.vertex1 = vertex1;
			this.vertex2 = vertex2;
			this.value = value;
			this.isDirectedGraph = isDirectedGraph;		
		}

		public Vertex<T> getVertex1() {
			return vertex1;
		}

		public void setVertex1(Vertex<T> vertex1) {
			this.vertex1 = vertex1;
		}

		public Vertex<T> getVertex2() {
			return vertex2;
		}

		public void setVertex2(Vertex<T> vertex2) {
			this.vertex2 = vertex2;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public boolean isDirectedGraph() {
			return isDirectedGraph;
		}

		public void setDirectedGraph(boolean isDirectedGraph) {
			this.isDirectedGraph = isDirectedGraph;
		}
		
	}
}

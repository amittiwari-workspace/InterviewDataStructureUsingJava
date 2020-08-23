package graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import graph.Graph.Vertex;


public class GraphBFSTraversal {
    
    public void BFS(Graph<Integer> graph){
       
    	
    	Set<Long> visited = new HashSet<Long>();
        Queue<Vertex<Integer>> queue = new LinkedList<Vertex<Integer>>();
        
        for(Vertex<Integer> vertex: graph.getAllVertexList()){
           
        	if(!visited.contains(vertex.getId())){
                
                visited.add(vertex.getId());
                queue.add(vertex);
                
                while(!queue.isEmpty()){
                	
                    Vertex<Integer> queuePoll = queue.poll();
                    
                    System.out.println(queuePoll.getVertexName());
                    
                    for(Vertex<Integer> v : queuePoll.getAdjacentVertex()){
                      
                    	if(!visited.contains(v.getId())){
                           
                    		queue.add(v);
                            visited.add(v.getId());
                        }
                    }
                }
            }
        }
        
    }
	public static void main(String[] args) {
		
		GraphBFSTraversal graphTraveral=new GraphBFSTraversal();
		boolean isDirected=false;
		
		Graph<Integer> graph = new Graph<Integer>(isDirected);
		
		graph.addEdge(1, 2, 3, isDirected);
		graph.addEdge(4, 2, 5, isDirected);
		graph.addEdge(3, 2, 1, isDirected);
		graph.addEdge(4, 3, 2, isDirected);
		
		graphTraveral.BFS(graph);
		

	}

}

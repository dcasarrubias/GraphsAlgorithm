
import java.util.*;

public class GraphAlgorithms {
	Set<Integer> visited; // will be used to mark all the nodes that have been visited. 
	Set<Integer> unvisited; // will be used to mark all the nodes that have not been visited. 
	
	public GraphAlgorithms(){
		visited = new HashSet<Integer>(); // initializes the visited hashset
		unvisited = new HashSet<Integer>(); // initializes the unvisited hashset
		
	}	
	public static void main(String [] args){
		GraphAlgorithms g = new GraphAlgorithms();
		
		int [][] graph = {{0, 3, 4, 5}, {2, 8, 12, 9, 1}};
		
		g.processGraph(graph,1,5, 10);
	}

	
	public int processGraph(int[][] graph, int algorithm, int s, int d){
		
		if(algorithm == 1){ // if the user selects the first algorithm, call the Dijkstra's algorithm method and send the values passed by the user
			processDijkstra(graph, s, d);
		}
		else if(algorithm == 2){
			processAStar(graph, s, d);
		}
		else{
			System.out.println("You did not enter a valid option: ");
		}
		
		return 0;
	}
	public int processDijkstra(int [][] graph, int s, int d){
		int cost = 0;
		int currentNode;
		s = 0;
		currentNode = s; // set initial node as the current node
		
		//Integer x = Integer.MAX_VALUE;
		//Integer y = Integer.MAX_VALUE;
		
		
		
		//nodes.put(s, true); // sets initial node to true which means it has been visited. 
		
		visited.add(s); // sets initial node to visited. S = initial node
		
		System.out.println("Length of array is" + " " + graph.length);
		
		
		
		//sets all other nodes to not visited. 
		for(int i = 0; i < graph.length; i++){
			for(int j = 0; j < graph[i].length; j++){
				//System.out.print(graph[i][j] + " "); // prints out all elements in array
				unvisited.add(graph[i][j]);		
		}
		}
		
		System.out.println("Visited nodes" + visited);
		System.out.println("Unvisited nodes " +unvisited);
		
		return cost;
	}
	
	public int processAStar(int [][] graph, int s, int d){
		return 0;
	}
}

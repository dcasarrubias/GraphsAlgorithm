import java.util.*;

public class GraphAlgorithms {
	//Set<Integer> visited; // will be used to mark all the nodes that have been visited. 
	//Set<Integer> unvisited; // will be used to mark all the nodes that have not been visited. 
	  PriorityQueue<Integer> visited; 
	  PriorityQueue<Integer> unvisited;
	  
	public GraphAlgorithms(){
		visited = new PriorityQueue<Integer>(); // initializes the visited hashset
		unvisited = new PriorityQueue<Integer>(); // initializes the unvisited hashset
		
	}	
	public static void main(String [] args){
		GraphAlgorithms g = new GraphAlgorithms();
		
		int [][] graph = {{0, 0, 1, 0}, {0,0,1,0,1}};
		

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
	public int[] processDijkstra(int [][] graph, int s, int d){
		int cost = 0;
		int currentNode;
		int numberOfNodes;
		int [] dist = new int[200];
		s = 0;
		currentNode = s; // set initial node as the current node
		
		
		//Integer x = Integer.MAX_VALUE;
		//Integer y = Integer.MAX_VALUE;
		
		
		
		//nodes.put(s, true); // sets initial node to true which means it has been visited. 
		
		
		System.out.println("Length of array is" + " " + graph.length);
		
		/*
		for(int i = 0; i < graph.length; i++){
			for(int j = 0; j < graph[i].length; j++ )
			dist[i & j] = Integer.MAX_VALUE;
			
		}
		
		*/
		//for(int i : unvisited){
			//dist[i] = Integer.MAX_VALUE;
		//}
		
		for(int i : dist){
			System.out.println("Elements in distance " + i);
		}
		
		/*
		for(int i = 0; i < graph.length; i++){
			for(int j = 0; j < graph[i].length; j++ )
			System.out.println( " Distance is " + graph[i][j] + " ");
			
		}
		*/
		dist[s] = 0;
		visited.add(s); // sets initial node to visited. s is the initial node

		//sets all other nodes to not visited. 
		for(int i = 0; i < graph.length; i++){
			for(int j = 0; j < graph[i].length; j++){
				unvisited.add(graph[i][j]); // and add all the other elements to the univisited
		}
			
		}
		

		if(unvisited.contains(s)){ // if the source value is present in the unvisited list
				unvisited.remove(s); // remove it
			
			}
		
		
		System.out.println("Visited nodes" + visited);
		System.out.println("Unvisited nodes " +unvisited);
		
		return dist;
	}
	
	public int processAStar(int [][] graph, int s, int d){
		return 0;
	}
}

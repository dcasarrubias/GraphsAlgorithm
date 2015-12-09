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
		
		int [][] graph = {{0, 1, 0, 1}, {1, 0, 0, 1}};
		
		g.processGraph(graph,1,5, 10);
	}

	
	public int processGraph(int[][] graph, int algorithm, int s, int d){
		
		if(algorithm == 1){ // if the user selects the first algorithm, call the Dijkstra's algorithm method and send the values passed by the user
			System.out.println(processDijkstra(graph, s, d));
		}
		else if(algorithm == 2){
			processAStar(graph, s, d);
		}
		else{
			System.out.println("You did not enter a valid option: ");
		}
		
		return 0;
	}
	public String processDijkstra(int [][] graph, int s, int d){
		int cost = 0;
		int currentnode = 0;  // set initial node as the current node
		int distance = 0;
		int verticies = 0;
		Stack <Integer> pathway = new Stack <Integer>();
		
		//Integer x = Integer.MAX_VALUE;
		//Integer y = Integer.MAX_VALUE;
		
		
		
		//nodes.put(s, true); // sets initial node to true which means it has been visited. 
		// sets initial node to visited. S = initial node
		
		System.out.println("The inputed array has a dimension of " + graph[0].length + "*" + graph[1].length + ".");
		
		
		
		//sets all other nodes to not visited. 
		for(int i = 0; i < graph[0].length; i++){
			for (int j = 0; j < graph[1].length; j++){
			   if (graph[i][j] != 0){
				   verticies += 1;
			   }
			}
		}
		
		if (verticies <= 2){
			StringBuilder result = new StringBuilder();
			int first = 0;
			int second = 0;
			if (d > s){
				first = s;
				second = d;
			} else {
				first = d;
				second = s;
			}
				result.append("[" + Integer.toString(first) + "," + Integer.toString(second) + "]");
				if (graph[first][0] != 0){
					result.append(" " + Integer.toString(graph[first][0]));
				} else {
					result.append(" " + Integer.toString(graph[first][1]));
				}
				
				return result.toString();
			}
		

		for (int i = 0; i < graph[0].length; i++){
				unvisited.add(i);	
		}
		
		currentnode = s;
		int runtime = 0;
		

		while (unvisited.contains(d)) {
			int closest = 0;
			distance = 0;
			int prevdistance = 0;
			visited.add(s);
			System.out.println("running..." + currentnode);
			
			for (int i = 0; i < graph[currentnode].length; i++){
				if (graph[currentnode][i] == 1){
					distance = Math.abs(currentnode - i);
					if ((prevdistance == 0 || distance < prevdistance) && unvisited.contains(i)){
						closest = i;
					}
					prevdistance = distance;
				}
			}
			
			currentnode = closest;
			
			if (unvisited.contains(currentnode)){
				visited.add(currentnode);
				unvisited.remove(currentnode);
				System.out.println(unvisited);
			}
		}
		
		
		System.out.println("");
		
		System.out.println("Visited nodes " + visited);
		System.out.println("Unvisited nodes " +unvisited);
		
		return Integer.toString(currentnode);
	}
	
	public int processAStar(int [][] graph, int s, int d){
		return 0;
	}
}

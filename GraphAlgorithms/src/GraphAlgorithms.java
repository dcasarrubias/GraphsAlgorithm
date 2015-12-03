
import java.util.*;

public class GraphAlgorithms {
	//ArrayList<Integer>visited = new ArrayList<Integer>();
	//ArrayList<Integer>unvisited = new ArrayList<Integer>();
	Map<Integer, Boolean>nodes = new HashMap<Integer, Boolean>();
	
	public static void main(String [] args){
		GraphAlgorithms g = new GraphAlgorithms();
		
		int [][] graph = {{0, 3, 4, 5}, {2, 8, 12, 9, 1}};
		
		g.processGraph(graph,1,5, 10);
	}
	public GraphAlgorithms(){
		
	}
	
	public int processGraph(int[][] graph, int algorithm, int s, int d){
		
		if(algorithm == 1){
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

		nodes.put(s, true); // sets initial node to true which means it has been visited. 
		
		System.out.println("Length of array is" + " " + graph.length);
		
		
		for(int i = 0; i < graph.length; i++){
			for(int j = 0; j < graph.length; j++){
				nodes.put(graph[i][j], false);
		}
		}
		
		System.out.println(nodes);
		
		return cost;
	}
	
	public int processAStar(int [][] graph, int s, int d){
		return 0;
		//
	}
}


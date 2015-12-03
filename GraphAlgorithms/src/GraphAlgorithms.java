
public class GraphAlgorithms {
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
		
		return cost;
	}
	
	public int processAStar(int [][] graph, int s, int d){
		return 0;
	}
}

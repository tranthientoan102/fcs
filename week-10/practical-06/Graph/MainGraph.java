package Graph;

public class MainGraph {

	public static void main(String[] args) {
		MyGraph graph = new Graph.MyGraph();
		int[][] data = {
				 		{0,1,0,0,1},
				 		{1,0,1,1,1},
						{0,1,0,1,0},
				 		{0,1,1,0,1},
				 		{1,1,0,1,0}
		};
		graph.matrixToList(data);
		graph.displayAdjListArray();
	}

}

package Graph;

import java.util.*;
public class MyGraph {

	List[] adjListArray;


	public MyGraph(){

	}

	/**
	 * transform an adjacency matrix to an adjacency list
	 *
	 * @param matrix
	 */
	public void matrixToList(int[][] matrix){
		int numNode = matrix[0].length;
		adjListArray = new MyLinkedList[numNode];
		for (int i=0; i < numNode; i++){
			adjListArray[i] = new MyLinkedList();
			for (int j = 0; j < numNode; j++){
				if ( j != i && matrix[i][j] ==1 ){
					adjListArray[i].add(new Node(j));
				}
			}
		}


	}

	/**
	 * Print out the adjacency list array
	 *
	 */
	public void displayAdjListArray(){
		int i = 0;
		String result = "";
		for (List list: adjListArray){
			result += String.format("%d: %s\n", i++, list.toString());
		}
		System.out.println(result);
	}
}

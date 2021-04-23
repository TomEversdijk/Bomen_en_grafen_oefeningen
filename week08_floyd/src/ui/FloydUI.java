package ui;
import java.util.List;

import domain.WeightedGraph;
public class FloydUI {
	static final double infty = WeightedGraph.infty;
	public static void main(String[] args) {
		
		double [][] matrix = {{0,1,infty,1,5},{9,0,3,2,infty},{infty,infty, 0, 4, infty},{infty,infty,2,0,3},{3,infty,infty,infty,0}};
		//double[][] matrix = {{0,2,3,11,infty},{infty,0,infty,7,infty},{infty,infty,0,4,infty},{infty,infty,infty,0,1},{infty,infty,infty,infty,0}};
		
		printDoubleMatrix(matrix);
		
		WeightedGraph g = new WeightedGraph(matrix);
		int[][] p_matrix = g.getPointerMatrix();
		printIntMatrix(p_matrix);
		
		String result = "Kortste paden: \n";
		for (int i = 1; i <= matrix.length; i++) {
			for (int j = 1; j <= matrix.length; j++) {
				List<Integer> pad = g.getShortestPath(i, j, p_matrix);
				
				if (pad.size() == 0)
					result += "Er is geen pad van " + i + " naar " + j  + "\n";
				else
					result += "Kortste pad van " + i  + " naar " + j  + " lengte = " + g.berekenLengte(pad) + " via : " + pad + "\n";
			}
			result += "\n";
		}
		
		System.out.println(result);
	}

	private static void printIntMatrix(int[][] matrix) {
		String result = "p_matrix: \n";
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				result += (matrix[i][j] == infty ? "inf" : matrix[i][j]) + "\t";
			}
			result += "\n";
		}
		result += "\n";
		
		System.out.println(result);		
	}

	private static void printDoubleMatrix(double[][] matrix) {
		String result = "gewichtenmatrix: \n";
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				result += (matrix[i][j] == infty ? "inf" : matrix[i][j]) + "\t";
			}
			result += "\n";
		}
		result += "\n";
		
		System.out.println(result);
	}

}

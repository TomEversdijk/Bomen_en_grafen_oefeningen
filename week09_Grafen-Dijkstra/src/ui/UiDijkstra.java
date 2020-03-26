package ui;

import domain.Graph;

public class UiDijkstra {

	public static void main(String[] args) {
		// voorbeeld uit de cursus met extra knoop 9. In deze knoop komt geen
		// enkele verbinding aan.
		int[][] gewichtenMatrix = {
				{ 0, 5, 9, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE,
						Integer.MAX_VALUE, Integer.MAX_VALUE },
				{ 5, 0, 3, 8, 10, 11, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE },
				{ 9, 3, 0, 2, Integer.MAX_VALUE, Integer.MAX_VALUE, 7, Integer.MAX_VALUE, Integer.MAX_VALUE },
				{ Integer.MAX_VALUE, 8, 2, 0, Integer.MAX_VALUE, 3, 7, Integer.MAX_VALUE, Integer.MAX_VALUE },
				{ Integer.MAX_VALUE, 10, Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 1, Integer.MAX_VALUE, 8,
						Integer.MAX_VALUE },
				{ Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 3, 1, 0, 5, 10, Integer.MAX_VALUE },
				{ Integer.MAX_VALUE, Integer.MAX_VALUE, 7, 7, Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 12,
						Integer.MAX_VALUE },
				{ Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 8, 10, 12, 0,
						Integer.MAX_VALUE },
				{ 1, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE,
						Integer.MAX_VALUE, Integer.MAX_VALUE, 0 } };
		Graph g = new Graph(gewichtenMatrix);
		System.out.println(g.berekenPaden(1));
	}

}

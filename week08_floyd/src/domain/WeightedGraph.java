package domain;

import java.util.ArrayList;
import java.util.List;

public class WeightedGraph {
	private final double[][] gewichtenMatrix;
	public final static double infty = Double.POSITIVE_INFINITY;

    public WeightedGraph(double[][] matrix) {
        if (!isGeldigeGewichtenmatrix(matrix))
            throw new IllegalArgumentException("No valid gewichtenmatrix");
        this.gewichtenMatrix = matrix;
    }

    private boolean isGeldigeGewichtenmatrix(double[][] matrix) {
        return matrix != null && matrix.length == matrix[0].length;
    }

    private int getAantalKnopen() {
        return gewichtenMatrix.length;
    }

    public int[][] getPointerMatrix() {
        int[][] pointerMatrix = new int[getAantalKnopen()][getAantalKnopen()];
        double[][] DMatrix = this.gewichtenMatrix.clone();

        for (int tussenknoop = 0; tussenknoop < getAantalKnopen(); tussenknoop ++){
            for(int van = 0; van < getAantalKnopen(); van ++){
                for(int naar = 0; naar < getAantalKnopen(); naar++){
                    if (DMatrix[van][naar] > DMatrix[van][tussenknoop] + DMatrix[tussenknoop][naar]){
                        DMatrix[van][naar] = DMatrix[van][tussenknoop] + DMatrix[tussenknoop][naar];
                        pointerMatrix[van][naar] = tussenknoop + 1;
                    }
                }
            }
        }
		return pointerMatrix;
	}

	public List<Integer> getShortestPath(int i, int j, int[][] pointer) {
        List<Integer> res = new ArrayList<>();
        
        if (i == 0) {
            res.add(j);
            return res;
        }
        else if (j == 0) {
            res.add(i);
            return res;
   
        }
        if (i == j) {
            return res;
        }
        System.out.println("Van: " + i + " Naar: " + j);
        int tussenknoop = pointer[i - 1][j - 1] ;
        System.out.println("Tussenstation: " + tussenknoop);
        res.addAll(getShortestPath(i, tussenknoop , pointer));
        res.addAll(getShortestPath(tussenknoop, j, pointer));
		return res;

	}

	public int berekenLengte(List<Integer> pad) {
		int som = 0;
	
		return som;
	}

}

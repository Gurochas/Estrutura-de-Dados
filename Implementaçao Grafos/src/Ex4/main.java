package Ex4;

/*
 * 4)Escreva um programa que receba como entrada uma matriz de adjacências para o grafo não-direcionado 
 *   em sua forma triangular inferior, conforme ilustrado abaixo e retorne a matriz completa, obtendo a parte superior considerando a simetria.
 *	0 
 *	1 0
 *	0 1 0
 *	0 1 1 0
 *	1 1 0 1 0
 *	0 0 1 1 1 0 
 */

public class main {
	
	public static void main (String args [])
	{
		int [][] mat = {{0,0,0,0,0,0},{1,0,0,0,0,0},{0,1,0,0,0,0},{0,1,1,0,0,0},{1,1,0,1,0,0},{0,0,1,1,1,0}};
		
		for(int i = 0; i < mat.length;i++) {
			for(int j = 0; j < mat[0].length;j++) {
				if((i - j) >= 0) {
					mat[j][i] = mat[i][j];
				}
			}
		}
		for(int i = 0; i < mat.length;i++) {
			System.out.println(" ");
			for(int j = 0; j < mat[0].length;j++) {
				System.out.print(mat[i][j] + " | ");
			}
		}
	}
}
package Ex3;

/*
 * 3)Escreva  um programa que receba como entrada uma matriz de adjacências de um grafo simples, ponderado e conexo
 *   e escreva como saída as arestas (na forma de pares ordenados e dê seus pesos). 
 */

public class main {
	
	public static void main (String args [])
	{
		int [][] mat = {{0,2,0,7},{2,0,8,0},{0,8,0,1},{7,0,1,0}};
		
		for(int i = 0; i < mat.length;i++) {
			for(int j = 0; j < mat[0].length;j++) {
				System.out.println("("+ i + "," + j + ") -> " + mat[i][j]);
			}
		}
	}
}

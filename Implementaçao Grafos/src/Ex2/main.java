package Ex2;
/*
 * 2) - Escreva um programa que receba como entrada um n�mero inteiro n correspondente ao n�mero de v�rtices 
 *    - apresente como sa�da a matriz e a  lista de adjac�ncias para o grafo completo Kn. 
 */

import javax.swing.JOptionPane;

public class main {
	
	public static void main (String args [])
	{
		int vertices = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero de v�rtices"));
		int [][] mat = new int [vertices][vertices];
		
		for(int i = 0; i < mat.length;i++) {
			System.out.println(" ");
			for(int j = 0; j < mat[0].length;j++) {
				if(i == j) mat[i][j] = 0;
				else mat[i][j] = 1;
				System.out.print(mat[i][j] + " | ");
			}
		}

		System.out.println(" \n ");

		for(int i = 0; i < mat.length;i++) {
			System.out.print(i + " -> ");
			for(int j = 0; j < mat[0].length;j++) {
				if(mat[i][j] == 1) System.out.print(j + " -> ");
			}
			System.out.println(" ");
		}
	}

}

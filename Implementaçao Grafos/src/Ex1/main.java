package Ex1;

/*	Nome: Gustavo Rocha de Souza
 *  Data: 30/05/2020
 *  1-) Escreva um programa para ler como entrada uma matriz de adjac�ncias de    
 *  um grafo e responder as seguintes perguntas?
 *  -	a) Quais s�o as arestas do grafo?
 *  -	b) � um d�grafo ou um grafo n�o-direcionado?
 *  -	c) Qual � o grau de cada v�rtice?
 *  -	d) Qual � a lista de adjac�ncias do mesmo grafo?
 */
/*
0	1	0	0
0	0	1	1
0	0	0	1
0	0	1	0
 */

public class main {

	public static void main(String[] args) 
	{
		int [][] mat = {{0,1,0,0},{0,0,1,1},{0,0,0,1},{0,0,1,0}};
		
		// a) Quais s�o as arestas do grafo?
		System.out.println("a) Arestas do grafo s�o: ");
		for(int i = 0; i < mat.length;i++) {
			for(int j = 0; j < mat[0].length;j++) {
				if(mat[i][j] == 1) System.out.print("("+ i + "," + j + ")");
			}
		}//--------------------------------------------------------------------
		
		System.out.println("\n-------------------------------");
		
		// b) � um d�grafo ou um grafo n�o-direcionado?
		boolean digrafo = false;
		for(int i = 0; i < mat.length;i++) {
			for(int j = 0; j < mat[0].length;j++) {
				if(mat[i][j] != mat[j][i]) {
					digrafo = true;  
					break;
				}
				if(digrafo) break;
			}
		}
		System.out.println("b) O grafo �:");
		if(digrafo) System.out.print("Digrafo");
		else System.out.print("N�o-direcionado");
		//---------------------------------------------------------------------
		
		System.out.println("\n-------------------------------");
		
		// c) Qual � o grau de cada v�rtice?
		System.out.println("c) Qual � o grau de cada v�rtice?");
		if(!digrafo) {
			int grau [] = new int [mat.length];
			for(int i = 0; i < mat.length;i++) {
				for(int j = 0; j < mat[0].length;j++) {
					if((i - j) <= 0) {
						grau[i] += mat[i][j];
					}
				}
				System.out.println("Grau do v�rtice " + i + ": " + grau[i]);
			}
		}else {
			int [] grauIn = new int [mat.length];
			int [] grauOut = new int [mat.length];
			for(int i = 0; i < mat.length;i++) {
				for(int j = 0; j < mat[0].length;j++) {
					grauIn[j] += mat[i][j];
					grauOut[i] += mat[i][j];
				}
			}
			for(int i = 0; i < mat.length;i++) {
				System.out.println("+ Grau de entrada do vertice " + i + ":\t " + grauIn[i] +
							     "\n- Grau de sa�da do vertice " + i + ":\t " + grauOut[i]);
			}
		}
		//---------------------------------------------------------------------
		
		System.out.println("-------------------------------");
		
		// d) Qual � a lista de adjac�ncias do mesmo grafo?
		System.out.println("d) Qual � a lista de adjac�ncias do mesmo grafo?");
		for(int i = 0; i < mat.length;i++) {
			System.out.print(i + " -> ");
			for(int j = 0; j < mat[0].length;j++) {
				if(mat[i][j] == 1) System.out.print(j + " -> ");
			}
			System.out.println(" ");
		}
		//---------------------------------------------------------------------
	}

}
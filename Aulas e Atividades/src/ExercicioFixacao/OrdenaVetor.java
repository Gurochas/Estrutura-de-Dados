package ExercicioFixacao;

/*
 * Implemente  um  programa  que  leia  20  n�meros  e  armazene-os em um vetor. 
 * Pe�a ao usu�rio que  digite  um  n�mero  qualquer  dos  20  digitados  e  fa�a  uma  busca  seq�encial  neste  vetor antes  de  orden�-lo.  
 * Mostre  ao  usu�rio  a  posi��o  em  que  este  n�mero  foi  encontrado  
 * e  a quantidade  de  vezes  que  o  FOR  foi  executado  para  encontrar  o  n�mero.  
 * Depois  ordene  este vetor e realize novamente a busca seq�encial e mostre novamente os resultados.
 * 
*/

public class OrdenaVetor {
	
	public static void main (String args[])
	{
		int [] vA = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
		
		int n = 45;
		int c1, c2;
		c1 = encontra(n, vA);	
		ordena(vA);
		c2 = encontra(n, vA);
		System.out.println("Com o vetor desordenado o FOR foi execultado: " + c1 + " vezes.");
		System.out.println("Com o vetor ordenado o FOR foi execultado: " + c2 + " vezes.");
	}

	private static int [] ordena(int[] vA) {
		for(int i = 0; i < 20; i++) {
			for(int j = i+1; j < 20; j++) {
				if(vA[i] > vA[j]) {
					int aux = vA[i];
					vA[i] = vA[j];
					vA[j] = aux;
				}
			}
		}
		return vA;
	}

	private static int encontra(int n, int [] vA) {
		for(int i = 0; i < 20; i++) {
			if(n == vA[i]) {
				return i;
			}
		}
		return -1;
	}
}

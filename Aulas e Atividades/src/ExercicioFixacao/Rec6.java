package ExercicioFixacao;

/*
 * 6. Implemente um programa que crie um vetor A de 10 posições, um vetor B de 10 posições e um vetor  C  com  10  posições.  
 * Receba  os  valores  para  o  vetor  A  e  vetor  B.  
 * Faça  as  seguintes operações com os vetores:
 * 	• Vetor C = vetor A + vetor B
 * 	• Vetor C = vetor A - vetor B
 * 	• Vetor C = vetor A * vetor B 
 * 	• Vetor C = vetor A / vetor B
 */

public class Rec6 {

	public static void main(String[] args) {
		
		int [] vA = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int [] vB = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
		int [] vC = new int [10];
		
		vC = somaVet(vA, vB, vC, 0);
		vC = subVet(vA, vB, vC, 0);
		vC = mulVet(vA, vB, vC, 0);
		vC = divVet(vA, vB, vC, 0);
	}

	private static int[] somaVet(int[] vA, int[] vB, int[] vC, int i) {
		if(i == 10) return vC;
		else {
			vC[i] = vA[i] + vB[i]; 
			return somaVet(vA, vB, vC, i+1);
		}
	}

	private static int[] subVet(int[] vA, int[] vB, int[] vC, int i) {
		if(i == 10) return vC;
		else {
			vC[i] = vA[i] - vB[i]; 
			return somaVet(vA, vB, vC, i+1);
		}
	}

	private static int[] mulVet(int[] vA, int[] vB, int[] vC, int i) {
		if(i == 10) return vC;
		else {
			vC[i] = vA[i] * vB[i]; 
			return somaVet(vA, vB, vC, i+1);
		}
	}

	private static int[] divVet(int[] vA, int[] vB, int[] vC, int i) {
		if(i == 10) return vC;
		else {
			vC[i] = vA[i] / vB[i]; 
			return somaVet(vA, vB, vC, i+1);
		}
	}
}

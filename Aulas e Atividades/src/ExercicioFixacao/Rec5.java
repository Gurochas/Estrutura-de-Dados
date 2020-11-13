package ExercicioFixacao;

/*
 * 5.Implemente um programa que receba do usuário um número qualquer N. 
 * As seguintes funções recursivas:
 *  a. Para mostrar os números de 1 até N
 *  b. Para mostrar os números de N até 1
*/

import javax.swing.JOptionPane;

public class Rec5 {
	
	public static void main (String [] args)
	{
		int n = (Integer.parseInt(JOptionPane.showInputDialog("Digite um número")));
		vaiN(n, 1);
		vemN(n);
	} 

	private static int vaiN(int n, int i) {
		if(i == n + 1) return n;
		else {
			System.out.println(i);
			return vaiN(n, i + 1);
		}
	}

	private static int vemN(int n) {
		if(n == 0) return n;
		else {
			System.out.println(n);
			return vemN(n - 1);
		}
	}
}

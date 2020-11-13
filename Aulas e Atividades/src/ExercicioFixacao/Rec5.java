package ExercicioFixacao;

/*
 * 5.Implemente um programa que receba do usu�rio um n�mero qualquer N. 
 * As seguintes fun��es recursivas:
 *  a. Para mostrar os n�meros de 1 at� N
 *  b. Para mostrar os n�meros de N at� 1
*/

import javax.swing.JOptionPane;

public class Rec5 {
	
	public static void main (String [] args)
	{
		int n = (Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero")));
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

package ExercicioFixacao;
/*
 * 2.Escrevaum programa que solicite do usuário um valor N sendo este passado para uma função denominada verNumPar  
 * que  imprime somente  os  valores  pares  passado  como argumento  de 1  até  N.  
 * Para  tanto,  verNumPar  chama  uma  outra  função denominada verPar  que  verifica  se  um  número  é  par,
 * se  for  deverá  retornar1  ou  não  neste  caso retorna 0.
 */

import javax.swing.JOptionPane;

public class VerificaPares {

	public static void main(String[] args) 
	{
		verNumPar((Integer.parseInt(JOptionPane.showInputDialog("Digite um número"))));
		JOptionPane.showMessageDialog(null,"dsad");
	}

	private static int verNumPar(int n){
		if(n == 1) return 1;
		if(verPar(n)) System.out.println(n);
		return verNumPar(n-1);

	}

	private static boolean verPar(int n) {
		if(n % 2 == 0) return true;
		return false;
	}

}

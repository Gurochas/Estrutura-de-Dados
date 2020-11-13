package ExercicioFixacao;

/*
 * 4. Implementeuma fun��o recursiva para calcular a divis�o inteira de A por B, utilizando apenas subtra��es.
 * Esta  fun��o  denominada  divis�o  dever�  receber  como  argumento dois valores inteiros.
 * Se a �b < b ent�o f = 1
 * Se n�o f = f (a � b, b) + 1
 */

public class DivisaoRec {
		
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 5;
		System.out.println(divisao(a, b));
	}

	private static int divisao(int a, int b) {
			if((a - b) < b) return 1;
			return divisao(a - b, b) + 1;
	}
}
package ExercicioFixacao;

/*
 * 4. Implementeuma função recursiva para calcular a divisão inteira de A por B, utilizando apenas subtrações.
 * Esta  função  denominada  divisão  deverá  receber  como  argumento dois valores inteiros.
 * Se a –b < b então f = 1
 * Se não f = f (a – b, b) + 1
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
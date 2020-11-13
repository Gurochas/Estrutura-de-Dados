package ExercicioFixacao;

/*
 * Implementeuma função recursiva para calcular a multiplicação de dois número inteiros (a,  b) 
 * passados  como  argumentos  de  uma  função  denominada  multiplicação.  
 * Esta multiplicação deverá ser realizada por meio de somas.
 * Se b = 1então f = a
 * Se não f = f (a, b -1) + a
 */

public class MultiplicacaoRec {
	
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 5;
		System.out.println(multiplicacao(a, b));
	}

	private static int multiplicacao(int a, int b) {
		if(b == 1) return a;
		return multiplicacao(a, b - 1) + a;
	}
}

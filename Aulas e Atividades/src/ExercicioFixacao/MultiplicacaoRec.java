package ExercicioFixacao;

/*
 * Implementeuma fun��o recursiva para calcular a multiplica��o de dois n�mero inteiros (a,  b) 
 * passados  como  argumentos  de  uma  fun��o  denominada  multiplica��o.  
 * Esta multiplica��o dever� ser realizada por meio de somas.
 * Se b = 1ent�o f = a
 * Se n�o f = f (a, b -1) + a
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

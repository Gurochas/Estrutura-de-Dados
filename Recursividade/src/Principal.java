
public class Principal {
	
	//Escreva um programa Java que resultará em todos os subconjuntos de um conjunto de n elementos (sem repetir nenhum conjunto).
	
	//Algoritmo recursivo que encontra o menor elemento de um vetor de inteiros sem usar nenhum laço.
	
	//Escreva um método recursive Java que pega um String s e exibe seu inverso. Por exemplo, o inverso de “post&pans” será “snap&stop”.
	
	//Escreva um método recursive que determina se uma String s é um palíndrome, isto é, se é igual ao seu
	//inverso. Exemplo: arara (escrita da esquerda para a direita e da direita para a esquerda é A-R-A-R-A.
	
	//Use recursão para escrever um método para determinar se uma string S tem vogais consoantes.
	
	public static void main (String [] args)
	{
		int [] v = {7, 36, 48, 25, 12, 69, 66, 13, 17, 25, 6, 3, 142, 51, 23, 8, 86};
		System.out.println("O menor valor do vetor será: " + menorValor(v, 0, v[0]));
		System.out.println("O menor valor do vetor será: " + menorValor1(v, 0, v.length));
	}
	
	//Algoritmo recursivo que encontra o menor elemento de um vetor de inteiros sem usar nenhum laço.
	private static int menorValor(int [] v, int i, int menor) {
		if(i == v.length) {
			return menor;
		}else {
			if(menor > v[i]) return menorValor(v, i + 1, v[i]);
			return menorValor(v, i + 1, menor);
		}
	}
	
	private static int menorValor1(int [] v, int inicio, int fim) {
		int meio = (inicio+fim)/2;
		int n1, n2;
		if(meio>inicio) {
			n1 = menorValor(v, inicio, meio);
			n2 = menorValor(v, meio+1, fim);
		}else {
			n1 = v[inicio];
			n2 = v[fim];
		}
		if (n1 > n2) return n1; else return n2;
	}
	
}

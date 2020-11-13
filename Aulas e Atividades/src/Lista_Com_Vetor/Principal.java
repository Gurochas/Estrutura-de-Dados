package Lista_Com_Vetor;

public class Principal {
	
	public static void main (String [] args)
	{
		Vetor Vetor = new Vetor();
		
		Aluno a1 = new Aluno("Gustavo","7456",21);
		Aluno a2 = new Aluno("Gabriel","9571",25);
		Aluno a3 = new Aluno("Henrique","1562",68);
		Aluno a4 = new Aluno("Lucas","4158",22);
		Aluno a5 = new Aluno("Dennis","4564",19);
		Aluno a6 = new Aluno("Vagner","6528",20);
		Aluno a7 = new Aluno("Pedro","5921",23);
		
		Vetor.adiciona(a1);
		Vetor.adiciona(a2);
		Vetor.adiciona(a3);
		Vetor.adiciona(a4);
		Vetor.adiciona(a5);
		Vetor.adiciona(a6);
		
		if(Vetor.tamanho() != 6) {
			System.out.println("1 Erro: O tamanho da lista está errado.");
		}
		
		if(!Vetor.contem(a3)) {
			System.out.println("1 Erro: Não achou um aluno que deveria estar na lista.");
		}
		
		if(Vetor.pega(2) != a3) {
			System.out.println("1 Erro: Não retornou o aluno correto.");
		}
		
		Vetor.remove(2);
		
		if(Vetor.tamanho() != 5) {
			System.out.println("2 Erro: O tamanho da lista está errado.");
		}
		
		if(Vetor.contem(a3)) {
			System.out.println("2 Erro: Achou um aluno que NÃO deveria estar na lista.");
		}
		
		if(Vetor.contem(a7)) {
			System.out.println("3 Erro: Achou um aluno que NÃO deveria estar na lista.");
		}
		
		Vetor.adiciona(a7);
		
		if(Vetor.tamanho() != 6) {
			System.out.println("3 Erro: O tamanho da lista está errado.");
		}
		
		if(!Vetor.contem(a7)) {
			System.out.println("3 Erro: Achou um aluno que NÃO deveria estar na lista.");
		}
		
		Vetor.adiciona(2, a3);
		
		for(int i=0;i<7;i++) {
			System.out.println("Aluno " + i + ":");
			Aluno alunoTemp = (Aluno) Vetor.pega(i);
			alunoTemp.imprimirDados();
			System.out.println(" ");
		}
		
	}
	
}

package Lista_Com_Vetor;

public class Aluno {
	
	String nome;
	String RA; 
	int idade;
	
	public Aluno(String nome, String RA, int idade) {
		this.nome=nome;
		this.RA=RA;
		this.idade=idade;
	}
	
	public void imprimirDados() {
		System.out.println("Nome : " + nome + "\n" +
						   "RA   : " + RA +
				           "Idade: " + idade);
	}
}

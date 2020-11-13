package Lista_Simplesmente_Encadeada;

public class Aluno {
	String nome;
	String RA;
	int idade;
	
	public Aluno(String nome,String RA ,int idade) {
		this.nome=nome;
		this.RA=RA;
		this.idade=idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String imprimirDados() {
		return ("Nome : " + nome + "\n" +
				"RA   : " + RA + "\n" +
				"Idade: " + idade);
	}
	
}

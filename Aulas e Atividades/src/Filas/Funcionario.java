package Filas;

public class Funcionario {
	
	private String nome;
	private String rA;
	
	public Funcionario (String nome, String rA) {
		this.nome = nome;
		this.rA = rA;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRA() {
		return rA;
	}

	public void setRA(String rA) {
		this.rA = rA;
	}
	
}

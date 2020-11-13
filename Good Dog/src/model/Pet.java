package model;

public class Pet {
	
	int numIdentificacao;
	String nome;
	int idade;
	String animal;
	String raça;
	String sexo;
	
	public Pet() {
	}//-------------------------------------------------- Construtor

	public int getNumIdentificacao() {
		return numIdentificacao;
	}

	public void setNumIdentificacao(int numIdentificacao) {
		this.numIdentificacao = numIdentificacao;
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

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}
	
	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}//------------------------------------------------------------------------ Get/Set

}

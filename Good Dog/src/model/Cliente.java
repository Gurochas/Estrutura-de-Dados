package model;

public class Cliente {
	
	String nome;
	String endere�o;
	String telefone;
	String cpf;
	int numReg;
	Lista_Pets listaPets;
	
	public Cliente() {
		listaPets = new Lista_Pets();
	}//-------------------------------------------------- Construtor
	
	public Lista_Pets getListaPets() {
		return listaPets;
	}

	public void setListaPets(Lista_Pets listaPets) {
		this.listaPets = listaPets;
	}

	public int getNumReg() {
		return numReg;
	}

	public void setNumReg(int numReg) {
		this.numReg = numReg;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndere�o() {
		return endere�o;
	}
	
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}//------------------------------------------------------------------------ Get/Set
	
}

package model;

public class Atendimento {
	
	Cliente cliente;
	String servi�o;
	
	public Atendimento(Cliente cliente, String servi�o) {
		this.cliente = cliente;
		this.servi�o = servi�o;
	}//------------------------------------------------------------------------ Construtor

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getServi�o() {
		return servi�o;
	}

	public void setServi�o(String servi�o) {
		this.servi�o = servi�o;
	}//------------------------------------------------------------------------ Get/Set
}

package model;

public class Atendimento {
	
	Cliente cliente;
	String serviço;
	
	public Atendimento(Cliente cliente, String serviço) {
		this.cliente = cliente;
		this.serviço = serviço;
	}//------------------------------------------------------------------------ Construtor

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getServiço() {
		return serviço;
	}

	public void setServiço(String serviço) {
		this.serviço = serviço;
	}//------------------------------------------------------------------------ Get/Set
}

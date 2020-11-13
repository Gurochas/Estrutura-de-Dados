package model;

public class CelulaCliente {
	
	Cliente cliente;
	CelulaCliente next;
		
	public CelulaCliente (Cliente cliente) {
		this.cliente = cliente;
		this.next = null;
	}//-------------------------------------------------- Construtor

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public CelulaCliente getNext() {
		return next;
	}

	public void setNext(CelulaCliente next) {
		this.next = next;
	}//------------------------------------------------------------------------ Get/Set
}
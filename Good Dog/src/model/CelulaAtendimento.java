package model;

public class CelulaAtendimento {
	
	Atendimento atendimento;
	CelulaAtendimento next;
	
	public CelulaAtendimento (Atendimento atendimento) {
		this.atendimento = atendimento;
		this.next = null;
	}//-------------------------------------------------- Construtor

	public Atendimento getAtendimento() {
		return atendimento;
	}

	public void setCliente(Atendimento atendimento) {
		this.atendimento = atendimento;
	}

	public CelulaAtendimento getNext() {
		return next;
	}

	public void setNext(CelulaAtendimento next) {
		this.next = next;
	}//------------------------------------------------------------------------ Get/Set
}
package model;

public class Fila_Atendimento {

	CelulaAtendimento first;
	CelulaAtendimento last;
	int size;
	
	public Fila_Atendimento() { 
		this.first = null;
		this.last = null;
		this.size = 0;
	}//-------------------------------------------------- Construtor

	public CelulaAtendimento getFirst() {
		return first;
	}

	public void setFirst(CelulaAtendimento first) {
		this.first = first;
	}

	public CelulaAtendimento getLast() {
		return last;
	}

	public void setLast(CelulaAtendimento last) {
		this.last = last;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}//------------------------------------------------------------------------ Get/Set
	
	public void add (Atendimento atendimento) {
		CelulaAtendimento temp = new CelulaAtendimento (atendimento);
		if(verfVazia()){
			setFirst(temp);
		}else {
			last.setNext(temp);
		}
		setLast(temp);		
		size++;
	}//Adiciona um atendimento no final da fila.
	
	public boolean remove () {
		CelulaAtendimento atual = first;
		if(verfVazia()) return false;
		setFirst(atual.getNext());
		size--;
		return true;
	}//Remove o atendimento da fila.
	
	public String mostraFila () {
		if (verfVazia()) return "A fila de atendimento se encontra vazia";
		String msg = "";
		for (CelulaAtendimento i = first; i != null; i=i.getNext()) {
			msg+= ("Nome do cliente: " + i.getAtendimento().getCliente().getNome() + "\nServiço: " + i.getAtendimento().getServiço() + "\n \n");
		}
		return msg;
	}//Mostra todos os elementos da fila.
	
	
	public boolean verfVazia() {
		return (this.first == null);		
	}//Verifica de a fila está vazia.
	
}
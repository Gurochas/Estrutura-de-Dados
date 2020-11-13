package model;

public class Lista_Cliente {
	CelulaCliente first;
	CelulaCliente last;
	int size;
	
	public Lista_Cliente() { 
		this.first = null;
		this.last = null;
		this.size = 0;
	}//-------------------------------------------------- Construtor
	
	public CelulaCliente getFirst() {
		return first;
	}

	public void setFirst(CelulaCliente first) {
		this.first = first;
	}

	public CelulaCliente getLast() {
		return last;
	}

	public void setLast(CelulaCliente last) {
		this.last = last;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}//------------------------------------------------------------------------ Get/Set
	
	public void addCliente (Cliente cliente) {
		CelulaCliente temp = new CelulaCliente(cliente);
		if(verfVazia()){
			setFirst(temp);
		}else {
			last.setNext(temp);
		}
		setLast(temp);		
		size++;
	}//Adiciona um cliente ao final da lista.
	
	public boolean removeCliente (String nome) {
		CelulaCliente atual = first;
		CelulaCliente ant = null;
		if(verfVazia()) return false;
		while(atual != null && !atual.getCliente().getNome().equals(nome)) {
			ant = atual;
			atual = atual.getNext();
		}
		if (atual == null) {
			return false;
		}
		if(atual == first) {
			if(atual == last) {
				setLast(null);
			}
			setFirst(first.getNext());
		}else {
			if(atual == last) {
				setLast(ant);
			}
			ant.setNext(atual.getNext());
		}
		size--;
		return true;
	}//Remove um cliente da lista.
	
	public Cliente consultaLista (String nome) {
		CelulaCliente atual = first;
		while(atual != null) {
			if (atual.getCliente().getNome().equalsIgnoreCase(nome)) return atual.getCliente();
			atual = atual.getNext();
		}
		return null;
	}//Consulta um cliente na lista pelo nome.
	
	public Cliente consultaLista (int numReg) {
		CelulaCliente atual = first;
		while(atual != null) {
			if (atual.getCliente().getNumReg() == numReg) return atual.getCliente();
			atual = atual.getNext();
		}
		return null;
	}//Consulta um cliente na lista pelo registro.
	
	public boolean existeLista (String nome) {
		CelulaCliente atual = first;
		while(atual != null) {
			if (atual.getCliente().getNome().equalsIgnoreCase(nome)) return true;
			atual = atual.getNext();
		}
		return false;
	}//Verifica se o cliente se encontra na lista.
	
	public String mostraLista () {
		String msg = "";
		for (CelulaCliente i = first; i != null; i=i.getNext()) {
			msg+= (" -> " +i.getCliente().getNome()+ "\n");
		}
		return msg;
	}//Retorna uma String contendo o nome de todos os elementos da lista.

	public boolean verfVazia() {
		return (this.first == null);		
	}//Verifica se a lista está vazia.
	
}

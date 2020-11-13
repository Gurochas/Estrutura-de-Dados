package model;

public class Lista_Pets {
	CelulaPet first;
	CelulaPet last;
	int size;
	
	public Lista_Pets() { 
		this.first = null;
		this.last = null;
		this.size = 0;
	}//-------------------------------------------------- Construtor

	public CelulaPet getFirst() {
		return first;
	}

	public void setFirst(CelulaPet first) {
		this.first = first;
	}

	public CelulaPet getLast() {
		return last;
	}

	public void setLast(CelulaPet last) {
		this.last = last;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}//------------------------------------------------------------------------ Get/Set
	
	public void addPet (Pet pet) {
		CelulaPet temp = new CelulaPet(pet);
		if(verfVazia()){
			setFirst(temp);
		}else {
			last.setNext(temp);
		}
		setLast(temp);		
		size++;
	}//Adiciona um pet ao final da lista.
	
	public boolean removePet (String nome) {
		CelulaPet atual = first;
		CelulaPet ant = null;
		if(verfVazia()) return false;
		while(atual != null && !atual.getPet().getNome().equals(nome)) {
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
	}//Remove um pet da lista.
	
	public Pet consultaLista (String nome) {
		CelulaPet atual = first;
		while(atual != null) {
			if (atual.getPet().getNome().equalsIgnoreCase(nome)) return atual.getPet();
			atual = atual.getNext();
		}
		return null;
	}//Consulta um pet na lista pelo nome.
	
	public boolean existeLista (String nome) {
		CelulaPet atual = first;
		while(atual != null) {
			if (atual.getPet().getNome().equalsIgnoreCase(nome)) return true;
			atual = atual.getNext();
		}
		return false;
	}//Verifica se o pet se encontra na lista.
	
	public String mostraLista () {
		if (verfVazia()) return "A lista de pets se encontra vazia";
		String msg = "";
		for (CelulaPet i = first; i != null; i=i.getNext()) {
			msg+= ("Nome: " + i.getPet().getNome() + "\tAnimal: " + i.getPet().getAnimal() + "\tSexo: " + i.getPet().getSexo() + " \n \n");
		}
		return msg;
	}//Retorna uma String contendo o nome/animal/sexo de todos os pets da lista.
	
	
	public boolean verfVazia() {
		return (this.first == null);		
	}//Verifica de a lista se encontra vazia.
	
}

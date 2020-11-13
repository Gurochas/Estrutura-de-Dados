package Lista_Ex01;

import Lista_Ex01.Aluno;
import Lista_Ex01.Celula;

public class ListaSimples {
	Celula First;
	Celula Last;
	int Size;
	
	public ListaSimples() { 
		this.First = null;
		this.Last = null;
		this.Size = 0;
	}

	public Celula getFirst() {
		return First;
	}

	public void setFirst(Celula first) {
		First = first;
	}

	public Celula getLast() {
		return Last;
	}

	public void setLast(Celula last) {
		Last = last;
	}

	public int getSize() {
		return Size;
	}

	public void setSize(int size) {
		Size = size;
	}//-------------------------------------------------------------------------------------------------------------------
	
	public void addLista (Aluno aluno) {
		Celula temp = new Celula(aluno);
		if(verfVazia()){
			setLast(temp);
		}
		temp.setNext(First);
		setFirst(temp);
		Size++;
	}//Adiciona um aluno a lista.
	
	public boolean removeLista (String numMatricula) {
		Celula atual = First;
		Celula ant = null;
		if(verfVazia()) return false;
		while(atual != null && !atual.getElem().getNumMatricula().equals(numMatricula)) {
			ant = atual;
			atual = atual.getNext();
		}
		if (atual == null) {
			return false;
		}
		if(atual == First) {
			if(atual == Last) {
				setLast(null);
			}
			setFirst(First.getNext());
		}else {
			if(atual == Last) {
				setLast(ant);
			}
			ant.setNext(atual.getNext());
		}
		Size--;
		return true;
	}//Remove um aluno da lista.
	
	public Aluno consultaLista (String numMatricula) {
		Celula atual = First;
		while(atual != null && !atual.getElem().getNumMatricula().equals(numMatricula)) {
			if(atual.getElem().getNumMatricula().equals(numMatricula)) return atual.Elem;
			atual = atual.getNext();
		}
		return null;
	}//Consulta a matricula na lista.

	
	public String mostraLista () {
		if (verfVazia()) return "A lista se encontra vazia";
		String msg = "";
		for (Celula i = First; i != null; i=i.getNext()) {
			msg+= (i.getElem().getNome() + " -> ");
		}
		return msg;
	}//Mostra todos os alunos da lista.
	
	
	public boolean verfVazia() {
		return (this.First == null);		
	}//Verifica se a lista está vazia.
	
}